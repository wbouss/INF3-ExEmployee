/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.model;

/**
 *
 * @author wbouss
 */
public interface Model {
    
    public void deleteEmploye(String username );
    public void editEmploye(String username,String password, String name,int roleid, String phone,String email,int depid);
    public void createEmploye(String username,String password, String name,int roleid, String phone,String email,int depid);
    public Employe getEmploye(String username);
}
