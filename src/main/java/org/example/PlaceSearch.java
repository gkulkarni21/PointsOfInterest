package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class PlaceSearch {

    public Response placeSearchRespose;

    public PlaceSearch(){}

    public void getPlaceSearch(String input) throws IOException {
        String inputTopSights = input + "+point+of+interest";
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://maps.googleapis.com/maps/api/place/textsearch/json?query=" + inputTopSights + "&key=AIzaSyBQNVVw6o0jwvupL1tLxPjFKcK2De_3E7A")
                .method("GET", null)
                .build();
        placeSearchRespose = client.newCall(request).execute();
        Gson gson = new Gson();
        try {
            ResponseMapper responseMapper = gson.fromJson(placeSearchRespose.body().string(), ResponseMapper.class);
            List<PlaceSearchResponse> response = responseMapper.getResults();
            Collections.sort(response, Collections.reverseOrder());
            for (PlaceSearchResponse r : response) {
                System.out.println("Fetched name: " + r.getName() + "Rating: " + r.getRating() + "User Ratings: " + r.getUser_ratings());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getPlaceDetails(String placeID) throws IOException{
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://maps.googleapis.com/maps/api/place/details/json?place_id=" + placeID + "&fields=name,rating,formatted_phone_number&key=AIzaSyBQNVVw6o0jwvupL1tLxPjFKcK2De_3E7A")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
    }
}
