package com.morningstar.flux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SuppressWarnings("ALL")
@RestController
public class FluxTesting {
    @GetMapping("/hello")
    public Mono<String> hello(){
        return Mono.just("OK la");
    }
}
