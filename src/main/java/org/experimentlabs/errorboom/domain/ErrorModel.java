package org.experimentlabs.errorboom.domain;

import java.time.LocalDateTime;

public class ErrorModel {

    private String message;
    private LocalDateTime localDatetime;



    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return LocalDateTime return the localDatetime
     */
    public LocalDateTime getLocalDatetime() {
        return localDatetime;
    }

    /**
     * @param localDatetime the localDatetime to set
     */
    public void setLocalDatetime(LocalDateTime localDatetime) {
        this.localDatetime = localDatetime;
    }

}