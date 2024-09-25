package ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Product_Controller {


        private List<Product> productlist = new ArrayList<Product>();



        @GetMapping("/products")
        public List<Product> getAllProducts()
        {
            return productlist;
        }

        @PostMapping("/products")
        public Product addProduct(@RequestBody Product product)
        {
            return product;
        }




}
