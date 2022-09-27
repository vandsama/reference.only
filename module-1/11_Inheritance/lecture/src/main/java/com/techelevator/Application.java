package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech ELevator t-shirt");

        placeBid(generalAuction, new Bid("Josh, 1"));
        placeBid(generalAuction, new Bid("Fonz, 23"));
        placeBid(generalAuction, new Bid("Rick Astley, 13"));

        System.out.println("\n===================");
        Auction reserve = new ReserveAuction("mug", 25);
        placeBid(reserve, new Bid("shelby, 1"));
        placeBid(reserve, new Bid("carly, 24"));
        placeBid(reserve, new Bid("mike, 26"));
        placeBid(reserve, new Bid("monika, 30"));

        System.out.println("\n===================");
        Auction buy = new BuyoutAuction("marker", 100);
        placeBid(buy, new Bid("Ray", 50)); // winning? yes
        placeBid(buy, new Bid("Nick", 99)); // winning? yes
        placeBid(buy, new Bid("Jeff", 105)); // winning? yes Item was sold!!
        placeBid(buy, new Bid("Alex", 125)); // winning? no

    }

    public static void placeBid(Auction auction, Bid theBid) {
        System.out.println(auction);
        String result = (auction.placeBid(theBid)) ? "Yes" : "No";
        // mike bid $$ on ?. Winning? ??
        System.out.printf("%s on %s. winning? %s\n"),
                theBid,
                auction.getItemForSale(),
                result);
    }
}
