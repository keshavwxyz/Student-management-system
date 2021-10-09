/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_Classes;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sms_login.Main_Login_new;

/**
 *
 * @author 12a1
 */
public class main_func {
    public void lol(String password,String user) throws NoSuchAlgorithmException {

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashInBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

            StringBuilder sb = new StringBuilder();
            for (byte b : hashInBytes) {
                sb.append(String.format("%02x", b));
            }
            System.out.println(sb.toString());
            String r = sb.toString();
            Main_Login_new ml = new Main_Login_new();
            ml.login(r,user);
            
    }
}
