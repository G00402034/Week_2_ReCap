package ie.atu.week2_refresher;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Product", url = "http:localhost:8081")
public interface ProductClient {

@PostMapping("/product")
    String ProductDetails(@RequestBody Product product);
}
