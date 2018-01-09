/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snt.formationtestunitaire.Lampe;

/**
 *
 * @author diallo028450
 */
public interface LampeService {
    
    public void allumerToutesLesLampes() throws LampeDejaAllumeeException, LampeAbsenteException, ListeVideException, RepoNullException;
    
    public void eteindreToutesLesLampes() throws LampeDejaEteinteException, LampeAbsenteException, ListeVideException, RepoNullException;
    
}
