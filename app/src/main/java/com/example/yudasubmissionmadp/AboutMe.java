package com.example.yudasubmissionmadp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;



public class AboutMe extends AppCompatActivity {
    private String titleToolbar = "About Me";
  //  CircleImageView photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        //to hide bar system android
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
      //  photo = findViewById(R.id.photo_me);
        getSupportActionBar().hide();
//        getSupportActionBar().setTitle(titleToolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        Glide.with(this)
//                .load(getDrawable(R.drawable.aku))
//                .into(photo);
    }
//
//    public void onBackPressed(){
//
//    }

}
