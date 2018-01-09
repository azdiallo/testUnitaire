/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snt.service;

/**
 *
 * @author diallo028450
 */
public interface PromotionCalculatorService {

    public double evaluerRemisePrix(double prix);
    
    public double evaluerRemiseCategorie(String produit);
    
    public double evaluerRemise (String produit,double prix);

}
