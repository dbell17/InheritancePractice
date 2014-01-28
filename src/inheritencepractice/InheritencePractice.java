/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritencepractice;

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
        hourlyEmployee1.overTimePay();
        
        my.concrete.Employee Employee1 = new my.concrete.Employee();
        Employee1.setName("Bill");
        Employee1.setIdNumber("000555");
        Employee1.setRegisterLoginID("Bill000555");
        Employee1.setRegisterLoginPassword("12345");
        //System.out.println(Employee1.getName());
        Employee1.employeeInformation();
        
        
    }
    
}
