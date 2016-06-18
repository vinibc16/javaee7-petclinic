package org.woehlke.javaee7.petclinic.web;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.event.ValueChangeEvent;
import org.primefaces.context.RequestContext;


/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 06.01.14
 * Time: 16:24
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@RequestScoped
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
        String var = "carregarNoMapa('"+findAddr+"')";
        RequestContext.getCurrentInstance().execute(var);
    }
}
