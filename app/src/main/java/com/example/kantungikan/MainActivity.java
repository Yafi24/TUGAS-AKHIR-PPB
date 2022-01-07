package com.example.kantungikan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;

    int[] sampleImages = {R.drawable.cupang1, R.drawable.cupang2, R.drawable.cupang3, R.drawable.cupang4};

    Button pindah;

    Button tmblPesan;
    databaseHelper BantuDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);

        BantuDb = new databaseHelper(this);
        tmblPesan = (Button)findViewById(R.id.tmblPesan);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    public void cupang1(View view) {
        Intent intent=new Intent(MainActivity.this,cupang1.class);
        startActivity(intent);
    }

    public void cupang2(View view) {
        Intent intent=new Intent(MainActivity.this,cupang2.class);
        startActivity(intent);
    }

    public void cupang3(View view) {
        Intent intent=new Intent(MainActivity.this,cupang3.class);
        startActivity(intent);
    }

    public void cupang4(View view) {
        Intent intent=new Intent(MainActivity.this,cupang4.class);
        startActivity(intent);
    }

    public void pindah(View view) {
        Intent intent=new Intent(MainActivity.this,pesanan.class);
        startActivity(intent);
    }
}