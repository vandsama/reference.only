package com.techelevator;

public class ReserveAuction extends Auction {

    private final int reservePrice;

    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid bid) {
        if (bid.getBidAmount() < reservePrice) {
            return false;
        }
        boolean isWinningBid = super.placeBid(bid);
        return isWinningBid;

    }

    public String toString() {
        return super.toString() + " reserve set to " + this.reservePrice;
    }

}
