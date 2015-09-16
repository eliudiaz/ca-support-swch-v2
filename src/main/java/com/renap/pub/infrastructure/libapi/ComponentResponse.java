/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.pub.infrastructure.libapi;

/**
 *
 * @author edcracken
 */
public class ComponentResponse {

    private boolean fromCache;
    private String reponse;
    private String contentType;
    private ComponentError error; // si trae valor genera http error al cliente del switch

    public boolean isFromCache() {
        return fromCache;
    }

    public void setFromCache(boolean fromCache) {
        this.fromCache = fromCache;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public ComponentError getError() {
        return error;
    }

    public void setError(ComponentError error) {
        this.error = error;
    }

}
