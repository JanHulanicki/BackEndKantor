package com.kodilla.backendkantor.client;

import lombok.Getter;
import lombok.Setter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Getter
@Setter
public class QuantlBigMac {

    @SerializedName("dataset")
    @Expose
    public Dataset dataset;

    @Override
    public String toString() {
        return "QuantlBigMac{" +
                "dataset=" + dataset +
                '}';
    }
}