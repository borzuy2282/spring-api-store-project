package com.borzixx.store.carts;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateItemDto {
    @Min(value = 1, message = "Quantity must me more or equal to 1")
    @Max(value = 100, message = "Quantity must me less or equal to 100")
    @NotNull(message = "You must provide quantity")
    private Integer quantity;
}
