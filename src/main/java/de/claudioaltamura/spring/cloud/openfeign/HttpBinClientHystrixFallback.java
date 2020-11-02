package de.claudioaltamura.spring.cloud.openfeign;

import org.springframework.stereotype.Component;

@Component
public class HttpBinClientHystrixFallback implements HttpBinClient {

    @Override
    public String decode(String encodedValue) {
        return "default";
    }

    @Override
    public String faultyService() {
        return "default";
    }

}
