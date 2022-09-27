package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Auction {

	private String itemForSale;
	private Bid currentHighBid;
	private List<Bid> allBids;
	protected String myProtectedMember = "protected";

	public Auction(String itemForSale) {
		this.itemForSale = itemForSale;
		this.currentHighBid = Bid.emptyBid();
		allBids = new ArrayList<>();
	}

	public boolean placeBid(Bid offeredBid) {
		allBids.add(offeredBid);
		boolean isCurrentWinningBid = false;
		if (offeredBid.compareTo(currentHighBid) > 0) {
			currentHighBid = offeredBid;
			isCurrentWinningBid = true;
		}
		return isCurrentWinningBid;
	}

	public Bid getHighBid() {
		return currentHighBid;
	}

	public List<Bid> getAllBids() {
		return new ArrayList<>(allBids);
	}

	public String getItemForSale() {
		return itemForSale;
	}

	public String toString() {
		return "bidding on a " + this.getItemForSale();
	}
}
