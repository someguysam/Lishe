package com.example.lishe;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class UlajiUnaofaaAdapter extends PagerAdapter {

    private Context ctx;
    private int[] ImageArray = new int[] {R.drawable.maswali_na_majibu_01, R.drawable.maswali_na_majibu_02, R.drawable.maswali_na_majibu_03, R.drawable.maswali_na_majibu_04, R.drawable.maswali_na_majibu_05, R.drawable.maswali_na_majibu_06, R.drawable.maswali_na_majibu_07,  R.drawable.maswali_na_majibu_08, R.drawable.maswali_na_majibu_09, R.drawable.maswali_na_majibu_10, R.drawable.maswali_na_majibu_11, R.drawable.maswali_na_majibu_12,  R.drawable.maswali_na_majibu_13};
    UlajiUnaofaaAdapter(Context context) {ctx = context;}

    @Override
    public int getCount() {
        return ImageArray.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(ctx);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(ImageArray[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
