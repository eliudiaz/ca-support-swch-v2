/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.service;

import com.renap.infrastructure.exception.BaseException;
import com.renap.infrastructure.exception.ComponentError;

/**
 *
 * @author edcracken
 */
public class NoParametersInRequestException extends BaseException {

    public NoParametersInRequestException(ComponentError error, Throwable cause) {
        super(error, cause);
    }

}
