package com.ubs.opsit.interviews;

public class TimeUtility {

	/**
	 * method constructs the second row illumination by dividing 5 and lit the light based on the quotient from the default.
	 * @param hour
	 * @return fiveHourIlluminate
	 */
	
	public static String fiveHourLightIlluminate(int hour) {
		StringBuilder fiveHourIlluminate = new StringBuilder("OOOO");
		
		// If the hour should be greater than 0  and the quotient greater than or equal to 4 then lit the light, else not to lit 
		if( hour > 0 ){
			int quotient = hour / Time.CLK_HR_LAMP_DIVIDEND.getTime();
				if (quotient <= Time.CLK_HR_LAMP_COUNT.getTime() ){
					for (int i = 0; i < quotient; i++) {
						fiveHourIlluminate.setCharAt(i, 'R');
					}
				}
		}
		return fiveHourIlluminate.toString();
	}

	/**
	 * method constructs the fourth row illumination by dividing 5 and lit the light based 
	 * on the quotient from the default.
	 * @param hour
	 * @return fiveMinuteIllumination
	 */
	
	public static String fiveMinuteLightIlluminate(int minutes){
		StringBuilder fiveMinuteIlluminate = new StringBuilder("OOOOOOOOOOO");
		
		// If the minutes should be greater than 0  and the quotient greater than or equal to 4 then lit the light, else not to lit 
		if (minutes > 0 ) {
			int quotient = minutes / Time.CLK_HR_LAMP_DIVIDEND.getTime();
				if (quotient <= Time.CLK_MIN_LAMP_COUNT.getTime()) {
					for (int i = 0, j = 1; i < quotient; i++, j++) {
						// The below if condition used to lit the Red light by dividing 3
						if( (j % 3) == 0 ){
							fiveMinuteIlluminate.setCharAt(i, 'R');
						}else {
							fiveMinuteIlluminate.setCharAt(i, 'Y');
						}
					}
				}
		}
		return fiveMinuteIlluminate.toString();
	}
	
	/**
	 * method constructs the third and last row illumination by modulus 5 and lit the light based 
	 * on the remainder from the default for hours and minutes. 
	 * @param time
	 * @param state
	 * @return hoursOrSecondsIllumination
	 */
	public static String hourOrMinutesLightIlluminate(int time, char state){
		StringBuilder hourOrMinutesLightIlluminate  = new StringBuilder("OOOO");
		
		if (time > 0) {
			int remainder = time % Time.CLK_HR_LAMP_DIVIDEND.getTime();
				if (remainder <= Time.CLK_HR_LAMP_COUNT.getTime()) {
					for (int i = 0; i < remainder; i++) {
						hourOrMinutesLightIlluminate.setCharAt(i, state);
					}
				}
		}
		return hourOrMinutesLightIlluminate.toString();
	}
	
	/**
	 * method constructs the first row illumination based on odd or even.
	 * @param seconds
	 * @return yellowTopLamp
	 */
	public static String secondsLightIlluminate(int seconds) {
		StringBuilder yellowTopLamp = new StringBuilder("O");
		int lightStatus = seconds % Time.CLK_SEC_LAMP_COUNT.getTime();
			if (lightStatus == 0) {
				yellowTopLamp.setCharAt(0, 'Y');
			}
		return yellowTopLamp.toString();
	}
}

