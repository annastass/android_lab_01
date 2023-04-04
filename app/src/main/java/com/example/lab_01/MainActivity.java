package com.example.lab_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View view){
        EditText editName = findViewById(R.id.editName);
        EditText editAge = findViewById(R.id.editAge);
        RadioGroup editGender = findViewById(R.id.editGender);

        Toast toast = Toast.makeText(this,"Проверьте введенные данные",Toast.LENGTH_SHORT);

        String name = editName.getText().toString();
        String age = editAge.getText().toString();

        if(name.equals("") || age.equals("") || editGender.getCheckedRadioButtonId() == -1)
            toast.show();
        else {
            int rbId = editGender.getCheckedRadioButtonId();
            RadioButton rb = findViewById(rbId);
            String gender = rb.getText().toString();

            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra("isName", name);
            i.putExtra("isAge", age);
            i.putExtra("isGender", gender);
            startActivity(i);
        }
    }
    public void clear(View view){
        EditText name = findViewById(R.id.editName);
        EditText age = findViewById(R.id.editAge);
        RadioGroup rg = findViewById(R.id.editGender);
        name.setText("");
        age.setText("");
        rg.clearCheck();
    }
}