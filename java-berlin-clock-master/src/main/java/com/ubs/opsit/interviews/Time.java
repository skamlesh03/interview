package com.ubs.opsit.interviews;

public enum Time {

	CLK_HR_LAMP_DIVIDEND(5),
	CLK_HR_LAMP_COUNT(4),
	CLK_MIN_LAMP_COUNT(11),
	CLK_SEC_LAMP_COUNT(2),
	HR_FORMAT(24),
	MIN_SEC_FORMAT(60);
	
	/**
	 * Time attribute used to get the time format
	 */
	
	private int time;
	
	/**
	 * Construct time
	 * @param time
	 */
	private Time(int time) {
		this.time = time;
	}

	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}
}

