package com.gpa.receitasrestapi.services;


import com.gpa.receitasrestapi.model.Recipe;
import com.gpa.receitasrestapi.clienthttp.ClientHttp;
import com.gpa.receitasrestapi.model.Retorno;
import org.springframework.stereotype.Service;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

@Service
public class RecipeServices {

    public List<Recipe> takeRecipesList(String dish) throws IOException, InterruptedException {

        ClientHttp clientHttp = new ClientHttp();
        String jsonString = clientHttp.requestReceitas(dish);
        Gson gson = new Gson();
        Retorno retorno = gson.fromJson(jsonString, Retorno.class);
        List<Recipe> recipesList = retorno.getRecipes();
        return recipesList;
    }
}
