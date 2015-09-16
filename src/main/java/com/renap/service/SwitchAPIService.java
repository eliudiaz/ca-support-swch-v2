/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.service;

import com.renap.domain.SwchServicio;
import com.renap.domain.dao.ServiciosDao;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author edcracken
 */
@Stateless
public class SwitchAPIService {

    @EJB
    ServiciosDao dao;

    public SwchServicio getServicioByURI(String uri) {
        return null;

    }
}
