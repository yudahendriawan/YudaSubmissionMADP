package com.example.yudasubmissionmadp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.yudasubmissionmadp.model.Animal;
import com.example.yudasubmissionmadp.utils.Key;

public class DetailAnimal extends AppCompatActivity {
    Animal animal;
    ImageView imgPhoto;
    TextView deskripsi,name,scientificName,habitat;
    private String titleToolbar = "Detail Hewan";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_animal);
        getSupportActionBar().setTitle(titleToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        deskripsi = findViewById(R.id.tv_description);
        name = findViewById(R.id.tv_item_name);
        scientificName = findViewById(R.id.tv_item_scientificname);
        habitat = findViewById(R.id.tv_item_habitat);
        imgPhoto = findViewById(R.id.img_item_photo);

        animal = getIntent().getExtras().getParcelable(Key.INTENT_DATA);

        name.setText(animal.getName());
        deskripsi.setText(animal.getDescription());
        scientificName.setText(animal.getScientificName());
        habitat.setText(animal.getHabitat());


        Glide.with(this)
                .load(animal.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(imgPhoto);

    }

    public void onBackPressed(){

    }

}
