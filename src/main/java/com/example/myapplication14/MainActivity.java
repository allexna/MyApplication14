package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.content.res.Configuration.*;

public class MainActivity extends AppCompatActivity {
    private EditText myeditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myeditText=findViewById(R.id.editText);

    }
    private String getScreenOrientationt(){



        if (getResources().getConfiguration().orientation== ORIENTATION_PORTRAIT)

            return "Portrait orientation";








        else if (getResources().getConfiguration().orientation== ORIENTATION_LANDSCAPE)
            return "Album orientation";





        else
            return "";




    }
    public void onClick (View view){

    myeditText.setText(getScreenOrientationt());
    }


}



