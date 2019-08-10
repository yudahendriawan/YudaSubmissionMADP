package com.example.yudasubmissionmadp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.yudasubmissionmadp.Activity.DetailAnimal;
import com.example.yudasubmissionmadp.model.Animal;
import com.example.yudasubmissionmadp.utils.Key;

import java.util.ArrayList;

public class ListAnimalAdapter extends RecyclerView.Adapter<ListAnimalAdapter.ListAnimalViewHolder> {

    private ArrayList<Animal> listAnimal;
    private Context context;

    public ListAnimalAdapter(ArrayList<Animal> list, Context context) {
        this.listAnimal = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListAnimalViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_cardview_animal_almost_extinct, viewGroup, false);
        return new ListAnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAnimalViewHolder listAnimalViewHolder, int position) {
        listAnimalViewHolder.binding(listAnimal.get(position));
    }

    @Override
    public int getItemCount() {
        return listAnimal.size();
    }

    public int getItemViewType(int position) {
        listAnimal.get(position);
        return position;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    /**
     * Class view holder Animal
     */

    public class ListAnimalViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView name, habitat;
        //int click = 1;
        // Button detail;

        public ListAnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            // itemView.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), R.color.color_white));
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            name = itemView.findViewById(R.id.tv_item_name);
            habitat = itemView.findViewById(R.id.tv_item_habitat);
            // detail = itemView.findViewById(R.id.btn_detail);
        }

        public void binding(final Animal animal) {

            name.setText(animal.getName());
            habitat.setText(animal.getHabitat());

            Glide.with(itemView.getContext())
                    .load(animal.getPhoto())
                    .apply(new RequestOptions().override(500, 500))
                    .into(imgPhoto);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // if(click==1) {
                    itemView.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.color_light_grey));
                    //   click=0;
                    //}
                    Intent intent = new Intent(v.getContext(), DetailAnimal.class);
                    intent.putExtra(Key.INTENT_DATA, animal);
                    v.getContext().startActivity(intent);

                }
            });

//            itemView.setOnTouchListener(new View.OnTouchListener() {
//                @Override
//                public boolean onTouch(View v, MotionEvent event) {
//                    switch (event.getAction()) {
//                        case MotionEvent.ACTION_DOWN:
//                            itemView.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.color_light_grey));
//                            break;
//                        case MotionEvent.ACTION_UP:
//                            itemView.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), R.color.color_white));
//                            break;
//                    }
//                    return true;
//                }
//            });


        }
    }
}
