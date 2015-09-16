/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.pub.infrastructure.libapi;

import com.renap.pub.infrastructure.libapi.exception.InitializeException;
import com.renap.pub.infrastructure.libapi.exception.InvokeException;
import java.util.List;

/**
 *
 * @author edcracken
 */
public interface SwitchComponent {

    /**
     * flag de inicializacion
     *
     * @return
     */
    public boolean isInitRequired();

    /**
     * Si el recurso a consumir requiere inicializacion se envian los valores
     * descritos
     *
     * @param entity
     * @param serviceId
     * @throws com.renap.pub.infrastructure.libapi.exception.InitializeException
     */
    public abstract void init(Integer entity, Integer serviceId) throws InitializeException;

    /**
     * invocacion remota realizada por el switch
     *
     * @param params listado de parametros
     * @param caching permitir que venga del cache
     * @param paid switch ya realizo el registro de consumo a tarificador
     * @return
     * @throws com.renap.pub.infrastructure.libapi.exception.InvokeException
     */
    public abstract ComponentResponse remoteInvoke(List<ComponentParam> params, boolean caching, boolean paid) throws InvokeException;

}
