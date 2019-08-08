package com.example.yudasubmissionmadp.data;

import com.example.yudasubmissionmadp.model.Animal;

import java.util.ArrayList;

public class AnimalsData {

    public static String[][] data = new String[][]{
            {"Badak Bercula Satu"
                    , "Rhinoceros sondaicus"
                    ,"Taman Nasional Ujung Kulon"
                    ,"Badak Jawa, atau Badak bercula satu adalah jenis mamlia besar yang masih ada didunia. Mamalia yang memiliki nama latin Rhinoceros Sondaicus merupakan keluarga dari lima badak yang masih ada didunia. Badak Jawa termasuk dalam jenis genus yang sama dengan Badak India dengan memiliki kulit bermosaik menyerupai baju baja."
                    ,"https://bahasainggrismudahsite.files.wordpress.com/2018/02/badak-jawa.png?w=1108"},
            {"Harimau Sumatera"
                    ,"Panthera tigris sumatrae"
                    ,"Pulau Sumatera"
                    ,"Harimau sumatra adalah subspesies harimau terkecil.[4] Harimau sumatra mempunyai warna paling gelap di antara semua subspesies harimau lainnya, pola hitamnya berukuran lebar dan jaraknya rapat kadang kala dempet. Harimau sumatra jantan memiliki panjang rata-rata 92 inci dari kepala ke kaki atau sekitar 250 cm panjang dari kepala hingga kaki dengan berat 300 pound atau sekitar 140 kg, sedangkan tinggi dari jantan dewasa dapat mencapai 60 cm. Betinanya rata-rata memiliki panjang 78 inci atau sekitar 198 cm dan berat 200 pound atau sekitar 91 kg. Belang harimau sumatra lebih tipis daripada subspesies harimau lain. Warna kulit harimau sumatra merupakan yang paling gelap dari seluruh harimau, mulai dari kuning kemerah-merahan hingga jingga tua. Subspesies ini juga punya lebih banyak janggut serta surai dibandingkan subspesies lain, terutama harimau jantan. Ukurannya yang kecil memudahkannya menjelajahi rimba. Terdapat selaput di sela-sela jarinya yang menjadikan mereka mampu berenang cepat. Harimau ini diketahui menyudutkan mangsanya ke air, terutama bila binatang buruan tersebut lambat berenang. Bulunya berubah warna menjadi hijau gelap ketika melahirkan."
                    ,"https://thumb.viva.co.id/media/frontend/thumbs3/2018/12/18/5c186f0302145-seekor-harimau-sumatera-panthera-tigris-sumatrae-betina-dewasa-berada-di-dalam_665_374.jpg"}

    };

    public static ArrayList<Animal> getListData() {

        ArrayList<Animal> list = new ArrayList<>();
        for (String[] animalData : data) {
            Animal animal = new Animal();
            animal.setName(animalData[0]);
            animal.setScientificName(animalData[1]);
            animal.setHabitat(animalData[2]);
            animal.setDescription(animalData[3]);
            animal.setPhoto(animalData[4]);
            list.add(animal);
        }
        return list;

    }

}
