package com.zoudys;

public class BanqueProxy implements com.zoudys.Banque {
  private String _endpoint = null;
  private com.zoudys.Banque banque = null;
  
  public BanqueProxy() {
    _initBanqueProxy();
  }
  
  public BanqueProxy(String endpoint) {
    _endpoint = endpoint;
    _initBanqueProxy();
  }
  
  private void _initBanqueProxy() {
    try {
      banque = (new com.zoudys.BanqueWSLocator()).getBanquePort();
      if (banque != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)banque)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)banque)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (banque != null)
      ((javax.xml.rpc.Stub)banque)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.zoudys.Banque getBanque() {
    if (banque == null)
      _initBanqueProxy();
    return banque;
  }
  
  public java.lang.String test() throws java.rmi.RemoteException{
    if (banque == null)
      _initBanqueProxy();
    return banque.test();
  }
  
  public double conversionEuroFcfa(double montant) throws java.rmi.RemoteException{
    if (banque == null)
      _initBanqueProxy();
    return banque.conversionEuroFcfa(montant);
  }
  
  
}