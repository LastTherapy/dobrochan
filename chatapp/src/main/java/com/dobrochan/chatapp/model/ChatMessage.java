package com.dobrochan.chatapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatMessage {
    @JsonProperty("from")
    private String from;
    @JsonProperty("content")
    private String content;
    @JsonProperty("type")
    private String type;



    @Override
    public String toString() {
        return "ChatMessage{" +
                "from='" + from + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
