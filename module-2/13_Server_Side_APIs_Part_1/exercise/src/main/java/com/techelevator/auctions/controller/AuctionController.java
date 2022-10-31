package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//create the methods for the API
// '/auctions' is the base path for all the request mappings defined in this controller
@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

//Create a method named list() that returns a List<Auction>.
//Then add the @RequestMapping annotation to have this method respond to GET requests for /auctions.
//Look in MemoryAuctionDao.java for a method that returns all auctions. --"list()"

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(defaultValue = "") String title_like,
                              @RequestParam(defaultValue = "0") double currentBid_lte) {
        if (!title_like.isEmpty() && currentBid_lte != 0) {
            return dao.searchByTitleAndPrice(title_like, currentBid_lte);
        } else if (!title_like.isEmpty()) {
            return dao.searchByTitle(title_like);
        } else if (currentBid_lte != 0) {
            return dao.searchByPrice(currentBid_lte);
        }
        return dao.list();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return dao.get(id);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        if (auction != null) {
            return dao.create(auction);
        }
        return null;
    }

}
