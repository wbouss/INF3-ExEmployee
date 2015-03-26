/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package com.myapp.struts.model;

import com.myapp.struts.bean.Employe;
import com.myapp.struts.formbean.EmployeForm;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author Yacouba
 */
public class EmployeeManagement implements InterfaceEmployeeManagement {

    private static Connection conn = null;

    /**
     * @return the conn
     */
    public static Connection getConn() {
        return conn;
    }

    /**
     * @param aConn the conn to set
     */
    public static void setConn(Connection aConn) {
        conn = aConn;
    }

    // Constructeur privé
    public EmployeeManagement() throws NamingException {

        try {
            //Find a database connection in JNDI
            javax.naming.InitialContext ctx = new javax.naming.InitialContext();
            javax.sql.DataSource ds = (javax.sql.DataSource) ctx.lookup("jdbc/myDatasource");
            java.sql.Connection c = ds.getConnection();
            conn = c;
        } catch (java.sql.SQLException e) {

        }

    }

    @Override
    public void deleteEmploye(String username) {
        String user = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = EmployeeManagement.getConn().createStatement();
            StringBuilder sqlString
                    = new StringBuilder("delete from employes where username='");
            sqlString.append(username).append("'");

            boolean execute = stmt.execute(sqlString.toString());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getUser(String username, String password) {

        String user = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = EmployeeManagement.getConn().createStatement();

            rs = stmt.executeQuery("select * from employes where username=\'"
                    + username + "' "
                    + "and password='" + password + "'");

            if (rs.next()) {

                user = rs.getString("username");
                //  Iteration sur le resultat
                System.err.println("Username : "
                        + user
                        + " Password : " + rs.getString("password"));
            } else {

                System.err.println("---->Utilisateur non trouve<----");
            }
        } catch (SQLException e) {

            System.err.println(e.getMessage());
        }
        return user;
    }

    @Override
    public ActionForm buildEmployeForm(String username) {

        String user = null;
        Statement stmt = null;
        ResultSet rs = null;
        EmployeForm form = null;

        try {

            stmt = EmployeeManagement.getConn().createStatement();
            rs = stmt.executeQuery("select * from employes where username=\'"
                    + username + "'");

            if (rs.next()) {

                form = new EmployeForm();

                form.setUsername(rs.getString("username"));
                form.setPassword(rs.getString("password"));
                form.setDepid(rs.getString("depid"));
                form.setRoleid(rs.getString("roleid"));
                String name = rs.getString("name");
                System.err.println("---->" + name + "<----");
                form.setName(name);
                form.setPhone(rs.getString("phone"));
                form.setEmail(rs.getString("email"));
            } else {

                throw new Exception("Employe " + username + " non trouve!");
            }
        } catch (SQLException e) {

            System.err.println(e.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(EmployeeManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return form;
    }

    @Override
    public ArrayList getEmployes() {
        Employe employe;
        ArrayList employes = new ArrayList();
        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = EmployeeManagement.getConn().createStatement();
            rs
                    = stmt.executeQuery("select * from employes, roles, "
                            + "services where employes.roleid=roles.roleid "
                            + "and employes.depid=services.depid");

            while (rs.next()) {

                employe = new Employe();

                employe.setUsername(rs.getString("username"));
                employe.setName(rs.getString("name"));
                employe.setRolename(rs.getString("rolename"));
                employe.setPhone(rs.getString("phone"));
                employe.setEmail(rs.getString("email"));
                employe.setRoleid((Integer) (rs.getInt("roleid")));
                employe.setDepid((Integer) (rs.getInt("depid")));
                employe.setDepartment(rs.getString("depname"));

                employes.add(employe);

                System.err.println("Username : " + employe.getUsername()
                        + " Department : " + employe.getDepartment());
            }
        } catch (SQLException e) {

            System.err.println(e.getMessage());
        }

        return employes;
    }

    @Override
    public void updateUser(ActionForm form) {
        String user = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            EmployeForm eForm = (EmployeForm) form;

            stmt = EmployeeManagement.getConn().createStatement();

            StringBuilder sqlString
                    = new StringBuilder("update employes set password='");

            sqlString.append(eForm.getPassword());
            sqlString.append("', ");
            sqlString.append("roleid=");
            sqlString.append(eForm.getRoleid());
            sqlString.append(", ");
            sqlString.append("name='");
            sqlString.append(eForm.getName());
            sqlString.append("', ");
            sqlString.append("phone='");
            sqlString.append(eForm.getPhone());
            sqlString.append("', ");
            sqlString.append("email='");
            sqlString.append(eForm.getEmail());
            sqlString.append("', ");
            sqlString.append("depid=");
            sqlString.append(eForm.getDepid());
            sqlString.append(" where username='");
            sqlString.append(eForm.getUsername());
            sqlString.append("'");
            stmt.execute(sqlString.toString());
        } catch (SQLException e) {

            System.err.println(e.getMessage());
        }
    }

    @Override
    public void insertUser(ActionForm form) {
        String user = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            EmployeForm eForm = (EmployeForm) form;

            stmt = EmployeeManagement.getConn().createStatement();

            StringBuilder sqlString
                    = new StringBuilder("insert into employes values ('");

            sqlString.append(eForm.getUsername()).append("', ");
            sqlString.append("'").append(eForm.getPassword()).append("', ");
            sqlString.append("'").append(eForm.getName()).append("', ");
            sqlString.append(eForm.getRoleid()).append(", ");
            sqlString.append("'").append(eForm.getPhone()).append("', ");
            sqlString.append("'").append(eForm.getEmail()).append("', ");
            sqlString.append(eForm.getDepid()).append(")");

            stmt.execute(sqlString.toString());
        } catch (SQLException e) {

            System.err.println(e.getMessage());
        }
    }

}
