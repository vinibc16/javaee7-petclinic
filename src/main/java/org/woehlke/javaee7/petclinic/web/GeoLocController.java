package org.woehlke.javaee7.petclinic.web;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.logging.Logger;
import org.primefaces.context.RequestContext;


/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 06.01.14
 * Time: 16:24
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class GeoLocController implements Serializable {

    private static Logger log = Logger.getLogger(GeoLocController.class.getName());

    private String findAddr;

    public String getFindAddr() {
        return findAddr;
    }

    public void setFindAddr(String findAddr) {
        this.findAddr = findAddr;
    }
    
    public void executarJS() {
        //GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyDjrmE1sYuw5nE8K2pIIQ8olBelfa1bKo8");
        //GeocodingResult[] results =  GeocodingApi.geocode(context,
        //"1600 Amphitheatre Parkway Mountain View, CA 94043").await();
        String var = "carregarNoMapa('"+findAddr+"')";
        //RequestContext.getCurrentInstance().execute("alert('oi')");
        RequestContext.getCurrentInstance().execute(var);
        //return "";
    }
}
