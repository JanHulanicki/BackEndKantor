package com.kodilla.backendkantor.client.nbp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NbpAvTab {

    @SerializedName("table")
    @Expose
    public String table;
    @SerializedName("no")
    @Expose
    public String no;
    @SerializedName("effectiveDate")
    @Expose
    public String effectiveDate;
    @SerializedName("rates")
    @Expose
    public List<RateTab> rates = null;

    @Override
    public String toString() {
        return "NbpAvTab{" +
                "table='" + table + '\'' +
                ", no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", rates=" + rates +
                '}';
    }
}
