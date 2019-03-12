package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddActivity extends AppCompatActivity {

    // Google Firebase Database References
    private DatabaseReference myRef;
    private FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        // Initializes the references to the database and contacts
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("contacts");
    }

    public void addRecipe(View view)
    {
        EditText editName = findViewById(R.id.editTextName);
        String name = editName.getText().toString();
        EditText editIngredients = findViewById(R.id.editTextIngredients);
        String ingredients= editIngredients.getText().toString();
        EditText editProcedure = findViewById(R.id.editTextProcedure);
        String procedure = editProcedure.getText().toString();

        if( name.length() > 0 )
        {
            String key = myRef.push().getKey(); // Generates unique random key
            Recipe r = new Recipe(name, ingredients, procedure, key);
            myRef.child(key).setValue(r);   // Adds new Contact to the Database
            Toast.makeText(this, r.getName() + " successfully added.", Toast.LENGTH_LONG).show();
        }

        // Resets fields
        editName.setText("");
        editIngredients.setText("");
        editProcedure.setText("");
    }

    public void goHome( View view )
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity( intent);
    }


}