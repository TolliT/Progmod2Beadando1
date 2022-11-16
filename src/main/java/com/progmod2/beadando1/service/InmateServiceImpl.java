package com.progmod2.beadando1.service;

import com.progmod2.beadando1.model.Inmate;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class InmateServiceImpl implements InmateService {
    public static final Map<Integer, Inmate> inmateRepo = new HashMap<>();

    @Override
    public void addInmate(Inmate inmate) {
        inmateRepo.put(inmate.getId(), inmate);
    }

    @Override
    public Collection<Inmate> listInmates() {
        return inmateRepo.values();
    }
}
