package com.example.yudasubmissionmadp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.yudasubmissionmadp.model.Animal;
import com.example.yudasubmissionmadp.utils.Key;

public class DetailAnimal extends AppCompatActivity {
    Animal animal;
    TextView deskripsi;
    private String titleToolbar = "Detail Hewan";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_animal);
        getSupportActionBar().setTitle(titleToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        deskripsi = findViewById(R.id.deskripsidetail);

        animal = getIntent().getExtras().getParcelable(Key.INTENT_DATA);

        deskripsi.setText(animal.getDescription());

    }

    public void onBackPressed(){

    }

}
