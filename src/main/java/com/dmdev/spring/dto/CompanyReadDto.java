package com.dmdev.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CompanyReadDto {
    private final Integer id;

    public CompanyReadDto(Integer id) {
        this.id = id;
    }

}
