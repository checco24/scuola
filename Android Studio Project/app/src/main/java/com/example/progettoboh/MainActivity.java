package com.example.progettoboh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.name);
    }


    public void Cancella(View view){
        editText.setText("");
    }
    public void nuova(View view ){
        Intent intent = new Intent(this,ciao.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);

    }

    public void mostra(View view){
        Toast.makeText(getApplicationContext(),""+editText.getText(),Toast.LENGTH_SHORT).show();
    }
}