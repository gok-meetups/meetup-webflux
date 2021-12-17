package com.meetup.example.handler;

import com.meetup.example.client.RickAndMortyClient;
import com.meetup.example.response.CharacterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class AppHandler {

    @Autowired
    private RickAndMortyClient rickAndMortyClient;

    public Mono<ServerResponse> getCharacterById(ServerRequest req) {
        final String id = req.pathVariable("id");
        return ServerResponse.ok().body(rickAndMortyClient.findACharacterById(id), CharacterResponse.class);
    }
}