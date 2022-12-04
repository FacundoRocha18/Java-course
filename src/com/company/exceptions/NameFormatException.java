package com.company.exceptions;

import java.util.Scanner;

public class NameFormatException extends Exception {

    private static final long serialVersionUID = 1L;

    public NameFormatException(String message) {
        super(message);
    }
}
