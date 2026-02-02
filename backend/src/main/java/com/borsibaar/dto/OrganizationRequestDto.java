package com.borsibaar.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record OrganizationRequestDto(
        @NotBlank(message="Organization name is required")
        @Size(max=120, message="Organization name must not exceed 120 characters")
        @Pattern(regexp="^[a-zA-Z0-9 ]+$", message="Organization name can only contain letters, numbers and spaces") String name,

        @NotNull(message="Price increase step is required")
        @DecimalMin(value="0.00", inclusive=true, message="Price increase step cannot be negative")
        @Digits(integer=10, fraction=2, message="Price increase step must have at most 2 decimal places") BigDecimal priceIncreaseStep,
        
        @NotNull(message="Price decrease step is required")
        @DecimalMin(value="0.00", inclusive=true, message="Price decrease step cannot be negative")
        @Digits(integer=10, fraction=2, message="Price decrease step must have at most 2 decimal places") BigDecimal priceDecreaseStep) {
}
