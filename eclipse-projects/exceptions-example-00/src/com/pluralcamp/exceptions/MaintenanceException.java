package com.pluralcamp.exceptions;

import java.io.IOException;

public class MaintenanceException extends IOException {

	private static final long serialVersionUID = 1L;

	public MaintenanceException(String message) {
		super(message);
	}
}
