package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list(@RequestParam(required = false) String city,
                            @RequestParam(required = false) String state) {

        List<Hotel> hotels = hotelDao.list();

        if (city == null && state == null) {
            return hotels;
        }

        List<Hotel> matchingHotels = new ArrayList<>();
        for (Hotel h : hotels) {

            boolean cityMatches = h.getAddress().getCity().equalsIgnoreCase(city);
            boolean stateMatches = h.getAddress().getState().equalsIgnoreCase(state);

            if (cityMatches && stateMatches) {
                matchingHotels.add(h);
            } else if (city == null && stateMatches) {
                matchingHotels.add(h);
            } else if (state == null && cityMatches) {
                matchingHotels.add(h);
            }

        }
        return matchingHotels;

    }

    /**
     * Return hotel information
     *
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable(name = "id") int hotelId) {
        return hotelDao.get(hotelId);
    }

    // return all the reservations
    @GetMapping("/reservations")
    public List<Reservation> getReservations() {
        return this.reservationDao.findAll();
    }

    @GetMapping("/reservations/{id}")
    public Reservation getReservationById(@PathVariable int id) {
        return this.reservationDao.get(id);
    }

    @GetMapping("/hotels/{hotelId}/reservations")
    public List<Reservation> getReservationByHotel(@PathVariable int hotelId) {
        return this.reservationDao.findByHotel(hotelId);
    }

    @PostMapping("/reservations")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return this.reservationDao.create(reservation, reservation.getHotelID());
    }

    @PostMapping("/hotels/{id}/reservations")
    public Reservation addReservationToHotel(@RequestBody Reservation reservation,
                                             @PathVariable(name = "id") int hotelId) {
        reservation.setHotelID(hotelId);
        return this.reservationDao.create(reservation, hotelId);
    }

}
