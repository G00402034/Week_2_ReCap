package ie.atu.week2_refresher;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;

    @NotBlank(message = "name cannot be empty")
    private String name;

    @Min(value = 0 , message = "price must be more than 0")
    private double price;
}
