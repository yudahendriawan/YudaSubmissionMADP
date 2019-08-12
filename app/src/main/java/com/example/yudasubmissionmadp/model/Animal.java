package com.example.yudasubmissionmadp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {

    private String name;
    private String habitat;
    private String description;
    private String photo;
    private String kingdom;
    private String filum;
    private String kelas;
    private String ordo;
    private String family;
    private String genus;
    private String spesies;
    private String status;
    private String urlHabitat;
    private String urlStatus;
    private String total;

    public Animal() {
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getFilum() {
        return filum;
    }

    public void setFilum(String filum) {
        this.filum = filum;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getOrdo() {
        return ordo;
    }

    public void setOrdo(String ordo) {
        this.ordo = ordo;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpesies() {
        return spesies;
    }

    public void setSpesies(String spesies) {
        this.spesies = spesies;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrlHabitat() {
        return urlHabitat;
    }

    public void setUrlHabitat(String urlHabitat) {
        this.urlHabitat = urlHabitat;
    }

    public String getUrlStatus() {
        return urlStatus;
    }

    public void setUrlStatus(String urlStatus) {
        this.urlStatus = urlStatus;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    protected Animal(Parcel in) {
        name = in.readString();
        habitat = in.readString();
        description = in.readString();
        photo = in.readString();
        kingdom = in.readString();
        filum = in.readString();
        kelas = in.readString();
        ordo = in.readString();
        family = in.readString();
        genus = in.readString();
        spesies = in.readString();
        status = in.readString();
        urlHabitat = in.readString();
        urlStatus = in.readString();
        total = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(habitat);
        dest.writeString(description);
        dest.writeString(photo);
        dest.writeString(kingdom);
        dest.writeString(filum);
        dest.writeString(kelas);
        dest.writeString(ordo);
        dest.writeString(family);
        dest.writeString(genus);
        dest.writeString(spesies);
        dest.writeString(status);
        dest.writeString(urlHabitat);
        dest.writeString(urlStatus);
        dest.writeString(total);
    }
}
