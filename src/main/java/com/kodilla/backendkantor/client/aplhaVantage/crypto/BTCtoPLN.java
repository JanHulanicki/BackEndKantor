package com.kodilla.backendkantor.client.aplhaVantage.crypto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BTCtoPLN {

    @SerializedName("Realtime Currency Exchange Rate")
    @Expose
    public RealtimeCurrencyExchangeRate realtimeCurrencyExchangeRate;

    @Override
    public String toString() {
        return "BTCtoPLN{" +
                "realtimeCurrencyExchangeRate=" + realtimeCurrencyExchangeRate +
                '}';
    }
}
