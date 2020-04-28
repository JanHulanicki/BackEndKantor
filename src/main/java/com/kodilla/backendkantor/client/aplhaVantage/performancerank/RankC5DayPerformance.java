package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankC5DayPerformance {
    @SerializedName("Energy")
    @Expose
    public String energy;
    @SerializedName("Communication Services")
    @Expose
    public String communicationServices;
    @SerializedName("Consumer Discretionary")
    @Expose
    public String consumerDiscretionary;
    @SerializedName("Health Care")
    @Expose
    public String healthCare;
    @SerializedName("Information Technology")
    @Expose
    public String informationTechnology;
    @SerializedName("Materials")
    @Expose
    public String materials;
    @SerializedName("Industrials")
    @Expose
    public String industrials;
    @SerializedName("Financials")
    @Expose
    public String financials;
    @SerializedName("Consumer Staples")
    @Expose
    public String consumerStaples;
    @SerializedName("Utilities")
    @Expose
    public String utilities;
    @SerializedName("Real Estate")
    @Expose
    public String realEstate;

    @Override
    public String toString() {
        return "RankC5DayPerformance{" +
                "energy='" + energy + '\'' +
                ", communicationServices='" + communicationServices + '\'' +
                ", consumerDiscretionary='" + consumerDiscretionary + '\'' +
                ", healthCare='" + healthCare + '\'' +
                ", informationTechnology='" + informationTechnology + '\'' +
                ", materials='" + materials + '\'' +
                ", industrials='" + industrials + '\'' +
                ", financials='" + financials + '\'' +
                ", consumerStaples='" + consumerStaples + '\'' +
                ", utilities='" + utilities + '\'' +
                ", realEstate='" + realEstate + '\'' +
                '}';
    }
}
