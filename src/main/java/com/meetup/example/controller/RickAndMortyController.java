package com.meetup.example.controller;

import com.meetup.example.client.RickAndMortyClient;
import com.meetup.example.response.CharacterResponse;
import com.meetup.example.response.EpisodeResponse;
import com.meetup.example.response.ListOfEpisodesResponse;
import com.meetup.example.response.LocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
@AllArgsConstructor
public class RickAndMortyController {

    private RickAndMortyClient rickAndMortyClient;


    @GetMapping("/character/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<CharacterResponse> getCharacterById(@PathVariable String id) {
        return rickAndMortyClient.findACharacterById(id);

    }


    @GetMapping("/location/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<LocationResponse> getLocationById(@PathVariable String id) {
        return rickAndMortyClient.findALocationById(id);

    }


    @GetMapping("/episode/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<EpisodeResponse> getEpisodeById(@PathVariable String id) {
        return rickAndMortyClient.findAEpisodeById(id);

    }


    @GetMapping("/episodes")
    @ResponseStatus(HttpStatus.OK)
    public Flux<ListOfEpisodesResponse> ListAllEpisodes() {
        return rickAndMortyClient.ListAllEpisodes();

    }
}
