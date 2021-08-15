package org.example;

import com.google.gson.annotations.SerializedName;

public class Candidate{
    public String getAddress() {
        return address;
    }

    @SerializedName("formatted_address")
    private String address;

    public String getName() {
        return name;
    }

    @SerializedName("name")
    private String name;

    public Double getRating() {
        return rating;
    }

    @SerializedName("rating")
    private Double rating;


}