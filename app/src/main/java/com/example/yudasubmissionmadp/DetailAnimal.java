package com.example.yudasubmissionmadp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.yudasubmissionmadp.model.Animal;
import com.example.yudasubmissionmadp.utils.Key;
import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class DetailAnimal extends AppCompatActivity {
    Animal animal;
    ImageView imgPhoto;
    TextView name,scientificName,habitat,kingdom,filum,kelas,ordo,family,genus,spesies,statusKonservasi;
    ImageView imgStatus,imgHabitat;
    JustifiedTextView deskripsi;
    private String titleToolbar = "Detail Hewan";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_animal);
        getSupportActionBar().setTitle(titleToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        deskripsi = findViewById(R.id.tv_description);
        name = findViewById(R.id.tv_item_name);
      //  scientificName = findViewById(R.id.tv_item_scientificname);
        habitat = findViewById(R.id.tv_habitat);
        imgPhoto = findViewById(R.id.img_item_photo);
        kingdom = findViewById(R.id.tv_kingdom);
        filum = findViewById(R.id.tv_filum);
        kelas = findViewById(R.id.tv_kelas);
        ordo = findViewById(R.id.tv_ordo);
        family = findViewById(R.id.tv_family);
        genus = findViewById(R.id.tv_genus);
        spesies = findViewById(R.id.tv_spesies);
        imgStatus = findViewById(R.id.img_status);
        imgHabitat = findViewById(R.id.img_habitat);

        statusKonservasi = findViewById(R.id.tv_status);

        animal = getIntent().getExtras().getParcelable(Key.INTENT_DATA);

        name.setText(animal.getName());
        deskripsi.setText(animal.getDescription());
       // scientificName.setText(animal.getScientificName());
        habitat.setText(animal.getHabitat());

        kingdom.setText(animal.getKingdom());
        filum.setText(animal.getFilum());
        kelas.setText(animal.getKelas());
        ordo.setText(animal.getOrdo());
        family.setText(animal.getFamily());
        genus.setText(animal.getGenus());
        spesies.setText(animal.getSpesies());

        statusKonservasi.setText(animal.getStatus());

        Glide.with(this)
                .load(animal.getPhoto())
                .apply(new RequestOptions().override(1000,1000))
                .into(imgPhoto);

        Glide.with(this)
                .load(animal.getUrlStatus())
                .apply(new RequestOptions().override(500,500))
                .into(imgStatus);

        Glide.with(this)
                .load(animal.getUrlHabitat())
                .apply(new RequestOptions().override(500,500))
                .into(imgHabitat);

        imgHabitat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ViewImage.class);
                intent.putExtra(Key.INTENT_IMAGE, animal);
                startActivity(intent);
            }
        });

        imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ViewImage.class);
                intent.putExtra(Key.INTENT_DATA, animal);
                startActivity(intent);
            }
        });

    }
//    public void onBackPressed(){
//
//    }

}
