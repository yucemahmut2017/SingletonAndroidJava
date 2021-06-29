package com.myuce.singletonimagetranfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Bitmap bitmap;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );


        imageView=findViewById( R.id.imageView3 );
        bitmap= BitmapFactory.decodeResource( getApplicationContext().getResources(),R.drawable.profilephoto );
        Singleton singleton=new Singleton();
        singleton.setChosenImage( bitmap );
        imageView.setImageBitmap( singleton.getChosenImage() );






    }
    public void GotoSecondActivity(View view){


        Intent intent=new Intent(getApplicationContext(),SecondActivity.class );





    }
}