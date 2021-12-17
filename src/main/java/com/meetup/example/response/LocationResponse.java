package com.meetup.example.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LocationResponse {
    private String id;
    private String name;
    private String type;
    private List<String> residents;
    private String url;
}
