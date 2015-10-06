package com.cric.player.exceptions;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BadRequestException() {
		super();
	}

	public BadRequestException(String string) {
		super(string);
	}

}
