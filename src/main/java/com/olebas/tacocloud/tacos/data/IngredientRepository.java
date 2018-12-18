package com.olebas.tacocloud.tacos.data;

import com.olebas.tacocloud.tacos.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);
}
