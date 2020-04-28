package com.kodilla.backendkantor.client.nbp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kodilla.backendkantor.client.QuantlBigMac;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

@Component
public class NbpClientTest {
    public void getStreamInfo() throws IOException {


        URL url = new URL("https://api.nbp.pl/api/exchangerates/rates/a/chf/?format=json");
        URL url1 = new URL("https://api.nbp.pl/api/exchangerates/tables/a/?format=json");
       // URL url2 = new URL( "https://www.quandl.com/api/v3/datasets/ECONOMIST/BIGMAC_POL.json?api_key=Yy5sN2mVzSWjjjiymiWW");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        InputStreamReader reader1 = new InputStreamReader(url1.openStream());
       // InputStreamReader reader2 = new InputStreamReader(url2.openStream());
        NbpChAv nbpChAv = new Gson().fromJson(reader, NbpChAv.class);
        List<NbpAvTab> nbpAvTab = new Gson().fromJson(reader1, new TypeToken<List<NbpAvTab>>() {
        }.getType());
        QuantlBigMac quantlBigMac = new Gson().fromJson(reader, QuantlBigMac.class);
        System.out.println(nbpChAv.toString());
        System.out.println(nbpAvTab.toString());
//        System.out.println(quantlBigMac.toString());
    }
}
