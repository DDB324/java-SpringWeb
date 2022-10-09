package com.example.springboot;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.NoArgsConstructor
@lombok.Data
public class MyParam {

    /**
     * title
     */
    @JsonProperty("title")
    private String title;
    /**
     * body
     */
    @JsonProperty("body")
    private String body;
    /**
     * assignees
     */
    @JsonProperty("assignees")
    private List<String> assignees;
    /**
     * milestone
     */
    @JsonProperty("milestone")
    private Integer milestone;
    /**
     * labels
     */
    @JsonProperty("labels")
    private List<String> labels;
}
