package org.example;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseMapper {

    @SerializedName("html_attributions")
    private List<String> html_attributions;

    @SerializedName("next_page_token")
    private String next_page_token;

    @SerializedName("results")
    private List<PlaceSearchResponse> results;

    @SerializedName("status")
    private String status;

    public List<String> getHtml_attributions(){
        return this.html_attributions;
    }

    public String getPagerToken(){
        return this.next_page_token;
    }

    public List<PlaceSearchResponse> getResults(){
        return this.results;
    }

    public String getStatus(){
        return this.status;
    }
}
