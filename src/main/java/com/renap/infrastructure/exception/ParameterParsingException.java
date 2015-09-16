/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.infrastructure.exception;

/**
 * Si el parametro procesado no cumple con estandares de seguridad contra sql
 * injection y otras vulnerabilidades
 *
 *
 * @author edcracken
 */
public class ParameterParsingException extends BaseException {

    public ParameterParsingException(ComponentError error, Throwable cause) {
        super(error, cause);
    }

}
