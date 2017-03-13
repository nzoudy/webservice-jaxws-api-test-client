/**
 * BanqueWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zoudys;

public interface BanqueWS extends javax.xml.rpc.Service {
    public java.lang.String getBanquePortAddress();

    public com.zoudys.Banque getBanquePort() throws javax.xml.rpc.ServiceException;

    public com.zoudys.Banque getBanquePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
