package com.ubs.opsit.interviews;

public class ValidateTime {
	/**
	 * method used to validate the given time in .story file.
	 * @param hour
	 * @param minutes
	 * @param seconds
	 * @return isValidTime
	 */
	public static boolean validateTime(int hour, int minutes, int seconds){
		
		boolean isValidTime = false;
		
		if( hour <= Time.HR_FORMAT.getTime() && minutes <= Time.MIN_SEC_FORMAT.getTime() 
				&& seconds <= Time.MIN_SEC_FORMAT.getTime()){
			isValidTime = true;
		}
		return isValidTime;
	}

}
