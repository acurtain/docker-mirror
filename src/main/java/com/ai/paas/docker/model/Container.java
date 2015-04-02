package com.ai.paas.docker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by astraea on 2015/4/2.
 */
public class Container implements Serializable {
    private String Id;
    private String Image;
    private String Command;
    private String Status;
    private List<String> Names;
    private List<PortInfo> Ports = new ArrayList<PortInfo>();
    private long Created;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getCommand() {
        return Command;
    }

    public void setCommand(String command) {
        Command = command;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public List<String> getNames() {
        return Names;
    }

    public void setNames(List<String> names) {
        Names = names;
    }

    public List<PortInfo> getPorts() {
        return Ports;
    }

    public void setPorts(List<PortInfo> ports) {
        Ports = ports;
    }

    public long getCreated() {
        return Created;
    }

    public void setCreated(long created) {
        Created = created;
    }

    @Override
    public String toString() {
        return "Containers{" +
                "Id='" + Id + '\'' +
                ", Image='" + Image + '\'' +
                ", Command='" + Command + '\'' +
                ", Status='" + Status + '\'' +
                ", Names=" + Names +
                ", Ports=" + Ports +
                ", Created=" + Created +
                '}';
    }
}
