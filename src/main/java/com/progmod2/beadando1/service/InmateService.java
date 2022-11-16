package com.progmod2.beadando1.service;

import com.progmod2.beadando1.model.Inmate;
import java.util.Collection;

public interface InmateService {
    void addInmate(Inmate inmate);
    Collection<Inmate> listInmates();
}
