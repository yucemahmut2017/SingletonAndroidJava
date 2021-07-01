package com.myuce.singletonimagetranfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );


        ImageView imageView=findViewById( R.id.imageView);


 imageView.setImageBitmap( Singleton.getInstance().getChosenImage());



    }
}