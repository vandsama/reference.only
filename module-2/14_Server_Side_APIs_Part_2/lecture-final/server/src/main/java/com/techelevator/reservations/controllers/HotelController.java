package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController(HotelDao hotelDao, ReservationDao reservationDao) {
        this.hotelDao = hotelDao;
        this.reservationDao = reservationDao;
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        Hotel hotel = hotelDao.get(id);

        if (hotel == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "no hotel with that id");
        }

        return hotel;
    }

    /**
     * Returns all reservations in the system
     *
     * @return all reservations
     */
    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations() {
        return reservationDao.findAll();
    }

    /**
     * Get a reservation by its id
     *
     * @param id
     * @return a single reservation
     */
    @RequestMapping(path = "reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id) {
        Reservation reservation = reservationDao.get(id);

        if (reservation == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "unknown reservation");
        }

        return reservation;
    }

    /**
     * List of reservations by hotel
     *
     * @param hotelID
     * @return all reservations for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservationsByHotel(@PathVariable("id") int hotelID) {
        List<Reservation> reservations = reservationDao.findByHotel(hotelID);

        if (reservations == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "unknown hotel");
        }

        return reservations;
    }

    /**
     * Create a new reservation for a given hotel
     *
     * @param reservation
     */
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@Valid @RequestBody Reservation reservation) {

        Hotel hotel = this.hotelDao.get(reservation.getHotelID());
        if (hotel == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "what up? no hotel with that ID");
        }

        return reservationDao.create(reservation, reservation.getHotelID());
    }

    /**
     * /hotels/filter?state=oh&city=cleveland
     *
     * @param state the state to filter by
     * @param city  the city to filter by
     * @return a list of hotels that match the city & state
     */
    @RequestMapping(path = "/hotels/filter", method = RequestMethod.GET)
    public List<Hotel> filterByStateAndCity(@RequestParam String state, @RequestParam(required = false) String city) {

        List<Hotel> filteredHotels = new ArrayList<>();
        List<Hotel> hotels = list();

        // return hotels that match state
        for (Hotel hotel : hotels) {

            // if city was passed we don't care about the state filter
            if (city != null) {
                if (hotel.getAddress().getCity().toLowerCase().equals(city.toLowerCase())) {
                    filteredHotels.add(hotel);
                }
            } else {
                if (hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
                    filteredHotels.add(hotel);
                }

            }
        }

        return filteredHotels;
    }



    // update a reservation
    @RequestMapping(path = "/reservations/{rid}", method = RequestMethod.PUT)
    public Reservation update(@Valid @RequestBody Reservation reservation, @PathVariable int rid) {
        Reservation r = this.reservationDao.get(rid);
        if (r == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "not found");
        }
        Reservation updateReservation = this.reservationDao.update(reservation, rid);
        return updateReservation;
    }

    // delete a reservation
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/reservations/{rid}")
    public void delete(@PathVariable int rid) {
        Reservation reservation = this.reservationDao.get(rid);
        if (reservation == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "not found");
        }
        this.reservationDao.delete(rid);
    }

}
