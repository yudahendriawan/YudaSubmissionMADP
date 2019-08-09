package com.example.yudasubmissionmadp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.yudasubmissionmadp.model.Animal;
import com.example.yudasubmissionmadp.utils.Key;

public class ViewImage extends AppCompatActivity {
    Animal animal;
    Animal animalHabitat;
    ImageView imgViewItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);


        animalHabitat = getIntent().getExtras().getParcelable(Key.INTENT_IMAGE);
        animal = getIntent().getExtras().getParcelable(Key.INTENT_DATA);

        //to set full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to hide toolbar
        getSupportActionBar().hide();

        imgViewItem = findViewById(R.id.img_view_item);


        Glide.with(this)
                .load(animalHabitat.getUrlHabitat())
                .apply(new RequestOptions().override(1000,1000))
                .into(imgViewItem);

        Glide.with(this)
                .load(animal.getPhoto())
                .apply(new RequestOptions().override(1000,1000))
                .into(imgViewItem);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
