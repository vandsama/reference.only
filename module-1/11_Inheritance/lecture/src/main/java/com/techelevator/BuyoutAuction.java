package com.techelevator;

public class BuyoutAuction extends Auction{
    private final int buyPrice;

    public BuyoutAuction(String itemForSale, int buyPrice) {
        super(itemForSale);
        this.buyPrice = buyPrice;
    }


    @Override
    public boolean placeBid(Bid offeredBid) {
        if (this.isSold) {
            return false;
        }

        Bid bid = offeredBid;
        if (offeredBid.getBidAmount() > buyPrice) {
            bid = new Bid(offeredBid.getBidder(), buyPrice);
        }
        return super.placeBid(bid);

    }
}
