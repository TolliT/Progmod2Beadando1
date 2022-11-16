package com.progmod2.beadando1;

import com.progmod2.beadando1.controller.FileIO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Beadando1Application {

    public static void main(String[] args) {
        SpringApplication.run(Beadando1Application.class, args);
        try {
            FileIO.importInmates();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
