package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

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
            return hotelDao.list();
        }

        List<Hotel> matchingHotels = new ArrayList<>();
        for (Hotel h : hotels) {
            if (h.getAddress().getCity().equalsIgnoreCase(city)) {
                matchingHotels.add(h);
            }
        }
        return matchingHotels;



        if (city != null && state == null) {

        }

        if (city == null && state != null) {
            List<Hotel> matchingHotels = new ArrayList<>();
            for (Hotel h : hotels) {
                if (h.getAddress().getState().equalsIgnoreCase(state)) {
                    matchingHotels.add(h);
                }
            }
            return matchingHotels;
        }





        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param hotelId the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int hotelId) {
        return hotelDao.get(hotelId);
    }

    // return all the reservations
    @GetMapping("/reservations")
    public List<Reservation> getReservations() {
        return this.reservationDao.findAll();
    }

    // get reservation by id
    @GetMapping("/reservation/{id}")
    public Reservation getReservationById(@PathVariable int id) {
        return this.reservationDao.get(id);
    }

    @GetMapping("/hotels/{hotel id}/reservations")
    public List<Reservation> getReservationByHotel(@PathVariable int hotelId) {
        return this.reservationDao.findByHotel(hotelId);
    }

    @GetMapping("/reservations")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return this.reservationDao.create(reservation,reservation.getHotelID());
    }

    @PostMapping("/hotels/{id}/reservations")
    public Reservation addReservationToHotel(@RequestBody Reservation reservation,
                                             @PathVariable(name = "id") int hotelId) {
        reservation.setHotelID(hotelId);
        return this.reservationDao.create(reservation, hotelId);
    }



}
