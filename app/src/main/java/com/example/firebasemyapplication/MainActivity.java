package com.example.firebasemyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private EditText enterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit =findViewById(R.id.submitButton);
//
//        FirebaseDatabase database=FirebaseDatabase.getInstance();
//        DatabaseReference myRef=database.getReference("message");
//        myRef.setValue("Hello, Master Coding Channel");










    }
    public  void process(View view){
        enterName=findViewById(R.id.EnterYourName);
        FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
        DatabaseReference root=firebaseDatabase.getReference();

        root.setValue(enterName.getText().toString());
        enterName.setText("");
        Toast.makeText(getApplicationContext(), "Inserted", Toast.LENGTH_SHORT).show();
    }
}