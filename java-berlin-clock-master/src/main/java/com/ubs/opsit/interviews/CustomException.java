package com.ubs.opsit.interviews;

public class CustomException extends Exception{

	/**
	 * The Default Serial Version Id
	 */
	
	private static final long serialVersionUID = 6836093199350008769L;
	
	/**
	 * The message attribute has error message to display in the console.
	 */
	
	private String message;
	
	/**
	 * The default construct to create instance.
	 */
	
	public CustomException() {
		super();
	}
	
	/**
	 * constructor accepts parameter and display error trace.
	 * 
	 * @param message
	 */
	
	public CustomException(String message) {
		super(message);
		this.message = message;
	}
	
	/**
	 * constructor accepts message and Throwable parameters, and display error trace.
	 * 
	 * @param message
	 * @param cause
	 */
	
	public CustomException(String message,Throwable cause) {
		super(message,cause);
		this.message = message;
	}

	/**
	 * @return the message
	 */
	
	public String getMessage() {
		return message;
	}
	
}

