/**
 * Banque.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zoudys;

public interface Banque extends java.rmi.Remote {
    public java.lang.String test() throws java.rmi.RemoteException;
    public double conversionEuroFcfa(double montant) throws java.rmi.RemoteException;
}
