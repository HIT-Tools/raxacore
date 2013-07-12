package org.bahmni.csv.exception;

public class MigrationException extends RuntimeException {
    public MigrationException(String message, Throwable cause) {
        super(message, cause);
    }

    public MigrationException(String message) {
        super(message);
    }
}