package com.example.lishe;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class CoronaNaLisheAdapter extends PagerAdapter {

    private Context ctx1;
    private int[] ImageArray = new int[] {R.drawable.corona_faq_01, R.drawable.corona_faq_02, R.drawable.corona_faq_03, R.drawable.corona_faq_04, R.drawable.corona_faq_05, R.drawable.corona_faq_06, R.drawable.corona_faq_07,  R.drawable.corona_faq_08, R.drawable.corona_faq_09, R.drawable.corona_faq_10};
    CoronaNaLisheAdapter(Context context) {ctx1 = context;}

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
        ImageView imageView = new ImageView(ctx1);
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