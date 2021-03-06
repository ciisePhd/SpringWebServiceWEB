package spring.tutorial.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2015-10-03T22:39:54.766-04:00
 * Generated source version: 3.1.3
 * 
 */
@WebServiceClient(name = "IBanAcountServiceService", 
                  wsdlLocation = "file:/Users/mohammed/Dev/Projects/workspace/SpringWebServiceWEB/src/main/resources/IBanAcountService.wsdl",
                  targetNamespace = "http://service.tutorial.spring/") 
public class IBanAcountServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.tutorial.spring/", "IBanAcountServiceService");
    public final static QName IBanAcountServicePort = new QName("http://service.tutorial.spring/", "IBanAcountServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/mohammed/Dev/Projects/workspace/SpringWebServiceWEB/src/main/resources/IBanAcountService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IBanAcountServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/mohammed/Dev/Projects/workspace/SpringWebServiceWEB/src/main/resources/IBanAcountService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IBanAcountServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IBanAcountServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IBanAcountServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public IBanAcountServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public IBanAcountServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public IBanAcountServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns IBanAcountService
     */
    @WebEndpoint(name = "IBanAcountServicePort")
    public IBanAcountService getIBanAcountServicePort() {
        return super.getPort(IBanAcountServicePort, IBanAcountService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IBanAcountService
     */
    @WebEndpoint(name = "IBanAcountServicePort")
    public IBanAcountService getIBanAcountServicePort(WebServiceFeature... features) {
        return super.getPort(IBanAcountServicePort, IBanAcountService.class, features);
    }

}
