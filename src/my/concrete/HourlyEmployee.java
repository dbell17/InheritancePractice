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
public class HourlyEmployee extends Employee{
    double hourlyWage;
    double standardPayHoursWorked;
    double overTimeHours;
    double overTimePay;
    double totalPay;
    double totalHoursWorked= standardPayHoursWorked + overTimeHours;

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = 9.00;
    }

    public double getStandardPayHoursWorked() {
        return standardPayHoursWorked;
    }

    public void setStandardPayHoursWorked(double standardPayHoursWorked) {
        this.standardPayHoursWorked = 0;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimePay() {
        return overTimePay;
    }

    public void setOverTimePay(double overTimePay) {
        this.overTimePay =  (overTimeHours * hourlyWage)*1.5;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(double totalHoursWorked) {
        this.totalHoursWorked = 0;
    }
    
    public double overTimePay(){
        if (totalHoursWorked > 40){
            overTimeHours =  totalHoursWorked - standardPayHoursWorked;
            totalPay = (standardPayHoursWorked*hourlyWage) + overTimePay;
            System.out.println("You have worked " + overTimeHours + " hours of overtime and will have made " + overTimePay + " from your overtime hours");
        }
        else{
            standardPayHoursWorked = totalHoursWorked;
        }
        
        return totalPay;
    }
}
