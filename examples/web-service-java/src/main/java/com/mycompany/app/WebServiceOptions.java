package com.mycompany.app;

import software.constructs.Construct;

public class WebServiceOptions
{
    private String image;
    private int replicas;
    private int port;
    private int containerPort;

    public WebServiceOptions(final String image, final int replicas, final int port, final int containerPort) {
        this.image = image;
        this.replicas = replicas;
        this.port = port;
        this.containerPort = containerPort;
    }

    public String getImage() {
        return this.image;
    }

    public int getReplicas() {
        return this.replicas;
    }

    public int getPort() {
        return this.port;
    }

    public int getContainerPort() {
        return this.containerPort;
    }

    public static final class Builder {
        private String image;
        private int replicas = 1;
        private int port = 80;
        private int containerPort = 8080;

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder replicas(int replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder containerPort(int containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public WebServiceOptions build() {
            return new WebServiceOptions(image, replicas, port, containerPort);
        }
    }
}
