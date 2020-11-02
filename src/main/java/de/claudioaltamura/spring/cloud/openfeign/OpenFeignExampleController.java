package de.claudioaltamura.spring.cloud.openfeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class OpenFeignExampleController {

    private HttpBinClient httpbinClient;

    public OpenFeignExampleController(HttpBinClient httpbinClient) {
        this.httpbinClient = httpbinClient;
    }

    @GetMapping("/decode/{encodedValue}")
    public String decode(@PathVariable("encodedValue") String encodedValue) {
        return httpbinClient.decode(encodedValue);
    }

    @GetMapping("/faulty-service")
    public String faultyService() {
        return httpbinClient.faultyService();
    }

}
