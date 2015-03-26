/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts.model;

import java.util.ArrayList;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author Yacouba
 */
public interface InterfaceEmployeeManagement {

    public void deleteEmploye(String username);

    public String getUser(String username, String password);

    public ActionForm buildEmployeForm(String username);

    public ArrayList getEmployes();

    public void updateUser(ActionForm form);

    public void insertUser(ActionForm form);

}
