package com.kodilla.backendkantor.client.aplhaVantage.performancerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SectPerformance {
    @SerializedName("Meta Data")
    @Expose
    public MetaData metaData;
    @SerializedName("Rank A: Real-Time Performance")
    @Expose
    public RankARealTimePerformance rankARealTimePerformance;
    @SerializedName("Rank B: 1 Day Performance")
    @Expose
    public RankB1DayPerformance rankB1DayPerformance;
    @SerializedName("Rank C: 5 Day Performance")
    @Expose
    public RankC5DayPerformance rankC5DayPerformance;
    @SerializedName("Rank D: 1 Month Performance")
    @Expose
    public RankD1MonthPerformance rankD1MonthPerformance;
    @SerializedName("Rank E: 3 Month Performance")
    @Expose
    public RankE3MonthPerformance rankE3MonthPerformance;
    @SerializedName("Rank F: Year-to-Date (YTD) Performance")
    @Expose
    public RankFYearToDateYTDPerformance rankFYearToDateYTDPerformance;
    @SerializedName("Rank G: 1 Year Performance")
    @Expose
    public RankG1YearPerformance rankG1YearPerformance;
    @SerializedName("Rank H: 3 Year Performance")
    @Expose
    public RankH3YearPerformance rankH3YearPerformance;
    @SerializedName("Rank I: 5 Year Performance")
    @Expose
    public RankI5YearPerformance rankI5YearPerformance;
    @SerializedName("Rank J: 10 Year Performance")
    @Expose
    public RankJ10YearPerformance rankJ10YearPerformance;

    @Override
    public String toString() {
        return "SectPerformance{" +
                "metaData=" + metaData +
                ", rankARealTimePerformance=" + rankARealTimePerformance +
                ", rankB1DayPerformance=" + rankB1DayPerformance +
                ", rankC5DayPerformance=" + rankC5DayPerformance +
                ", rankD1MonthPerformance=" + rankD1MonthPerformance +
                ", rankE3MonthPerformance=" + rankE3MonthPerformance +
                ", rankFYearToDateYTDPerformance=" + rankFYearToDateYTDPerformance +
                ", rankG1YearPerformance=" + rankG1YearPerformance +
                ", rankH3YearPerformance=" + rankH3YearPerformance +
                ", rankI5YearPerformance=" + rankI5YearPerformance +
                ", rankJ10YearPerformance=" + rankJ10YearPerformance +
                '}';
    }
}
