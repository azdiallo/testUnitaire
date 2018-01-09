/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snt.impl;

import com.snt.service.PromotionCalculatorService;



/**
 *
 * @author diallo028450
 */
public class PromoCalculatorServiceImpl implements PromotionCalculatorService {

    @Override
    public double evaluerRemiseCategorie(String produit) {
        double remise = 0;
        if (produit.startsWith("A")) {
            remise += 15;
        }
        if (produit.startsWith("B")) {
            remise += 5;
        }
        return remise;
    }
    
    @Override
    public double evaluerRemisePrix(double prix) {
        double remise = 0;
        if (prix > 500) {
            remise += 2;
        }
        return remise;
    }
    
    @Override
    public double evaluerRemise (String produit,double prix){
        if(produit == null)
        {
            throw new IllegalArgumentException("Le produit n'existe pas");
        }
        if(prix <= 0)
        {
            throw new IllegalArgumentException("Le produit n'existe pas");
        }
        if("".equals(produit))
        {
            throw new IllegalArgumentException("Le nom du produit est vide");
        }
        
        double remise = 0;
        remise +=evaluerRemiseCategorie(produit);
        remise +=evaluerRemisePrix(prix);
        return remise;
    }
}
