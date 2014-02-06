/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;



/**
 *
 * @author Don
 */
public interface Employee{
     public abstract double getHourlyWage();
     public abstract void setHourlyWage(double hourlyWage);
     public abstract double getStandardPayHoursWorked();
     public abstract void setStandardPayHoursWorked(double standardPayHoursWorked);
     public abstract double getOverTimeHours();
     public abstract void setOverTimeHours(double overTimeHours);
     public abstract double getOverTimePay();
     public abstract void setOverTimePay(double overTimePay);
     public abstract double getTotalPay(); 
     public abstract void setTotalPay(double TotalPay);
     public abstract double getTotalHoursWorked();
     public abstract void setTotalHoursWorked(double totalHoursWorked);
     

}
