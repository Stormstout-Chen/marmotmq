package com.cafebabe.marmotmq;

import com.cafebabe.marmotmq.net.NetWork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarmotmqApplication {

    public static void main(String[] args) {

        SpringApplication.run(MarmotmqApplication.class, args);
        new Thread(new NetWork()).start();

    }

}
