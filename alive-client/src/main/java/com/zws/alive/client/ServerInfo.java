package com.zws.alive.client;

public class ServerInfo {
    String host;
    int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ServerInfo(String host, int port) {
        this.host = host;
        this.port = port;
    }
}
