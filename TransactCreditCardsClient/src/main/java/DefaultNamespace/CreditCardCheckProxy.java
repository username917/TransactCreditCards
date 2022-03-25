package DefaultNamespace;

public class CreditCardCheckProxy implements DefaultNamespace.CreditCardCheck {
  private String _endpoint = null;
  private DefaultNamespace.CreditCardCheck creditCardCheck = null;
  
  public CreditCardCheckProxy() {
    _initCreditCardCheckProxy();
  }
  
  public CreditCardCheckProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreditCardCheckProxy();
  }
  
  private void _initCreditCardCheckProxy() {
    try {
      creditCardCheck = (new DefaultNamespace.CreditCardCheckServiceLocator()).getCreditCardCheck();
      if (creditCardCheck != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)creditCardCheck)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)creditCardCheck)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (creditCardCheck != null)
      ((javax.xml.rpc.Stub)creditCardCheck)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.CreditCardCheck getCreditCardCheck() {
    if (creditCardCheck == null)
      _initCreditCardCheckProxy();
    return creditCardCheck;
  }
  
  public java.lang.String checkCCNumber(java.lang.String cardNumber) throws java.rmi.RemoteException{
    if (creditCardCheck == null)
      _initCreditCardCheckProxy();
    return creditCardCheck.checkCCNumber(cardNumber);
  }
  
  
}