package edu.miu.lab3springdata.util.http;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class HttpErrorInfo {

    private final ZonedDateTime timestamp;

    private final String path;

    private final HttpStatus httpStatus;

    private final String message;

    public HttpErrorInfo(HttpStatus httpStatus, String path, String message) {
        this.timestamp = ZonedDateTime.now();
        this.httpStatus = httpStatus;
        this.path = path;
        this.message = message;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public String getPath() {
        return path;
    }

    public int getStatus() {
        return httpStatus.value();
    }

    public String getMessage() {
        return message;
    }

    public String getError() {
        return httpStatus.getReasonPhrase();
    }
}