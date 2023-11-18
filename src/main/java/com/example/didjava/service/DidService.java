package com.example.didjava.service;

import com.example.didjava.client.DIDFeignClient;
import com.example.didjava.model.DidVideoGenerateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DidService {
    private final DIDFeignClient didFeignClient;
    public Object generateVideo(Object didVideoGenerateRequestDto) {
        return didFeignClient.generateDidTalksVideo(didVideoGenerateRequestDto);
    }

    public Object getVideo(String id) {
        return didFeignClient.getDidTalksVideo(id);
    }
}
