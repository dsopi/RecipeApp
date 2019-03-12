package com.example.recipeapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecipeAdapter extends ArrayAdapter<Recipe> {
    private Context mContext;
    private List<Recipe> recipeList = new ArrayList<Recipe>();

    public RecipeAdapter( Context context, ArrayList<Recipe> list)
    {
        super( context, 0, list);
        mContext = context;
        recipeList = list;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;

        // Associates the list with the XML Layout file "contact_view"
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.recipe_view,parent,false);

        // Individually handles each Contact in the contactList
        Recipe currentRecipe = recipeList.get(position);

        // Extracts the name of the Contact
        TextView name = (TextView) listItem.findViewById(R.id.textView_Name);
        name.setText(currentRecipe.getName());

        // Extracts the phone number of the Contact
        TextView ingredients = (TextView) listItem.findViewById(R.id.textView_Ingredients);
        ingredients.setText(currentRecipe.getIngredients());

        TextView procedure = (TextView) listItem.findViewById(R.id.textView_Procedure);
        procedure.setText(currentRecipe.getProcedure());

        return listItem;
    }
}