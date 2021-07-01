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

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        imageView=findViewById( R.id.imageView3 );
        Bitmap bitmap= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.profilephoto );





        Singleton.getInstance().setChosenImage( bitmap );



        imageView.setImageBitmap(bitmap );






    }
    public void GotoSecondActivity(View view){


        Intent intent=new Intent(getApplicationContext(),SecondActivity.class );
        startActivity( intent );





    }
}