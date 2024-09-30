package ie.atu.week2_refresher;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ProductClient", url = "http:localhost:8081")
public interface ProductClient {


}
