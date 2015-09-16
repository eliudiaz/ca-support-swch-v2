/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.pub.infrastructure.dto;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edcracken
 */
public class SwitchResponse implements Serializable {

    String content;
    List<SwitchError> errors = new LinkedList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<SwitchError> getErrors() {
        return errors;
    }

    public void setErrors(List<SwitchError> errors) {
        this.errors = errors;
    }

}
