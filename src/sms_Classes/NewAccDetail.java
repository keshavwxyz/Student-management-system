/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_Classes;

import dbconnection.dbconnection2;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 12a1
 */


public class NewAccDetail {
    String sql,sql1,sql3;
    PreparedStatement ps,ps1,ps2;
    ResultSet rs,rs1,rs2;
    int a,b,c,d;
    
    public void newDetail(){
        try{
                sql = "SELECT idNo,Accno FROM AccNo";
                ps = dbconnection2.getConnection().prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    a = rs.getInt("idNo");
                    b = rs.getInt("Accno");
                    System.out.println("First"+a+"\n"+b);
                        sql1="SELECT COUNT(AccDetail) FROM AccDetail where AccDetail="+b+"";
                        ps1 = dbconnection2.getConnection().prepareStatement(sql);
                        rs1 = ps1.executeQuery();
                        while(rs1.next()){
                            c = rs.getInt("COUNT(AccDetail)");
                        }    
                        if(c==1){
                            System.out.println("LOL");
                        }
                        else if(c==0){
                            sql3 = "INSERT INTO AccDetail VALUE ("+c+","+d+",25000)";
                            System.out.println(sql3);
                            ps2 = dbconnection2.getConnection().prepareStatement(sql3);
                            ps2.executeUpdate();
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Sorry !!!\n something went wrong");
                        }
                
                }
                JOptionPane.showMessageDialog(null,"All Accounts has been updated!!!");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
    } 
}