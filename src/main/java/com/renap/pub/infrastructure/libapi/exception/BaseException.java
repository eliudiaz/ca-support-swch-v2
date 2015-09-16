/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.pub.infrastructure.libapi.exception;

import com.renap.pub.infrastructure.libapi.ComponentError;

/**
 *
 * @author edcracken
 */
public class BaseException extends Exception {

    private final ComponentError error;

    public BaseException(ComponentError error, Throwable cause) {
        super(error.getMessage(), cause);
        this.error = error;
    }

    public ComponentError getError() {
        return error;
    }

}
