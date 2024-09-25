package ie.atu.week2_refresher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Product_Controller {


        private final Product_Service product_Service;

        @Autowired
        public Product_Controller(Product_Service product_Service) {
                this.product_Service = product_Service;
        }



        @GetMapping("/products")
        public List<Product> getAllProducts()
        {
                return product_Service.getAllProducts();
        }

        @PostMapping("/products")
        public Product addProduct(@RequestBody Product product)
        {
                return product_Service.addProduct(product);
        }





}
