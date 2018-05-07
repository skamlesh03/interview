package com.ubs.opsit.interviews;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeConverterImpl implements TimeConverter {

	private static final Logger _LOG = LoggerFactory.getLogger(TimeConverterImpl.class);
	
	/**
	 * method used to convert the given time into Berlin Clock format.
	 * @return clock
	 */
    public String convertTime(String aTime) throws CustomException {
    	_LOG.info("START : convertTime()");
    	Clock clock = null;
    	try {
    		_LOG.info("The Given time is: "+aTime);
    		String spiltTime [] = aTime.split(":");
			int hour = Integer.valueOf(spiltTime[0]);
			int minutes = Integer.valueOf(spiltTime[1]);
			int seconds = Integer.valueOf(spiltTime[2]);
			boolean isValided  = ValidateTime.validateTime(hour, minutes, seconds);
		
			if(isValided){
				_LOG.info("Time validation is succeded");
				synchronized (this) {
					clock = new Clock(TimeUtility.secondsLightIlluminate(seconds)
											, TimeUtility.fiveHourLightIlluminate(hour)
											, TimeUtility.hourOrMinutesLightIlluminate(hour,'R')
											, TimeUtility.fiveMinuteLightIlluminate(minutes)
											, TimeUtility.hourOrMinutesLightIlluminate(minutes,'Y'));
					_LOG.info("After convert into Berlin Clock time is: "+System.lineSeparator()+clock.toString());
				}
			}else{
				_LOG.info("The Time is not valid format, Please cross verify in the .story file.");
				throw new CustomException("The Time is not valid format, Please cross verify in the .story file.");
			}
			
		} catch (NumberFormatException e) {
			_LOG.info("Characters cannot parsed into Int value, Please cross verify the Input time in .story file.");
			throw new CustomException("Please check the input time whether it has character in it", e);
		} catch (ArrayIndexOutOfBoundsException ae){
			_LOG.info("Time, Hours, and Seconds not passed in the .story file, Please pass those three input in proper format");
			throw new CustomException("Please pass the Time, Hours, and Seconds inputs properly ", ae);
		}
    	_LOG.info("END : convertTime()");
    	return clock != null ? clock.toString() : "";
    }
	
}
