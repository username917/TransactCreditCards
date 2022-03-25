/**
 * CreditCardCheckServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class CreditCardCheckServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.CreditCardCheckService {

    public CreditCardCheckServiceLocator() {
    }


    public CreditCardCheckServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreditCardCheckServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreditCardCheck
    private java.lang.String CreditCardCheck_address = "http://localhost:8080/TransactCreditCards/services/CreditCardCheck";

    public java.lang.String getCreditCardCheckAddress() {
        return CreditCardCheck_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreditCardCheckWSDDServiceName = "CreditCardCheck";

    public java.lang.String getCreditCardCheckWSDDServiceName() {
        return CreditCardCheckWSDDServiceName;
    }

    public void setCreditCardCheckWSDDServiceName(java.lang.String name) {
        CreditCardCheckWSDDServiceName = name;
    }

    public DefaultNamespace.CreditCardCheck getCreditCardCheck() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreditCardCheck_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreditCardCheck(endpoint);
    }

    public DefaultNamespace.CreditCardCheck getCreditCardCheck(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.CreditCardCheckSoapBindingStub _stub = new DefaultNamespace.CreditCardCheckSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreditCardCheckWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreditCardCheckEndpointAddress(java.lang.String address) {
        CreditCardCheck_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.CreditCardCheck.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.CreditCardCheckSoapBindingStub _stub = new DefaultNamespace.CreditCardCheckSoapBindingStub(new java.net.URL(CreditCardCheck_address), this);
                _stub.setPortName(getCreditCardCheckWSDDServiceName());
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
        if ("CreditCardCheck".equals(inputPortName)) {
            return getCreditCardCheck();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "CreditCardCheckService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "CreditCardCheck"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreditCardCheck".equals(portName)) {
            setCreditCardCheckEndpointAddress(address);
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
