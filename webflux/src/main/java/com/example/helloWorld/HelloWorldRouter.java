package com.example.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import com.example.helloWorld.HelloWorldHandler;

@Configuration(proxyBeanMethods = false)
public class HelloWorldRouter {
    @Bean
    public RouterFunction<ServerResponse> route(HelloWorldHandler handler) {
        return RouterFunctions
                .route(GET("/hello").and(accept(MediaType.APPLICATION_JSON)), handler::helloWorld);
    }
}