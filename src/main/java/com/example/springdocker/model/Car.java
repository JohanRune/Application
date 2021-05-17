package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Johan Rune
 * Date: 2021-05-11
 * Time: 13:21
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    String id;
    String name;
    boolean delicious;
    boolean canIDriveIt;

    public String getName() {
        return name;
    }
}
