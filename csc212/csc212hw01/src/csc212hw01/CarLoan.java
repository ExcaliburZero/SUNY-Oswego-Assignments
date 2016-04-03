/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw01;

/**
 *
 * @author chris
 */
public class CarLoan {
    
    // Variables
    public String bankName;
    public int accountNumber;
    public Person signer;
    public Person coSigner;
    
    // Methods
    public String getInfo() {
        return bankName + " " + accountNumber;
    }
}
