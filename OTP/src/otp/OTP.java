/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp;

/**
 *
 * @author Mr__.Solanki
 */
public class OTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("your otp:"+ generateOtp());
    }
    public static int generateOtp(){
        int otp=(int) (Math.random()*1000000);
           return otp;
    }
}
