package com.thirdy.garbagecollection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Bitmap thirdyBitmap;
    private ImageView image;
    @Override
    protected void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load a bitmap
        thirdyBitmap = BitmapFactory.decodeResource(getResources(), android.R.drawable.ic_dialog_email);

        // show the bitmap in an image container
        image = findViewById(R.id.thirdy);
        image.setImageBitmap(thirdyBitmap);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Set the bitmap to null to release its memory
        thirdyBitmap.recycle();
        thirdyBitmap = null;

        // Start of garbage collection
        System.gc();
    }

}