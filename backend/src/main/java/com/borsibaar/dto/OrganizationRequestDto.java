package com.borsibaar.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record OrganizationRequestDto(
        @NotBlank(message="Organization name is required")
        @Size(max=120, message="Organization name must not exceed 120 characters")
        @Pattern(regexp="^[a-zA-Z0-9 ]+$", message="Organization name can only contain letters, numbers and spaces") String name,
        
        @DecimalMin("0.00") BigDecimal priceIncreaseStep,
        @DecimalMin("0.00") BigDecimal priceDecreaseStep) {
}
