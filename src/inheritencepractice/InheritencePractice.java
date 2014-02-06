/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritencepractice;

import myinterface.Employee;
import myinterface.HourlyEmployee;

/**
 *
 * @author Don
 */
public class InheritencePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        my.concrete.HourlyEmployee hourlyEmployee1 = new my.concrete.HourlyEmployee();
        hourlyEmployee1.setTotalHoursWorked(50.0);
        hourlyEmployee1.setStandardPayHoursWorked(40);
        
        
        my.concrete.Employee Employee1 = new my.concrete.Employee();
        Employee1.setName("Bill");
        Employee1.setIdNumber("000555");
        Employee1.setRegisterLoginID("Bill000555");
        Employee1.setRegisterLoginPassword("12345");
        //System.out.println(Employee1.getName());
        Employee1.getEmployeeInformation();
        
        
        my.concrete.SalariedEmployee salariedEmployee1 = new my.concrete.SalariedEmployee();
        salariedEmployee1.setBaseSalaryPay(50000);
        salariedEmployee1.setYearlyBonus(5000);
        salariedEmployee1.setName("Brad");
        salariedEmployee1.setIdNumber("000553");
        salariedEmployee1.setRegisterLoginID("brad00553");
        salariedEmployee1.setRegisterLoginPassword("5512ffd");
        //System.out.println(salariedEmployee1);
        
        salariedEmployee1.getEmployeeInformation();
       
        
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee();
    //System.out.println(HourlyEmployee.hourlyEmployee2());
        System.out.println("Name is " + myinterface.Employee.NAME + " ID number is " + myinterface.Employee.IDNUMBER + " Register login is " + myinterface.Employee.REGISTERLOGINID + " Register Login Password is " + myinterface.Employee.REGISTERLOGINPASSWORD);
    
        System.out.println(" Bill is a manager.  He has done a good job and will recieve a raise for the amount of ");
        
        System.out.println(hourlyEmployee2.getHourlyWage());
        
        
    }
    
}
