/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snt.formationtestunitaire;

import com.snt.service.PromotionCalculatorService;

/**
 *
 * @author diallo028450
 */
public class PromotionBusiness {

    PromotionCalculatorService calculator;

    public PromotionBusiness(PromotionCalculatorService calculator) {
        this.calculator = calculator;
    }

    public Double evaluerRemise(double prix, String produit){
        double remise;
        remise = calculator.evaluerRemise(produit, prix);
        return remise;
    }

}
