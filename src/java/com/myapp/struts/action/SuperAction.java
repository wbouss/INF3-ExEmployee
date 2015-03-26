/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts.action;

import com.myapp.struts.model.EmployeeManagement;
import com.myapp.struts.model.InterfaceEmployeeManagement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import org.apache.struts.action.Action;

/**
 *
 * @author Yacouba
 */
public class SuperAction extends Action {

    protected InterfaceEmployeeManagement service;

    public SuperAction() {

        try {
            this.service = new EmployeeManagement();
        } catch (NamingException ex) {
            Logger.getLogger(SuperAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the service
     */
    public InterfaceEmployeeManagement getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(InterfaceEmployeeManagement service) {
        this.service = service;
    }

}
