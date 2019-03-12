package com.example.recipeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addRecipe( View view)
    {
        Intent intent = new Intent( this, AddActivity.class);
        startActivity(intent);
    }

    public void viewRecipe(View view)
    {
        Intent intent = new Intent(this, ViewActivity.class);
        startActivity( intent );
    }

    public void searchRecipe(View view)
    {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity( intent );
    }

    public void deleteRecipe(View view )
    {
        Intent intent = new Intent(this, RemoveActivity.class);
        startActivity( intent);
    }



}
