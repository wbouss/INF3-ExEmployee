/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.model;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author wbouss
 */
public class ModelImpl {

    private DataSource datasource;
    
    public ModelImpl() {
    }
    
    public  DataSource getDatasource () {
        return this.datasource;
    }
    
    public void setDatasource (DataSource datasource) {
        this.datasource= datasource;
    }
   
    private Connection getConnection() throws SQLException {
    return this.getDatasource().getConnection();
    }
    
    
}
