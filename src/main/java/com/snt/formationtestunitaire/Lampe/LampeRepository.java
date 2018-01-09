/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snt.formationtestunitaire.Lampe;

import java.util.List;

/**
 *
 * @author diallo028450
 */
public interface LampeRepository {
    
    public void ajouter(Lampe lampe) throws LampePresenteException, ListeVideException;

    public void modifier(Lampe lampe) throws LampeAbsenteException, ListeVideException;

    public List<Lampe> lister();

}

//tester lampRepository
