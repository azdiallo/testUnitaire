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
public class LampeServiceImpl implements LampeService{
    
    LampeRepository lampRepo;

    public LampeServiceImpl(LampeRepository lampRepo) {
        this.lampRepo=lampRepo;
    }
    
    

    @Override
    public void allumerToutesLesLampes() throws LampeDejaAllumeeException, LampeAbsenteException, ListeVideException, RepoNullException{
        List<Lampe> listeLampes= lampRepo.lister();
        
        for(Lampe lampe: listeLampes){
            if(ETAT.ON.equals(lampe.getEtat())){
                throw new LampeDejaAllumeeException("une des lampes est deja allumee");
            }
            if(lampRepo == null){
                throw new RepoNullException("Le repository est null");
            }
            lampe.setEtat(ETAT.ON);
            lampRepo.modifier(lampe);
        }
    }

    @Override
    public void eteindreToutesLesLampes() throws LampeDejaEteinteException, LampeAbsenteException, ListeVideException, RepoNullException{
        List<Lampe> listeLampes= lampRepo.lister();
        
        for(Lampe lampe: listeLampes){
            if(ETAT.OFF.equals(lampe.getEtat())){
                throw new LampeDejaEteinteException("une des lampes est deja eteinte");
            }
            if(lampRepo == null){
                throw new RepoNullException("Le repository est null");
            }
            lampe.setEtat(ETAT.OFF);
            lampRepo.modifier(lampe);
        }
    }
    
}
