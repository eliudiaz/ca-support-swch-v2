/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.infrastructure.exception;

/**
 * Si el servicio espera parametros y no vienen en el query
 *
 * @author edcracken
 */
public class ParameterRequiredException extends BaseException {

    public ParameterRequiredException(ComponentError error, Throwable cause) {
        super(error, cause);
    }

}
