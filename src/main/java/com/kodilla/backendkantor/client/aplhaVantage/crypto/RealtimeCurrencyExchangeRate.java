package com.kodilla.backendkantor.client.aplhaVantage.crypto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RealtimeCurrencyExchangeRate {
    @SerializedName("1. From_Currency Code")
    @Expose
    public String _1FromCurrencyCode;
    @SerializedName("2. From_Currency Name")
    @Expose
    public String _2FromCurrencyName;
    @SerializedName("3. To_Currency Code")
    @Expose
    public String _3ToCurrencyCode;
    @SerializedName("4. To_Currency Name")
    @Expose
    public String _4ToCurrencyName;
    @SerializedName("5. Exchange Rate")
    @Expose
    public String _5ExchangeRate;
    @SerializedName("6. Last Refreshed")
    @Expose
    public String _6LastRefreshed;
    @SerializedName("7. Time Zone")
    @Expose
    public String _7TimeZone;
    @SerializedName("8. Bid Price")
    @Expose
    public String _8BidPrice;
    @SerializedName("9. Ask Price")
    @Expose
    public String _9AskPrice;

    @Override
    public String toString() {
        return "RealtimeCurrencyExchangeRate{" +
                "_1FromCurrencyCode='" + _1FromCurrencyCode + '\'' +
                ", _2FromCurrencyName='" + _2FromCurrencyName + '\'' +
                ", _3ToCurrencyCode='" + _3ToCurrencyCode + '\'' +
                ", _4ToCurrencyName='" + _4ToCurrencyName + '\'' +
                ", _5ExchangeRate='" + _5ExchangeRate + '\'' +
                ", _6LastRefreshed='" + _6LastRefreshed + '\'' +
                ", _7TimeZone='" + _7TimeZone + '\'' +
                ", _8BidPrice='" + _8BidPrice + '\'' +
                ", _9AskPrice='" + _9AskPrice + '\'' +
                '}';
    }
}
