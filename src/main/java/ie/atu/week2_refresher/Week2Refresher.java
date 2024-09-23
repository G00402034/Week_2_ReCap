package ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Week2Refresher {

    private List<Product> productist = new ArrayList<Product>();

    @GetMapping("/hello")
            public String message()
    {
        return "Hello";
    }
    @GetMapping("/hello/{name}")
    public String myName(@PathVariable String name)
    {
        return "Your name is " + name;
    }

    @GetMapping("/search")
    public String search(@RequestParam String search1, @RequestParam() String search2)
    {
        return search1 + " " + search2;
    }

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
