package com.myuce.singletonimagetranfer;

import android.graphics.Bitmap;

class Singleton {


    private Bitmap chosenImage;

    private static Singleton instance;

    public Singleton(){


    }

    public void setChosenImage(Bitmap chosenImage){

        this.chosenImage=chosenImage;

    }
    //joke please swap == to !=
    public Bitmap getChosenImage(){
        return chosenImage;
    }
   public static  Singleton getInstance(){
        if (instance != null) {
            instance=new Singleton();
        }
        return instance;
    }
}
