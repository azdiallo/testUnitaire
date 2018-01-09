/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snt.formationtestunitaire.Lampe;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author diallo028450
 */
public class LampeRepositoryImpl implements LampeRepository {

    List<Lampe> lampes;

    public LampeRepositoryImpl(List<Lampe> lampes) {
        this.lampes = lampes;
    }

    @Override
    public void ajouter(Lampe lampe) throws LampePresenteException, ListeVideException {
        if (lampe.getId() != null) {
            throw new LampePresenteException("cette lampe se trouve deja dans la liste");
        } else {
            if (lampes == null) {
                lampes = new ArrayList<>();
            }
            lampe.setId(UUID.randomUUID().toString());
            lampes.add(lampe);
        }
    }

    @Override
    public void modifier(Lampe lampe) throws LampeAbsenteException, ListeVideException {
        if (lampe.getId() == null) {
            throw new LampeAbsenteException("cette lampe ne se trouve pas dans la liste");
        } else {
            if (lampes == null) {
                throw new ListeVideException("La liste des lampes est vide");
            }
            for (Lampe l : lampes) {
                if (l.getId().equals(lampe.getId())) {
                    l.setEmplacement(lampe.getEmplacement());
                    l.setEtat(lampe.getEtat());
                    return;
                }
            }
            throw new LampeAbsenteException("cette lampe ne se trouve pas dans la liste");

        }
    }

    @Override
    public List<Lampe> lister() {
        return lampes;
    }

}
