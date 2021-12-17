package com.meetup.example.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class CharacterResponse {
    private String id;
    private String name;
    private String status;
    private String species;
    private String image;
    private List<String> episode;
}
