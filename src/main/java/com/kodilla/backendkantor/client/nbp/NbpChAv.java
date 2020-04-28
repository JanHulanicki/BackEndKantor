package com.kodilla.backendkantor.client.nbp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kodilla.backendkantor.client.Rate;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class NbpChAv {

    @SerializedName("table")
    @Expose
    private String table;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("rates")
    @Expose
    private List<Rate> rates = null;

    @Override
    public String toString() {
        return "NbpChAv{" +
                "table='" + table + '\'' +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", rates=" + rates +
                '}';
    }
}

