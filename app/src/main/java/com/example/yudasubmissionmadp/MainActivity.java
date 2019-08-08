package com.example.yudasubmissionmadp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.yudasubmissionmadp.data.AnimalsData;
import com.example.yudasubmissionmadp.model.Animal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvAnimals;
    private ArrayList<Animal> list = new ArrayList<>();
    private String titleToolbar = "Hewan Dilindungi";
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(titleToolbar);
        rvAnimals = findViewById(R.id.rv_animals);
        rvAnimals.setHasFixedSize(true);

        list.addAll(AnimalsData.getListData());

        showRecyclerCardView();
    }

    public void showRecyclerCardView() {

        rvAnimals.setLayoutManager(new LinearLayoutManager(this));
        ListAnimalAdapter listAnimalAdapter = new ListAnimalAdapter(list, getApplicationContext());
        rvAnimals.setAdapter(listAnimalAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Membaca file menu dan menambahkan isinya ke action bar jika ada.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.about:
                Intent intent = new Intent(this, AboutMe.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
