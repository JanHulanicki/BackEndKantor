package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankJ10YearPerformance {
    @SerializedName("Information Technology")
    @Expose
    public String informationTechnology;
    @SerializedName("Consumer Discretionary")
    @Expose
    public String consumerDiscretionary;
    @SerializedName("Health Care")
    @Expose
    public String healthCare;
    @SerializedName("Consumer Staples")
    @Expose
    public String consumerStaples;
    @SerializedName("Utilities")
    @Expose
    public String utilities;
    @SerializedName("Industrials")
    @Expose
    public String industrials;
    @SerializedName("Financials")
    @Expose
    public String financials;
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
        return "RankJ10YearPerformance{" +
                "informationTechnology='" + informationTechnology + '\'' +
                ", consumerDiscretionary='" + consumerDiscretionary + '\'' +
                ", healthCare='" + healthCare + '\'' +
                ", consumerStaples='" + consumerStaples + '\'' +
                ", utilities='" + utilities + '\'' +
                ", industrials='" + industrials + '\'' +
                ", financials='" + financials + '\'' +
                ", communicationServices='" + communicationServices + '\'' +
                ", materials='" + materials + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }
}
