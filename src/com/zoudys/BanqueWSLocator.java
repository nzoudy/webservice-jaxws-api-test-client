/**
 * BanqueWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zoudys;

public class BanqueWSLocator extends org.apache.axis.client.Service implements com.zoudys.BanqueWS {

    public BanqueWSLocator() {
    }


    public BanqueWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BanqueWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BanquePort
    private java.lang.String BanquePort_address = "http://192.168.56.1:8585/";

    public java.lang.String getBanquePortAddress() {
        return BanquePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BanquePortWSDDServiceName = "BanquePort";

    public java.lang.String getBanquePortWSDDServiceName() {
        return BanquePortWSDDServiceName;
    }

    public void setBanquePortWSDDServiceName(java.lang.String name) {
        BanquePortWSDDServiceName = name;
    }

    public com.zoudys.Banque getBanquePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BanquePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBanquePort(endpoint);
    }

    public com.zoudys.Banque getBanquePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zoudys.BanquePortBindingStub _stub = new com.zoudys.BanquePortBindingStub(portAddress, this);
            _stub.setPortName(getBanquePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBanquePortEndpointAddress(java.lang.String address) {
        BanquePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zoudys.Banque.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zoudys.BanquePortBindingStub _stub = new com.zoudys.BanquePortBindingStub(new java.net.URL(BanquePort_address), this);
                _stub.setPortName(getBanquePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BanquePort".equals(inputPortName)) {
            return getBanquePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://zoudys.com/", "BanqueWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://zoudys.com/", "BanquePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BanquePort".equals(portName)) {
            setBanquePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
