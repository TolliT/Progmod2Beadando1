package com.progmod2.beadando1.controller;

import com.opencsv.CSVReader;
import com.progmod2.beadando1.model.GenderEnum;
import com.progmod2.beadando1.model.Inmate;

import java.io.FileReader;
import java.io.IOException;

import static com.progmod2.beadando1.service.InmateServiceImpl.inmateRepo;

public class FileIO {
    private static final String filePath = "src/main/resources/static/db.csv";

    public static void importInmates() throws IOException {

        FileReader file = new FileReader(filePath);
        CSVReader reader = new CSVReader(file);

        String[] record;

        while((record = reader.readNext()) != null){
            Inmate inmate = new Inmate();
            inmate.setId(Integer.valueOf(record[0]));
            inmate.setName(record[1]);
            inmate.setGender(GenderEnum.valueOf(record[2]));
            inmateRepo.put(inmate.getId(), inmate);
        }
    }
}
