package com.borsibaar.dto;

import java.time.Instant;
import java.util.List;

public record BarStationResponseDto(
    Long id,
    Long organizationId,
    String name,
    String description,
    Boolean isActive,
    List<UserDTO> assignedUsers,
    Instant createdAt,
    Instant updatedAt
) {
}

