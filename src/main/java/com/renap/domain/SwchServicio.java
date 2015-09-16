/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.domain;

/**
 *
 * @author edcracken
 */
public class SwchServicio {

    private Integer id;

    //mapear todos los campos de la tabla swch_servicios
    //configuracion de componente por default
    private String compConfigURIDef;
    //puede invocar cualquier configuracion del componente
    private boolean sinRestriccionCompConfig;
    private boolean sinCache;
    private boolean sinPagoAutomatico;
    private boolean sinParametros;
    private SwchComponente componente;
    private SwchEntidad entidad;

    public boolean isSinParametros() {
        return sinParametros;
    }

    public void setSinParametros(boolean sinParametros) {
        this.sinParametros = sinParametros;
    }

    public boolean isSinPagoAutomatico() {
        return sinPagoAutomatico;
    }

    public void setSinPagoAutomatico(boolean sinPagoAutomatico) {
        this.sinPagoAutomatico = sinPagoAutomatico;
    }

    public boolean isSinCache() {
        return sinCache;
    }

    public void setSinCache(boolean sinCache) {
        this.sinCache = sinCache;
    }

    public SwchEntidad getEntidad() {
        return entidad;
    }

    public void setEntidad(SwchEntidad entidad) {
        this.entidad = entidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isSinRestriccionCompConfig() {
        return sinRestriccionCompConfig;
    }

    public void setSinRestriccionCompConfig(boolean sinRestriccionCompConfig) {
        this.sinRestriccionCompConfig = sinRestriccionCompConfig;
    }

    public String getCompConfigURIDef() {
        return compConfigURIDef;
    }

    public void setCompConfigURIDef(String compConfigURIDef) {
        this.compConfigURIDef = compConfigURIDef;
    }

    public SwchComponente getComponente() {
        return componente;
    }

    public void setComponente(SwchComponente componente) {
        this.componente = componente;
    }

}
