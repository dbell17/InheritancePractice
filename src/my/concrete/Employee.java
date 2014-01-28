/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Don
 */
public class Employee {
    String name;
    String idNumber;
    String registerLoginID;
    String registerLoginPassword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getRegisterLoginID() {
        return registerLoginID;
    }

    public void setRegisterLoginID(String registerLoginID) {
        this.registerLoginID = registerLoginID;
    }

    public String getRegisterLoginPassword() {
        return registerLoginPassword;
    }

    public void setRegisterLoginPassword(String registerLoginPassword) {
        this.registerLoginPassword =registerLoginPassword;
    }
    
    public void employeeInformation() {
        System.out.println("Employee 1's login password is " + registerLoginPassword + " and thier login ID is " + registerLoginID + ".  Their id number is " + idNumber + " and their name is " +  name);
            
    }
}
    

