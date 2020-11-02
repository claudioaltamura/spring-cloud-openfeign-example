package de.claudioaltamura.spring.cloud.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "httpbin", url = "https://httpbin.org/", fallback = HttpBinClientHystrixFallback.class)
public interface HttpBinClient {

    @GetMapping("/base64/{encodedValue}")
    String decode(@PathVariable("encodedValue") String encodedValue);

    @GetMapping("/status/500")
    String faultyService();
}
