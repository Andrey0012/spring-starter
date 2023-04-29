package com.dmdev.spring.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
public class Company {
    private final Integer id;

    public Company(Integer id) {
        this.id = id;
    }


}
