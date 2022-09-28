package com.example.springboard.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SpringBoardProVO {

    @JsonProperty(value="id")
    private String id;

    @JsonProperty(value="subject")
    private String subject;

    @JsonProperty(value="text")
    private String text;

    @JsonProperty(value="tag")
    private String tag;
}
