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
    @Min(value = 0 , message = "Value cannot be less than 0")
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Min(value = 0 , message = "Value cannot be less than 0" )
    private double price;
}
