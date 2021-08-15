package org.example;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CandidateResponseTest {

    @SerializedName("candidates")
    private List<Candidate> candidates;

    public List<Candidate> getCandidates(){
        return this.candidates;
    }

    public String getStatus() {
        return status;
    }

    @SerializedName("status")
    private String status;


}
