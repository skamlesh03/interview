package com.ubs.opsit.interviews;
import org.apache.commons.lang.text.StrBuilder;

public class Clock {
	
	/**
	 * secondsLight attribute is the top yellow lamp of the Berlin clock and represents seconds.
	 */
	
	private String secondsLight;
	
	/**
	 * fiveHourLight attribute is the red lamp of the Berlin clock second row and indicates 5 hours.
	 */
	
	private String fiveHourLight;
	
	/**
	 * oneHourLight attribute is red lamp of the Berlin clock third row and indicates 1 hours.
	 */
	
	private String oneHourLight;
	
	/**
	 * fiveMinuteLight attribute is both red and yellow lamp of the Berlin clock fourth row, indicates 1 hours each yellow lamp, and 5 hours each red lamp.
	 */
	
	private String fiveMinuteLight;
	
	/**
	 * oneMinuteLight attribute has the bottom yellow lamp of the Berlin clock represents one minute.
	 */
	
	private String oneMinuteLight;
	
	/**
	 * Clock constructor accepts below parameters
	 * @param secondsLight
	 * @param fiveHourLight
	 * @param oneHourLight
	 * @param fiveMinuteLight
	 * @param oneMinuteLight
	 */
	public Clock(String secondsLight, String fiveHourLight, String oneHourLight, 
			String fiveMinuteLight,String oneMinuteLight) {
		this.secondsLight = secondsLight;
		this.fiveHourLight = fiveHourLight;
		this.oneHourLight = oneHourLight;
		this.fiveMinuteLight = fiveMinuteLight;
		this.oneMinuteLight = oneMinuteLight;
	}
	
	/**
	 * @return secondsLight
	 */
	public String getSecondsLight() {
		return secondsLight;
	}
	
	/**
	 * @param secondsLight
	 */
	public void setSecondsLight(String secondsLight) {
		this.secondsLight = secondsLight;
	}
	
	/**
	 * @return fiveHourLight
	 */
	
	public String getFiveHourLight() {
		return fiveHourLight;
	}
	
	/**
	 * @param fiveHourLight
	 */
	
	public void setFiveHourLight(String fiveHourLight) {
		this.fiveHourLight = fiveHourLight;
	}
	
	/**
	 * @return oneHourLight
	 */
	
	public String getOneHourLight() {
		return oneHourLight;
	}
	
	/**
	 * @param oneHourLight
	 */
	
	public void setOneHourLight(String oneHourLight) {
		this.oneHourLight = oneHourLight;
	}
	
	/**
	 * @return fiveMinuteLight
	 */
	
	public String getFiveMinuteLight() {
		return fiveMinuteLight;
	}
	
	/**
	 * @param fiveMinuteLight
	 */
	
	public void setFiveMinuteLight(String fiveMinuteLight) {
		this.fiveMinuteLight = fiveMinuteLight;
	}
	
	/**
	 * @return oneMinuteLight
	 */
	
	public String getOneMinuteLight() {
		return oneMinuteLight;
	}
	
	/**
	 * @param oneMinuteLight
	 */
	
	public void setOneMinuteLight(String oneMinuteLight) {
		this.oneMinuteLight = oneMinuteLight;
	}
	
	@Override
	public String toString(){
		return new StrBuilder().appendWithSeparators(new String[]{ secondsLight, fiveHourLight, oneHourLight, 
	    				fiveMinuteLight, oneMinuteLight },System.lineSeparator()).toString();
	}
	
}
