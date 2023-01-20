package com.gpa.receitasrestapi.clienthttp;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientHttp {

    public ClientHttp() {
    }

    public String requestReceitas(String param) throws IOException, InterruptedException {
        HttpRequest requestGet= HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://forkify-api.herokuapp.com/api/search?q="+param))
                .headers("Accept", "application/json")
                .build();

        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<String> response = client.send(requestGet, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }



}
