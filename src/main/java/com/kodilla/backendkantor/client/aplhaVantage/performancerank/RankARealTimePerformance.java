package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankARealTimePerformance {

    @SerializedName("Information Technology")
    @Expose
    public String informationTechnology;
    @SerializedName("Materials")
    @Expose
    public String materials;
    @SerializedName("Health Care")
    @Expose
    public String healthCare;
    @SerializedName("Consumer Discretionary")
    @Expose
    public String consumerDiscretionary;
    @SerializedName("Financials")
    @Expose
    public String financials;
    @SerializedName("Consumer Staples")
    @Expose
    public String consumerStaples;
    @SerializedName("Communication Services")
    @Expose
    public String communicationServices;
    @SerializedName("Industrials")
    @Expose
    public String industrials;
    @SerializedName("Utilities")
    @Expose
    public String utilities;
    @SerializedName("Real Estate")
    @Expose
    public String realEstate;
    @SerializedName("Energy")
    @Expose
    public String energy;

    @Override
    public String toString() {
        return "RankARealTimePerformance{" +
                "informationTechnology='" + informationTechnology + '\'' +
                ", materials='" + materials + '\'' +
                ", healthCare='" + healthCare + '\'' +
                ", consumerDiscretionary='" + consumerDiscretionary + '\'' +
                ", financials='" + financials + '\'' +
                ", consumerStaples='" + consumerStaples + '\'' +
                ", communicationServices='" + communicationServices + '\'' +
                ", industrials='" + industrials + '\'' +
                ", utilities='" + utilities + '\'' +
                ", realEstate='" + realEstate + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }
}

