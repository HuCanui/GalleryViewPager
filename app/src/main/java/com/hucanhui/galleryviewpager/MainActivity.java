package com.hucanhui.galleryviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

import com.hucanhui.gallerlib.GallerAdapter;
import com.hucanhui.gallerlib.GallerViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GallerViewPager viewPager = (GallerViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new Adapter());
        viewPager.setDuration(4000);
        viewPager.startAutoCycle();
        viewPager.setSliderTransformDuration(1500, null);
    }


    class Adapter extends GallerAdapter{

        @Override
        public int getGallerSize() {
            return 10;
        }

        @Override
        public View getItemView(int position) {
            return LayoutInflater.from(MainActivity.this).inflate(R.layout.item_image, null);
        }
    }
}
