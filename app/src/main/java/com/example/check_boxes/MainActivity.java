package com.example.check_boxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayToast(View view)
    {
        int checkedCount = 0;
        String massenge= "";
        CheckBox chocolate;
        chocolate = findViewById(R.id.chocolateBox);
        boolean checked = chocolate.isChecked();

        if(checked == true)
        {
            checkedCount++;
            String chocolateSyrup =" chocholate Syrup";
            massenge = massenge.concat(chocolateSyrup);

        }



        CheckBox sprinkles;
        sprinkles = findViewById(R.id.sprinkles);
        checked = sprinkles.isChecked();
        if(checked == true)
        {
            checkedCount++;
            String sprinkless =" sprinkles";
            massenge = massenge.concat(sprinkless);

        }

        CheckBox chrushedNut;
        chrushedNut = findViewById(R.id.crushNuts);
        checked = chrushedNut.isChecked();
        if(checked == true)
        {
            checkedCount++;
            String chrushedNutt =" chrushed nut";
            massenge = massenge.concat(chrushedNutt);

        }

        CheckBox cherries;
        cherries = findViewById(R.id.cherries);
        checked = cherries.isChecked();
        if(checked == true)
        {
            checkedCount++;
            String cherriess =" cherries";
            massenge = massenge.concat(cherriess);

        }
        CheckBox orio;
        orio = findViewById(R.id.orioCookiesCrumbles);
        checked = cherries.isChecked();
        if(checked == true)
        {
            checkedCount++;
            String orioo =" orio cookies crumbles";
            massenge = massenge.concat(orioo);

        }
        if(checkedCount != 0)
        Toast.makeText(getApplicationContext(),massenge,Toast.LENGTH_SHORT).show();


    }
}

