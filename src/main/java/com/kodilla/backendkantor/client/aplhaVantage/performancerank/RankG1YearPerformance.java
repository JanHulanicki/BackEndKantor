package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankG1YearPerformance {
    @SerializedName("Health Care")
    @Expose
    public String healthCare;
    @SerializedName("Information Technology")
    @Expose
    public String informationTechnology;
    @SerializedName("Consumer Staples")
    @Expose
    public String consumerStaples;
    @SerializedName("Utilities")
    @Expose
    public String utilities;
    @SerializedName("Communication Services")
    @Expose
    public String communicationServices;
    @SerializedName("Consumer Discretionary")
    @Expose
    public String consumerDiscretionary;
    @SerializedName("Real Estate")
    @Expose
    public String realEstate;
    @SerializedName("Materials")
    @Expose
    public String materials;
    @SerializedName("Financials")
    @Expose
    public String financials;
    @SerializedName("Industrials")
    @Expose
    public String industrials;
    @SerializedName("Energy")
    @Expose
    public String energy;

    @Override
    public String toString() {
        return "RankG1YearPerformance{" +
                "healthCare='" + healthCare + '\'' +
                ", informationTechnology='" + informationTechnology + '\'' +
                ", consumerStaples='" + consumerStaples + '\'' +
                ", utilities='" + utilities + '\'' +
                ", communicationServices='" + communicationServices + '\'' +
                ", consumerDiscretionary='" + consumerDiscretionary + '\'' +
                ", realEstate='" + realEstate + '\'' +
                ", materials='" + materials + '\'' +
                ", financials='" + financials + '\'' +
                ", industrials='" + industrials + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }
}
