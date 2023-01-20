package com.gpa.receitasrestapi.model;

import java.util.List;

public class Retorno {

    public int count;
    public List<Recipe> recipes;

    public Retorno(int count, List<Recipe> recipes) {
        this.count = count;
        this.recipes = recipes;
    }

    public Retorno() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
