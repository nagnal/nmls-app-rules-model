package org.csbs.nmls.model;

import java.util.ArrayList;
import java.util.List;

public class BondCoverageDetails {

	private String state;
	private boolean returnAllRagesFlag;
	private double bondValue;
	private double coverageAmount;
	
	private List<BondRange> bondRanges = new ArrayList<BondRange> ();

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the returnAllRagesFlag
	 */
	public boolean isReturnAllRagesFlag() {
		return returnAllRagesFlag;
	}

	/**
	 * @param returnAllRagesFlag the returnAllRagesFlag to set
	 */
	public void setReturnAllRagesFlag(boolean returnAllRagesFlag) {
		this.returnAllRagesFlag = returnAllRagesFlag;
	}

	/**
	 * @return the bondValue
	 */
	public double getBondValue() {
		return bondValue;
	}

	/**
	 * @param bondValue the bondValue to set
	 */
	public void setBondValue(double bondValue) {
		this.bondValue = bondValue;
	}

	/**
	 * @return the coverageAmount
	 */
	public double getCoverageAmount() {
		return coverageAmount;
	}

	/**
	 * @param coverageAmount the coverageAmount to set
	 */
	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	/**
	 * @return the bondRanges
	 */
	public List<BondRange> getBondRanges() {
		return bondRanges;
	}

	/**
	 * @param bondRanges the bondRanges to set
	 */
	public void setBondRanges(List<BondRange> bondRanges) {
		this.bondRanges = bondRanges;
	}
	
	/**
	 * @param bondRanges the bondRanges to add
	 */
	public void addBondRange(BondRange bondRange) {
		this.bondRanges.add(bondRange);
		// The following code is toset the basic coverage amount for a given bond value
//		if (bondValue >= bondRange.getFrom() && bondValue <= bondRange.getUpTo()) {
//			this.coverageAmount = bondRange.getBasicCoverage();
//		}
	}

	@Override
	public String toString() {
		return "BondCoverageDetails [state=" + state + ", returnAllRagesFlag=" + returnAllRagesFlag + ", rangeAmount="
				+ bondValue + ", bondRanges=" + bondRanges + "]";
	}
}
