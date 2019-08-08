package com.example.yudasubmissionmadp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {

    private String name;
    private String habitat;
    private String scientificName;
    private String description;
    private String photo;

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

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*public static Creator<Animal> getCREATOR() {
        return CREATOR;
    }*/

    protected Animal(Parcel in) {
        name = in.readString();
        scientificName = in.readString();
        habitat = in.readString();
        description = in.readString();
        photo = in.readString();
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

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(scientificName);
        dest.writeString(habitat);
        dest.writeString(description);
        dest.writeString(photo);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                ", scientificName='" + scientificName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
