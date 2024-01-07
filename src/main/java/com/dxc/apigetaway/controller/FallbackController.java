package com.dxc.apigetaway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/fallbackProduct")
    public Mono<String> fallbackProduct() {
        return Mono.just("Modulo Product nao disponivel... tenta mais tarde...");
    }
}
