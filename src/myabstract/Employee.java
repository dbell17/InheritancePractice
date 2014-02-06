/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;



/**
 *
 * @author Don
 */
public abstract class Employee {
    private String name;
    private String idNumber;
    private String registerLoginID;
    private String registerLoginPassword;
    private double managerRaise = 5000.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.registerLoginPassword = registerLoginPassword;
    }

    public double getManagerRaise() {
        return managerRaise;
    }

    public void setManagerRaise(double managerRaise) {
        this.managerRaise = managerRaise;
    }
    
    public abstract void getEmployeeInformation();
}
