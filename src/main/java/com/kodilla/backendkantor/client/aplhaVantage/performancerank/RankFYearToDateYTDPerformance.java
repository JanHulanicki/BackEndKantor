package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankFYearToDateYTDPerformance {
    @SerializedName("Health Care")
    @Expose
    public String healthCare;
    @SerializedName("Information Technology")
    @Expose
    public String informationTechnology;
    @SerializedName("Consumer Discretionary")
    @Expose
    public String consumerDiscretionary;
    @SerializedName("Consumer Staples")
    @Expose
    public String consumerStaples;
    @SerializedName("Communication Services")
    @Expose
    public String communicationServices;
    @SerializedName("Utilities")
    @Expose
    public String utilities;
    @SerializedName("Real Estate")
    @Expose
    public String realEstate;
    @SerializedName("Materials")
    @Expose
    public String materials;
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
        return "RankFYearToDateYTDPerformance{" +
                "healthCare='" + healthCare + '\'' +
                ", informationTechnology='" + informationTechnology + '\'' +
                ", consumerDiscretionary='" + consumerDiscretionary + '\'' +
                ", consumerStaples='" + consumerStaples + '\'' +
                ", communicationServices='" + communicationServices + '\'' +
                ", utilities='" + utilities + '\'' +
                ", realEstate='" + realEstate + '\'' +
                ", materials='" + materials + '\'' +
                ", industrials='" + industrials + '\'' +
                ", financials='" + financials + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }
}
