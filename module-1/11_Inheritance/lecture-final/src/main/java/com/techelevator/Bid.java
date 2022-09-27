package com.techelevator;

public class Bid extends Object {

	private String bidder;
	private int bidAmount;

	public Bid(String bidder, int bidAmount) {
		this.bidder = bidder;
		this.bidAmount = bidAmount;
	}

	public String getBidder() {
		return bidder;
	}

	public int getBidAmount() {
		return bidAmount;
	}

	public static Bid emptyBid() {
		return new Bid("", 0);
	}

	@Override
	public String toString() {
		return this.bidder + " bid " + this.getBidAmount();
	}

	public int compareTo(Bid other) {
		if (other == null) {
			return 1;
		}

		if (this == other) {
			return 0;
		}

		if (this.getBidAmount() == other.getBidAmount()) {
			return 0;
		} else if (this.getBidAmount() < other.getBidAmount()) {
			return -1;
		} else {
			return 1;
		}

	}
}
