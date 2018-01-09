/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snt.formationtestunitaire.Lampe;

import java.util.UUID;

/**
 *
 * @author diallo028450
 */
public class Lampe {
    String id= UUID.randomUUID().toString();
    String emplacement;
    ETAT etat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public ETAT getEtat() {
        return etat;
    }

    public void setEtat(ETAT etat) {
        this.etat = etat;
    }
    
    
}
enum ETAT{
    ON,
    OFF;
}
