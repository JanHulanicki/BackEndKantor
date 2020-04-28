package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankD1MonthPerformance {
    @SerializedName("Energy")
    @Expose
    public String energy;
    @SerializedName("Health Care")
    @Expose
    public String healthCare;
    @SerializedName("Utilities")
    @Expose
    public String utilities;
    @SerializedName("Materials")
    @Expose
    public String materials;
    @SerializedName("Real Estate")
    @Expose
    public String realEstate;
    @SerializedName("Consumer Discretionary")
    @Expose
    public String consumerDiscretionary;
    @SerializedName("Industrials")
    @Expose
    public String industrials;
    @SerializedName("Information Technology")
    @Expose
    public String informationTechnology;
    @SerializedName("Financials")
    @Expose
    public String financials;
    @SerializedName("Consumer Staples")
    @Expose
    public String consumerStaples;
    @SerializedName("Communication Services")
    @Expose
    public String communicationServices;

    @Override
    public String toString() {
        return "RankD1MonthPerformance{" +
                "energy='" + energy + '\'' +
                ", healthCare='" + healthCare + '\'' +
                ", utilities='" + utilities + '\'' +
                ", materials='" + materials + '\'' +
                ", realEstate='" + realEstate + '\'' +
                ", consumerDiscretionary='" + consumerDiscretionary + '\'' +
                ", industrials='" + industrials + '\'' +
                ", informationTechnology='" + informationTechnology + '\'' +
                ", financials='" + financials + '\'' +
                ", consumerStaples='" + consumerStaples + '\'' +
                ", communicationServices='" + communicationServices + '\'' +
                '}';
    }
}
