package org.sarp.ats.urlsigner.exception;

public class UrlSignException extends RuntimeException {

    public UrlSignException(String message) {
        super(message);
    }

    public UrlSignException(String message, Throwable cause) {
        super(message, cause);
    }
}
