package com.example.yudasubmissionmadp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.yudasubmissionmadp.R;
import com.example.yudasubmissionmadp.utils.Key;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewStatusConservation extends AppCompatActivity {

    ImageView imageViewVN, imageViewCR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_status_conservation);
        getSupportActionBar().setTitle(Key.CONSERVATION_STATUS);

        imageViewVN = findViewById(R.id.img_view_vulnerable);
        imageViewCR = findViewById(R.id.img_view_critical);

        Glide.with(this)
                .load(Key.URL_IMAGE_VU)
                .apply(new RequestOptions().override(500,500))
                .into(imageViewVN);

        Glide.with(this)
                .load(Key.URL_IMAGE_CR)
                .apply(new RequestOptions().override(500,500))
                .into(imageViewCR);
    }

}
