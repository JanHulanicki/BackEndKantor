package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankE3MonthPerformance {

    @SerializedName("Health Care")
    @Expose
    public String healthCare;
    @SerializedName("Consumer Discretionary")
    @Expose
    public String consumerDiscretionary;
    @SerializedName("Consumer Staples")
    @Expose
    public String consumerStaples;
    @SerializedName("Information Technology")
    @Expose
    public String informationTechnology;
    @SerializedName("Communication Services")
    @Expose
    public String communicationServices;
    @SerializedName("Utilities")
    @Expose
    public String utilities;
    @SerializedName("Materials")
    @Expose
    public String materials;
    @SerializedName("Real Estate")
    @Expose
    public String realEstate;
    @SerializedName("Industrials")
    @Expose
    public String industrials;
    @SerializedName("Financials")
    @Expose
    public String financials;
    @SerializedName("Energy")
    @Expose
    public String energy;

    @Override
    public String toString() {
        return "RankE3MonthPerformance{" +
                "healthCare='" + healthCare + '\'' +
                ", consumerDiscretionary='" + consumerDiscretionary + '\'' +
                ", consumerStaples='" + consumerStaples + '\'' +
                ", informationTechnology='" + informationTechnology + '\'' +
                ", communicationServices='" + communicationServices + '\'' +
                ", utilities='" + utilities + '\'' +
                ", materials='" + materials + '\'' +
                ", realEstate='" + realEstate + '\'' +
                ", industrials='" + industrials + '\'' +
                ", financials='" + financials + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }
}
