package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankH3YearPerformance {
    @SerializedName("Information Technology")
    @Expose
    public String informationTechnology;
    @SerializedName("Health Care")
    @Expose
    public String healthCare;
    @SerializedName("Consumer Discretionary")
    @Expose
    public String consumerDiscretionary;
    @SerializedName("Utilities")
    @Expose
    public String utilities;
    @SerializedName("Consumer Staples")
    @Expose
    public String consumerStaples;
    @SerializedName("Real Estate")
    @Expose
    public String realEstate;
    @SerializedName("Communication Services")
    @Expose
    public String communicationServices;
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
        return "RankH3YearPerformance{" +
                "informationTechnology='" + informationTechnology + '\'' +
                ", healthCare='" + healthCare + '\'' +
                ", consumerDiscretionary='" + consumerDiscretionary + '\'' +
                ", utilities='" + utilities + '\'' +
                ", consumerStaples='" + consumerStaples + '\'' +
                ", realEstate='" + realEstate + '\'' +
                ", communicationServices='" + communicationServices + '\'' +
                ", materials='" + materials + '\'' +
                ", financials='" + financials + '\'' +
                ", industrials='" + industrials + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }
}
