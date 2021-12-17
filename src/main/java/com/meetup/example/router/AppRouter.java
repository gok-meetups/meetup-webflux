package com.meetup.example.router;

import com.meetup.example.handler.AppHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class AppRouter {

    private static final String BASE_PATH = "/api/functional/";

    @Bean
    public RouterFunction<ServerResponse> routes(AppHandler handler) {
        return route(GET(BASE_PATH + "character/{id}" ), handler::getCharacterById);
    }

}
