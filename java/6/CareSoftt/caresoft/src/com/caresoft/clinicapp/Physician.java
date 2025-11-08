package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    private ArrayList<String> patientNotes;

    public Physician(Integer id) {
        this.id = id;                 // from User
        this.patientNotes = new ArrayList<>();
    }



    @Override
    public boolean assignPin(int pin) {
        if (pin < 1000 || pin > 9999) return false;
        this.pin = pin;
        return true;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return this.id != null && this.id.equals(confirmedAuthID);
    }





}
