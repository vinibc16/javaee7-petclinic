package org.woehlke.javaee7.petclinic.web;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.logging.Logger;
import org.primefaces.context.RequestContext;


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
