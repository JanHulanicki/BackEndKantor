package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankI5YearPerformance {
    @SerializedName("Information Technology")
    @Expose
    public String informationTechnology;
    @SerializedName("Consumer Discretionary")
    @Expose
    public String consumerDiscretionary;
    @SerializedName("Health Care")
    @Expose
    public String healthCare;
    @SerializedName("Utilities")
    @Expose
    public String utilities;
    @SerializedName("Consumer Staples")
    @Expose
    public String consumerStaples;
    @SerializedName("Financials")
    @Expose
    public String financials;
    @SerializedName("Industrials")
    @Expose
    public String industrials;
    @SerializedName("Communication Services")
    @Expose
    public String communicationServices;
    @SerializedName("Materials")
    @Expose
    public String materials;
    @SerializedName("Energy")
    @Expose
    public String energy;

    @Override
    public String toString() {
        return "RankI5YearPerformance{" +
                "informationTechnology='" + informationTechnology + '\'' +
                ", consumerDiscretionary='" + consumerDiscretionary + '\'' +
                ", healthCare='" + healthCare + '\'' +
                ", utilities='" + utilities + '\'' +
                ", consumerStaples='" + consumerStaples + '\'' +
                ", financials='" + financials + '\'' +
                ", industrials='" + industrials + '\'' +
                ", communicationServices='" + communicationServices + '\'' +
                ", materials='" + materials + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }
}
