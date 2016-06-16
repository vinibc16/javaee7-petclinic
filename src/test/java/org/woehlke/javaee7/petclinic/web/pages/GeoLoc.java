/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.woehlke.javaee7.petclinic.web.pages;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Location;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


/**
 *
 * @author psysvica
 */
@Location("geoloc.jsf")
public class GeoLoc {
    
    @Drone
    private WebDriver driver;
    
    public void assertTitle(){
        Assert.assertEquals("Localicação",driver.getTitle());
    }
}
