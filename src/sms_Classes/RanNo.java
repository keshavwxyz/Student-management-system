/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms_Classes;

import java.util.Random;
import sms_GUI.NewAcc;
/**
 *
 * @author 12a1
 */
public class RanNo {
    public static void main() 
    {
            NewAcc na = new NewAcc();
            na.accTF.setText("null");
            
            Random rand = new Random(); 
            int rand_int1 = rand.nextInt(1000000000); 
            int r = String.valueOf(rand_int1).length();
            while(r!=8){
                rand_int1 = rand.nextInt(100000000); 
                r = String.valueOf(rand_int1).length();
            }
            System.out.println("Random Integers: "+rand_int1);

            na.accTF.setText(rand_int1+"");
    } 
}
