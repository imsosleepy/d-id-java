package com.example.didjava.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DidVideoGenerateRequestDto {
    private Script script;

    @JsonProperty("source_url")
    private String sourceUrl;

    @Data
    public static class Script {
        private String type;
        private String input;
        private Provider provider;
    }

    @Data
    public static class Provider {
        private String type;

        @JsonProperty("voice_id")
        private String voiceId;

        @JsonProperty("voice_config")
        private VoiceConfig voiceConfig;
    }

    @Data
    public static class VoiceConfig {
        private String style;
    }
}
