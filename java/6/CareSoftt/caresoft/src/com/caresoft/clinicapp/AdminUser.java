package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public  class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private ArrayList<String> securityIncidents;

    public AdminUser(Integer id) {
        this.id = id;
        this.securityIncidents = new ArrayList<>();
    }


    @Override
    public boolean assignPin(int pin) {
        String s = String.valueOf(pin);
        if (s.length() < 6) return false;
        this.pin = pin;
        return true;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        boolean ok = this.id != null && this.id.equals(confirmedAuthID);
        if (!ok) authIncident();
        return ok;
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return this.securityIncidents;
    }

    public void newIncident(String notes) {
        String report = String.format(
                "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n",
                new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format(
                "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n",
                new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }


}
