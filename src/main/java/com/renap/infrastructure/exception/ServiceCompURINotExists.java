/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.infrastructure.exception;

/**
 *
 * @author edcracken
 */
public class ServiceCompURINotExists extends BaseException {

    public ServiceCompURINotExists(ComponentError error, Throwable cause) {
        super(error, cause);
    }

}
