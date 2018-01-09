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
public class ListeVideException extends Exception {

    /**
     * Creates a new instance of <code>LampeDejaAllumeeException</code> without
     * detail message.
     */
    public ListeVideException() {
    }

    /**
     * Constructs an instance of <code>LampeDejaAllumeeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ListeVideException(String msg) {
        super(msg);
    }
}
