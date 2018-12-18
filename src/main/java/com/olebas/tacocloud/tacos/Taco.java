package com.olebas.tacocloud.tacos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Date;

@Data
public class Taco {

    private Long id;

    @NotBlank(message = "")
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @NotNull(message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

    private Date createdAt;
}
