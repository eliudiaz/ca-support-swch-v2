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
public class ComponentError {

    private Integer httpError;
    private String reason;
    private String message;

    public Integer getHttpError() {
        return httpError;
    }

    public void setHttpError(Integer httpError) {
        this.httpError = httpError;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
