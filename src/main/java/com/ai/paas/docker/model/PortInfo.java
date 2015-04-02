package com.ai.paas.docker.model;

import java.io.Serializable;

/**
 * Created by astraea on 2015/4/2.
 */
public class PortInfo implements Serializable {
    private String PrivatePort;
    private String PublicPort;
    private String Type;

    public String getPrivatePort() {
        return PrivatePort;
    }

    public void setPrivatePort(String privatePort) {
        PrivatePort = privatePort;
    }

    public String getPublicPort() {
        return PublicPort;
    }

    public void setPublicPort(String publicPort) {
        PublicPort = publicPort;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "PortInfo{" +
                "PrivatePort='" + PrivatePort + '\'' +
                ", PublicPort='" + PublicPort + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
