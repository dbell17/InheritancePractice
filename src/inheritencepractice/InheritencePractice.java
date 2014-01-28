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
        
    }
    
}
