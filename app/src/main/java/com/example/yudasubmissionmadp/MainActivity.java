package com.example.yudasubmissionmadp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.yudasubmissionmadp.data.AnimalsData;
import com.example.yudasubmissionmadp.model.Animal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvAnimals;
    private ArrayList<Animal> list = new ArrayList<>();
    private String titleToolbar = "Hewan Dilindungi";
    private Toolbar toolbar;

    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(titleToolbar);
        rvAnimals = findViewById(R.id.rv_animals);
        rvAnimals.setHasFixedSize(true);

        //to set full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        list.addAll(AnimalsData.getListData());

        showRecyclerCardView();
    }

    public void showRecyclerCardView() {

        rvAnimals.setLayoutManager(new LinearLayoutManager(this));
        ListAnimalAdapter listAnimalAdapter = new ListAnimalAdapter(list, getApplicationContext());
        rvAnimals.setAdapter(listAnimalAdapter);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Membaca file menu dan menambahkan isinya ke action bar jika ada.
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        setMode(item.getItemId());
//        return true;
//    }
//
//
//    public void setMode(int selectedMode) {
//        switch (selectedMode) {
//            case R.id.about:
//                Intent intent = new Intent(this, AboutMe.class);
//                startActivity(intent);
//                break;
//        }
//    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {

        switch (selectedMode){
            case R.id.about:
                Intent intent = new Intent(this, AboutMe.class);
                startActivity(intent);
                break;
            case R.id.exit:
                exit();
        }

//        if(selectedMode == R.id.about){
//                Intent intent = new Intent(this, AboutMe.class);
//                startActivity(intent);
//        }
    }

    public void exit() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title
        alertDialogBuilder.setTitle(null);

        // set dialog message
        alertDialogBuilder
                .setMessage("Apakah anda ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }

    /**
     * To exit with twice clicked back button
     */
    @Override
    public void onBackPressed(){
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}
