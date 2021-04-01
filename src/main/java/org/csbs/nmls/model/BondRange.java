package org.csbs.nmls.model;

public class BondRange {
	private double from;
	private double upTo;
	private double basicCoverage;

	/**
	 * @return the from
	 */
	public double getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(double from) {
		this.from = from;
	}
	/**
	 * @return the upTo
	 */
	public double getUpTo() {
		return upTo;
	}
	/**
	 * @param upTo the upTo to set
	 */
	public void setUpTo(double upTo) {
		this.upTo = upTo;
	}
	/**
	 * @return the basicCoverage
	 */
	public double getBasicCoverage() {
		return basicCoverage;
	}

	/**
	 * @param basicCoverage the basicCoverage to set
	 */
	public void setBasicCoverage(double basicCoverage) {
		this.basicCoverage = basicCoverage;
	}

	@Override
	public String toString() {
		return "BondRange [from=" + from + ", upTo=" + upTo + ", coverageAmount=" + basicCoverage + "]";
	}
}
