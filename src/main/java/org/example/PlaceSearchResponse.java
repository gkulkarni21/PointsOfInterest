package org.example;

import com.google.gson.annotations.SerializedName;

public class PlaceSearchResponse implements Comparable<PlaceSearchResponse> {
    @SerializedName("name")
    private String name;

    @SerializedName("formatted_address")
    private String address;

    @SerializedName("place_id")
    private String placeId;

    @SerializedName("rating")
    private String rating;

    @SerializedName("user_ratings_total")
    private int user_ratings;

   public PlaceSearchResponse(){}

   public void setName(String name){
       this.name = name;
   }

   public String getName(){
       return this.name;
   }

   public void setAddress(String address){
       this.address = address;
   }

    public String getAddress(){
        return this.address;
    }

    public void setPlaceId(String placeid){
        this.placeId = placeid;
    }

    public String getPlaceId(){
        return this.placeId;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public String getRating(){
        return this.rating;
    }

    public void setUser_ratings(int userRating){
        this.user_ratings = userRating;
    }

    public Integer getUser_ratings(){
        return this.user_ratings;
    }

    // sorting by user rating
    @Override
    public int compareTo(PlaceSearchResponse p){
       return this.getUser_ratings().compareTo(p.getUser_ratings());
    }
}
