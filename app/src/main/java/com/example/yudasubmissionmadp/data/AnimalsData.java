package com.example.yudasubmissionmadp.data;

import com.example.yudasubmissionmadp.model.Animal;

import java.util.ArrayList;

public class AnimalsData {

    public static String[][] data = new String[][]{
            {"Badak Bercula Satu"
                    ,"Taman Nasional Ujung Kulon"
                    ,"Badak Jawa, atau Badak bercula satu adalah jenis mamlia besar yang masih ada didunia. Mamalia yang memiliki nama latin Rhinoceros Sondaicus merupakan keluarga dari lima badak yang masih ada didunia. Badak Jawa termasuk dalam jenis genus yang sama dengan Badak India dengan memiliki kulit bermosaik menyerupai baju baja."
                    ,"https://bahasainggrismudahsite.files.wordpress.com/2018/02/badak-jawa.png?w=1108"
                    ,"Animalia"
                    ,"Chordata"
                    ,"Mamalia"
                    ,"Perissodactyla"
                    ,"Rhinocerotidae"
                    ,"Rhinoceros"
                    ,"Rhinoceros sondaicus"
                    ,"Kritis (Critical)"},
            {"Harimau Sumatera"
                    ,"Pulau Sumatera"
                    ,"Harimau sumatera (Panthera tigris sumatrae) merupakan salah satu dari tiga subspesies harimau yang ada di Indonesia. Dua subspesies lain yaitu harimau bali (Panthera tigris balica) dan harimau jawa (Panthera tigris sondaica) telah dinyatakan punah, meskipun ada beberapa pihak yang masih meyakini bahwa harimau jawa masih ada. Harimau sumatera adalah subspesies terakhir yang masih dapat bertahan dan mewakili subspesies harimau di Indonesia. Oleh karena itu,harimau sumatera bukan hanya merupakan komponen penting dari keanekaragaman hayati Indonesia tetapi juga merupakan salah satu predator puncak (top predator) yang masih tersisa. Bila jenis ini punah maka tidak hanya merupakan suatu kehilangan secara ekologis tetapi juga memalukan dari segi politis bagi pemerintah Indonesia dan masyarakat Indonesia pada umumnya."
                    ,"https://thumb.viva.co.id/media/frontend/thumbs3/2018/12/18/5c186f0302145-seekor-harimau-sumatera-panthera-tigris-sumatrae-betina-dewasa-berada-di-dalam_665_374.jpg"
                    ,"Animalia"
                    ,"Chordata"
                    ,"Mamalia"
                    ,"Karnivora"
                    ,"Felidae"
                    ,"Phantera"
                    ,"Phantera tigris"
                    ,"Kritis (Critical)"},
            {"Komodo"
                    ,"Pulau Komodo"
                    ,"Komodo, atau juga disebut biawak komodo (Varanus komodoensis), adalah spesies biawak besar yang terdapat di Pulau Komodo, Rinca, Flores, Gili Motang, dan Gili Dasami di Provinsi Nusa Tenggara Timur, Indonesia. Biawak ini oleh penduduk asli pulau Komodo juga disebut dengan nama setempat ora.\n" +
                    "\n" +
                    "Komodo merupakan spesies terbesar dari familia Varanidae, sekaligus kadal terbesar di dunia, dengan rata-rata panjang 2-3 meter dan beratnya bisa mencapai 100 kg. Komodo merupakan pemangsa puncak di habitatnya karena sejauh ini tidak diketahui adanya hewan karnivora besar lain selain biawak ini di sebarang geografisnya.\n" +
                    "\n" +
                    "Tubuhnya yang besar dan reputasinya yang mengerikan membuat mereka menjadi salah satu hewan paling terkenal di dunia. Sekarang, habitat komodo yang sesungguhnya telah menyusut akibat aktivitas manusia, sehingga lembaga IUCN memasukkan komodo sebagai spesies yang rentan terhadap kepunahan. Biawak komodo telah ditetapkan sebagai hewan yang dilindungi oleh pemerintah Indonesia dan habitanya dijadikan taman nasional, yaitu Taman Nasional Komodo, yang tujuannya didirikan untuk melindungi mereka."
                    ,"https://gcs.thesouthafrican.com/2018/12/IMG_2334-750x375.jpg"
                    ,"Animalia"
                    ,"Chordata"
                    ,"Reptilia"
                    ,"Squamata"
                    ,"Varanidae"
                    ,"Varanus"
                    ,"Varanus komodoensis"
                    ,"Rentan (Vulnerable)"
            }
            /**
             * 1 Nama,
             * 2 Habitat
             * 3 Deskripsi
             * 4 url foto
             * 5 Kingdom
             * 6 filum
             * 7 kelas
             * 8 ordo
             * 9 family
             * 10 genus
             * 11 spesies
             *
            */
    };

    public static ArrayList<Animal> getListData() {

        ArrayList<Animal> list = new ArrayList<>();
        for (String[] animalData : data) {
            Animal animal = new Animal();
            animal.setName(animalData[0]);
           // animal.setScientificName(animalData[1]);
            animal.setHabitat(animalData[1]);
            animal.setDescription(animalData[2]);
            animal.setPhoto(animalData[3]);
            animal.setKingdom(animalData[4]);
            animal.setFilum(animalData[5]);
            animal.setKelas(animalData[6]);
            animal.setOrdo(animalData[7]);
            animal.setFamily(animalData[8]);
            animal.setGenus(animalData[9]);
            animal.setSpesies(animalData[10]);
            animal.setStatus(animalData[11]);
            list.add(animal);
        }
        return list;

    }

}
