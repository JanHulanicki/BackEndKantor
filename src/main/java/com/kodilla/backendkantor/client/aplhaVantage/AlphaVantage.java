package com.kodilla.backendkantor.client.aplhaVantage;

import com.google.gson.Gson;
import com.kodilla.backendkantor.client.aplhaVantage.crypto.BTCtoPLN;
import com.kodilla.backendkantor.client.aplhaVantage.performancerank.SectPerformance;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@Component
public class AlphaVantage {
    public void getStreamInfo() throws IOException {


        URL url = new URL("https://www.alphavantage.co/query?function=SECTOR&apikey=C8WU9BD08FJLFMSD");
        URL url1 = new URL("https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE&from_currency=BTC&to_currency=PLN&apikey=C8WU9BD08FJLFMSD");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        InputStreamReader reader1 = new InputStreamReader(url1.openStream());
        SectPerformance sectPerformance = new Gson().fromJson(reader, SectPerformance.class);
        BTCtoPLN btCtoPLN = new Gson().fromJson(reader1, BTCtoPLN.class);
        System.out.println(sectPerformance.toString());
        System.out.println(btCtoPLN.toString());

    }
}
