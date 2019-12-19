package com.celsia.dinamarca.api.rest.entity;

import javax.validation.constraints.NotNull;

public class QRContent {

    @NotNull
    private String imei;

    @NotNull
    private String location;

    @NotNull
    private String qr;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }
}
