package org.experimentlabs.errorboom.exceptions;

import org.experimentlabs.errorboom.domain.ErrorModel;

public class BadRequestException extends Exception {
 
    private ErrorModel model;
}