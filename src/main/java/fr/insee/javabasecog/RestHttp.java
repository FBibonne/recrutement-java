package fr.insee.javabasecog;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class RestHttp {


    public String get(URI uri, String bearer) throws IOException, InterruptedException {
        var client = HttpClient.newBuilder().build();
        var httpRequest = HttpRequest.newBuilder().header("Accept", "application/json")
                .header("Authorization", "Bearer "+bearer)
                .GET()
                .uri(uri)
                .build();
        return client.send(httpRequest, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)).body();
    }

}
