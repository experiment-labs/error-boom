package org.experimentlabs.errorboom;

import org.apache.http.HttpStatus;
import org.experimentlabs.errorboom.domain.ErrorModel;

public class ErrorBoom 
{
    private Integer status;
    private ErrorModel errorModel;
    
    public void badRequest(String message) {
        this.status = HttpStatus.SC_BAD_REQUEST;
        this.errorModel.setMessage(message);
    }
}
