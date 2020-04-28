package com.kodilla.backendkantor.service;

import com.kodilla.backendkantor.client.nbp.NbpClientTest;
import com.kodilla.backendkantor.client.aplhaVantage.AlphaVantage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExternSourceTestSuite {
    @Autowired
    NbpClientTest nbpClientTest;
    @Autowired
    AlphaVantage alphaVantage;
    @Test
    public void exSourceTest() throws IOException {
        nbpClientTest.getStreamInfo();
        alphaVantage.getStreamInfo();


    }

}
