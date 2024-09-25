package ie.atu.week2_refresher;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
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
        public Product addProduct(@Valid @RequestBody Product product)
        {
                return product_Service.addProduct(product);
        }

        @PutMapping("/products/{id}")
        public Product updateProduct(@PathVariable Long id, @Valid @RequestBody Product product) {
                return product_Service.updateProduct(id, product);
        }

        @PostMapping("/products/{id}")
        public Product deleteProduct(@PathVariable Long id) {
                return product_Service.deleteProduct(id);
        }






}
