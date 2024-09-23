package ie.atu.week2_refresher;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
    public class ProductService {
        private List<Product> productList = new ArrayList<>();
        public List<Product> getAllProducts() {
            return productList;
        }
    @PostMapping
        public Product addProduct(@RequestBody Product product) {
            productList.add(product);
            return product;
        }





}

    }


