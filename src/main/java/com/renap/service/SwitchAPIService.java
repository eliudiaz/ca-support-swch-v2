/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.service;

import com.renap.domain.SwchServicio;
import com.renap.domain.dao.ServiciosDao;
import com.renap.infrastructure.exception.CompConfigURIAccessNotAllowed;
import com.renap.infrastructure.exception.InsecureParameterException;
import com.renap.infrastructure.exception.NoBalanceException;
import com.renap.infrastructure.exception.ServiceCompURINotExists;
import com.renap.infrastructure.exception.ServiceURINotExistsException;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.core.MultivaluedMap;

/**
 *
 * @author edcracken
 */
@Stateless
public class SwitchAPIService {

    @EJB
    ServiciosDao dao;

    public SwchServicio getServicioByURI(String uri) throws ServiceURINotExistsException {
        return null;

    }

    public String validateServiceRequest(SwchServicio service, String compConfigUri) throws ServiceCompURINotExists, CompConfigURIAccessNotAllowed {
        if (service.getCompConfigURIDef() == null || service.getCompConfigURIDef().isEmpty()
                && compConfigUri == null || compConfigUri.isEmpty()) {
            throw new ServiceCompURINotExists(null, null);
        } else if (service.getCompConfigURIDef() == null || service.getCompConfigURIDef().isEmpty()) {
            validateCompConfigURIPermission(compConfigUri);
        }
        return compConfigUri == null || compConfigUri.isEmpty() ? compConfigUri : service.getCompConfigURIDef();
    }

    private void validateCompConfigURIPermission(String compConfigUri) throws CompConfigURIAccessNotAllowed {
        throw new CompConfigURIAccessNotAllowed(null, null);
    }

    public void registrarConsumo(Integer servicio, Integer entidad) throws NoBalanceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void verificarParametros(SwchServicio servicio, MultivaluedMap<String, String> params) throws InsecureParameterException, NoParametersInRequestException {
        if (params == null || params.isEmpty() && !servicio.isSinParametros()) {
            throw new NoParametersInRequestException(null, null);
        }
        //si hay amenaza de sql injection u otro indicio
        throw new InsecureParameterException(null, null);
    }

}
