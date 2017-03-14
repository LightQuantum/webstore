package com.edu.webstore;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String address = "http://localhost:7777/";
        ResourceConfig config = new PackagesResourceConfig("com.edu.webstore");
        HttpServer server = HttpServerFactory.create(address, config);
        server.start();
    }
}
