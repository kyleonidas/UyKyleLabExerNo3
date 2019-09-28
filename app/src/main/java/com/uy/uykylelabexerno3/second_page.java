package com.uy.uykylelabexerno3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class second_page extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }

    public void UST(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.ust.edu.ph"));
        startActivity(intent);
    }

    public void ADMU(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.ateneo.edu"));
        startActivity(intent);
    }

    public void DLSU(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dlsu.edu.ph"));
        startActivity(intent);
    }

    public void UP(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.up.edu.ph"));
        startActivity(intent);
    }

    public void FEU(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.feu.edu.ph"));
        startActivity(intent);
    }

    public void UE(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.ue.edu.ph"));
        startActivity(intent);
    }

    public void ADU(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.adamson.edu.ph"));
        startActivity(intent);
    }

    public void NU(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.national-u.edu.ph"));
        startActivity(intent);
    }

    public void previous(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
