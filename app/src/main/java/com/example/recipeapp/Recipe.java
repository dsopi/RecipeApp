package com.example.recipeapp;

public class Recipe {
    private String name;
    private String ingredients;
    private String procedure;
    private String uid;

    public Recipe()
    {
        name = "NA";
        ingredients = "NA";
        procedure =  "NA";
        uid = "NA";
    }

    public Recipe(String name, String ingredients, String procedure, String uid) {
        this.name = name;
        this.ingredients = ingredients;
        this.procedure = procedure;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getProcedure() {
        return procedure;
    }

    public String getUid() {
        return uid;
    }

    public String toString()
    {
        return name + "\n" + ingredients + "\n" + procedure;
    }
}
