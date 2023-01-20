package com.gpa.receitasrestapi.controller;

import com.gpa.receitasrestapi.model.Recipe;
import com.gpa.receitasrestapi.services.RecipeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    RecipeServices services;

    @GetMapping(path = "/api/recip-list/{dish}")
    public List<Recipe> listRecipesByDish(@PathVariable("dish") String dish ) throws IOException, InterruptedException {
        return services.takeRecipesList(dish);
    }
}
