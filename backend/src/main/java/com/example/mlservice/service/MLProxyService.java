package com.example.mlservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.Map;

/**
 * Service pour communiquer avec l'API Machine Learning.
 */
@Service
public class MLProxyService {

    private final WebClient webClient;
    private final String mlApiUrl;

    public MLProxyService(WebClient webClient, @Value("${ml.api.url}") String mlApiUrl) {
        this.webClient = webClient;
        this.mlApiUrl = mlApiUrl;
    }

    public Mono<Double> predictSpending(double age, double income) {
        return webClient.post()
                .uri(mlApiUrl + "/predict/spending")
                .bodyValue(Map.of("age", age, "income", income))
                .retrieve()
                .bodyToMono(Map.class)
                .map(m -> ((Number)m.get("spending")).doubleValue());
    }

    public Mono<Integer> predictCluster(double age, double income) {
        return webClient.post()
                .uri(mlApiUrl + "/predict/cluster")
                .bodyValue(Map.of("age", age, "income", income))
                .retrieve()
                .bodyToMono(Map.class)
                .map(m -> ((Number)m.get("cluster")).intValue());
    }
}

