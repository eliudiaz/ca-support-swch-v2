/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.service;

import com.renap.infrastructure.exception.JNDIComponentURINotExistsException;
import com.renap.pub.infrastructure.libapi.SwitchComponent;
import javax.ejb.Stateless;

/**
 *
 * @author edcracken
 */
@Stateless
public class SwitchJNDILocatorService {

    public SwitchComponent findComponentByURI(String uri) throws JNDIComponentURINotExistsException {
        //implementar JNDI 
        return null;
    }
}
