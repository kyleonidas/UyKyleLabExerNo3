package com.uy.uykylelabexerno3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity
{
    EditText input;
    EditText etSchool1, etSchool2, etSchool3, etSchool4, etSchool5, etSchool6, etSchool7, etSchool8;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.et_school1);
        input = findViewById(R.id.et_school2);
        input = findViewById(R.id.et_school3);
        input = findViewById(R.id.et_school4);
        input = findViewById(R.id.et_school5);
        input = findViewById(R.id.et_school6);
        input = findViewById(R.id.et_school7);
        input = findViewById(R.id.et_school8);
    }

    public void writeData(View v)
    {
        String data = input.getText().toString();
        FileOutputStream writer = null;
        try
        {
            writer = openFileOutput("data1.txt", MODE_PRIVATE);
            writer.write(data.getBytes());
        }
        catch (FileNotFoundException e)
        {
            Log.d("error", "File not Found");
        }
        catch (IOException e)
        {
            Log.d("error", "IO Error");
        }
        finally
        {
            try
            {
                writer.close();
            } catch (IOException e)
            {
                Log.d("error", "File not Found");
            }
        }
        Toast.makeText(this, "Data Saved in the Internal Storage", Toast.LENGTH_LONG).show();
    }
    public void next(View v)
    {
        Intent intent = new Intent(this, second_page.class);
        startActivity(intent);
    }
}