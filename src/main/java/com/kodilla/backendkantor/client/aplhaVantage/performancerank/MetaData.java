package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MetaData {

    @SerializedName("Information")
    @Expose
    public String information;
    @SerializedName("Last Refreshed")
    @Expose
    public String lastRefreshed;

    @Override
    public String toString() {
        return "MetaData{" +
                "information='" + information + '\'' +
                ", lastRefreshed='" + lastRefreshed + '\'' +
                '}';
    }
}
