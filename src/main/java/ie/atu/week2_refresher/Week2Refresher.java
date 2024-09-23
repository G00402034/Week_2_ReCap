package ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Week2Refresher {

    private List<Product> productist = new ArrayList<Product>();

    @GetMapping
    public List <Product> getProductList()
    {
        return productist;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product)
    {
        productist.add(product);
        return product;
    }
}
