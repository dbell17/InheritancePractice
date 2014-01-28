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
    double hourlyWage=9.00;
    double standardPayHoursWorked;
    double overTimeHours;
    double overTimePay;
    double totalPay;
    double totalHoursWorked;

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getStandardPayHoursWorked() {
        return standardPayHoursWorked;
    }

    public void setStandardPayHoursWorked(double standardPayHoursWorked) {
        this.standardPayHoursWorked = standardPayHoursWorked;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = totalHoursWorked - standardPayHoursWorked;
    }

    public double getOverTimePay() {
        return overTimePay;
    }

    public void setOverTimePay(double overTimePay) {
        this.overTimePay =  overTimePay;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay() {
        this.totalPay = standardPayHoursWorked*hourlyWage + overTimePay;
    }

    public double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(double totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
    
    public double overTimePay(){
        if (totalHoursWorked > 40){
            overTimeHours =  totalHoursWorked - standardPayHoursWorked;
            
            System.out.println("You have worked " + overTimeHours + " hours of overtime");
        }
        else{
            standardPayHoursWorked = totalHoursWorked;
        }
        return totalPay;
    }
}
