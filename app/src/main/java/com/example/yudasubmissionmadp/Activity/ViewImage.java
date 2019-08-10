package com.example.yudasubmissionmadp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.yudasubmissionmadp.R;
import com.example.yudasubmissionmadp.model.Animal;
import com.example.yudasubmissionmadp.utils.Key;

public class ViewImage extends AppCompatActivity {
    Animal animal;
    Animal animalHabitat;
    ImageView imgViewItem;
    CardView cardView;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        //to get data from habitat
        animalHabitat = getIntent().getExtras().getParcelable(Key.INTENT_IMAGE);

        //to get data from status
        animal = getIntent().getExtras().getParcelable(Key.INTENT_DATA);

        //to set full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to hide toolbar
        getSupportActionBar().hide();

        imgViewItem = findViewById(R.id.img_view_item);
        cardView = findViewById(R.id.card_view);
        linearLayout = findViewById(R.id.ll_view_status);
        linearLayout.setVisibility(View.GONE);

        if(animalHabitat!=null) {
            Glide.with(this)
                    .load(animalHabitat.getUrlHabitat())
                    .apply(new RequestOptions().override(500, 500))
                    .into(imgViewItem);
        }
        else{
            Glide.with(this)
                .load(animal.getPhoto())
                .apply(new RequestOptions().override(500,500))
                .into(imgViewItem);
        }

    }
}
