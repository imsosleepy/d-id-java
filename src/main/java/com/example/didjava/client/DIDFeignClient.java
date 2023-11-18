package com.example.didjava.client;

import com.example.didjava.model.DidVideoGenerateRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "didClient", url = "https://api.d-id.com", configuration = {DIdRequestHeader.class})
public interface DIDFeignClient {
    @PostMapping("/talks")
    Object generateDidTalksVideo(@RequestBody Object didVideoGenerateRequestDto);

    @GetMapping("/talks/{id}")
    Object getDidTalksVideo(@PathVariable String id);
}
