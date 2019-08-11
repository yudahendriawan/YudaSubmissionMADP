package com.example.yudasubmissionmadp.Activity;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.example.yudasubmissionmadp.R;
import com.example.yudasubmissionmadp.model.Animal;
import com.example.yudasubmissionmadp.utils.Key;
import com.jsibbold.zoomage.ZoomageView;

public class ViewImage extends AppCompatActivity {
    Animal animal;
    Animal animalHabitat;
    ZoomageView imgViewItem;
    ProgressBar progressBar;

   // CardView cardView;
    //LinearLayout linearLayout;

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
        progressBar = findViewById(R.id.progress);
//        cardView = findViewById(R.id.card_view);
//        linearLayout = findViewById(R.id.ll_view_status);
        //linearLayout.setVisibility(View.GONE);

        if(animalHabitat!=null) {
            Glide.with(this)
                    .load(animalHabitat.getUrlHabitat())
                    .apply(new RequestOptions().override(1000, 1000))
                    .listener(new RequestListener<Drawable>() {
                        @Override
                        public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }
                    })
                    .into(imgViewItem);
        }
        else{
            Glide.with(this)
                .load(animal.getPhoto())
                .apply(new RequestOptions().override(1000,1000))
                    .listener(new RequestListener<Drawable>() {
                        @Override
                        public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }
                    })
                .into(imgViewItem);
        }

    }
}
