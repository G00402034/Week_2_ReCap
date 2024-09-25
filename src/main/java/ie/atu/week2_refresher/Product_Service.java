package ie.atu.week2_refresher;


import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

    @Service
    public class Product_Service {
        private final List<Product> productlist = new ArrayList<>();

        public List<Product> getAllProducts() {
            return productlist;
        }
        public Product addProduct(Product product) {
            productlist.add(product);
            return product;
        }
    }

