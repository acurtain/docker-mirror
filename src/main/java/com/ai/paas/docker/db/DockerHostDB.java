package com.ai.paas.docker.db;

import org.springframework.stereotype.Component;

/**
 * Created by astraea on 2015/4/2.
 */
@Component
public class DockerHostDB {
    private String dockerHost = "http://192.168.1.115:4243";

    public String getDockerHost() {
        return dockerHost;
    }

    public void setDockerHost(String dockerHost) {
        this.dockerHost = dockerHost;
    }
}
