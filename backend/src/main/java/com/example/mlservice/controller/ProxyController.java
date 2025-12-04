package com.example.mlservice.controller;

import com.example.mlservice.service.MLProxyService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * Contrôleur REST pour exposer les endpoints de prédiction ML.
 */
@RestController
@RequestMapping("/api/predict")
@CrossOrigin(origins = "*")
public class ProxyController {

    private final MLProxyService mlService;

    public ProxyController(MLProxyService mlService) {
        this.mlService = mlService;
    }

    /**
     * Endpoint pour prédire les dépenses en fonction de l'âge et du revenu.
     */
  @PostMapping("/spending")
public Mono<Double> predictSpending(@RequestBody CustomerRequest req) {
    return mlService.predictSpending((int) req.getAge(), (int) req.getIncome());
}

@PostMapping("/cluster")
public Mono<Integer> predictCluster(@RequestBody CustomerRequest req) {
    return mlService.predictCluster((int) req.getAge(), (int) req.getIncome());
}

}
