package com.example.yudasubmissionmadp.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.example.yudasubmissionmadp.MainActivity;
import com.example.yudasubmissionmadp.R;
import com.example.yudasubmissionmadp.model.Animal;
import com.example.yudasubmissionmadp.utils.Key;
import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class DetailAnimal extends AppCompatActivity {

    Animal animal;
    ImageView imgPhoto;
    TextView name, habitat, kingdom, filum, kelas, ordo, family, genus, spesies, statusKonservasi;
    ImageView imgStatus, imgHabitat;
    JustifiedTextView deskripsi;
    ProgressBar pbImg, pbImgHabitat, pbImageStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_animal);


        getSupportActionBar().setTitle(Key.DETAIL_ANIMAL);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        deskripsi = findViewById(R.id.tv_description);
        name = findViewById(R.id.tv_item_name);
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
        pbImg = findViewById(R.id.progress_bar_img);
        pbImgHabitat = findViewById(R.id.progress_bar_img_habitat);
        pbImageStatus = findViewById(R.id.progress_bar_img_status);

        animal = getIntent().getExtras().getParcelable(Key.INTENT_DATA);

        name.setText(animal.getName());
        deskripsi.setText(animal.getDescription());
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
                .apply(new RequestOptions().override(1000, 1000))
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        pbImg.setVisibility(View.GONE);
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        pbImg.setVisibility(View.GONE);
                        return false;
                    }
                })
                .into(imgPhoto);

        Glide.with(this)
                .load(animal.getUrlStatus())
                .apply(new RequestOptions().override(500, 500))
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        pbImageStatus.setVisibility(View.GONE);
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        pbImageStatus.setVisibility(View.GONE);
                        return false;
                    }
                })
                .into(imgStatus);

        Glide.with(this)
                .load(animal.getUrlHabitat())
                .apply(new RequestOptions().override(500, 500))
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        pbImgHabitat.setVisibility(View.GONE);
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        pbImgHabitat.setVisibility(View.GONE);
                        return false;
                    }
                })
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

        //  imgStatus.setBackgroundColor(ContextCompat.getColor(this, R.color.color_white));
        imgStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // imgStatus.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.color_light_grey));
                Intent intent = new Intent(v.getContext(), ViewStatusConservation.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
       // Toast.makeText(this, "Use arrow in the corner to back", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        //biar gak numpuk aplikasinya
        finish();
    }


}
