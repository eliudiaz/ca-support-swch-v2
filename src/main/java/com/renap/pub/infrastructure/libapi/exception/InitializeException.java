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
public class InitializeException extends BaseException {

    public InitializeException(ComponentError error, Throwable cause) {
        super(error, cause);
    }

}
