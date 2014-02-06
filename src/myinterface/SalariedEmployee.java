/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

import my.concrete.*;

/**
 *
 * @author Don
 */
public class SalariedEmployee implements Employee {

    private double baseSalaryPay;
    private double yearlyBonus;
    private double hourlyWage = 9.00;
    private double standardPayHoursWorked;
    private double overTimeHours;
    private double overTimePay;
    private double totalPay;
    private double totalHoursWorked;

    /**
     *
     * @return
     */
    @Override
    public double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double getStandardPayHoursWorked() {
        return standardPayHoursWorked;
    }

    @Override
    public void setStandardPayHoursWorked(double standardPayHoursWorked) {
        this.standardPayHoursWorked = standardPayHoursWorked;
    }

    /**
     *
     * @return
     */
    @Override
    public double getOverTimeHours() {
        return overTimeHours;
    }

    @Override
    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    @Override
    public double getOverTimePay() {
        return overTimePay;
    }
@Override
    public void setOverTimePay(double overTimePay) {
        this.overTimePay = overTimePay;
    }

    @Override
    public double getTotalPay() {
        return totalPay;
    }

   public void setTotalPay(double totalPay) {
        this.totalPay = standardPayHoursWorked*hourlyWage + overTimePay;
    }

    @Override
    public double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    @Override
    public void setTotalHoursWorked(double totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public SalariedEmployee() {
        this.baseSalaryPay = 0;
        this.yearlyBonus = 0;
    }

    public double getBaseSalaryPay() {
        return baseSalaryPay;
    }

    public void setBaseSalaryPay(double baseSalaryPay) {
        this.baseSalaryPay = baseSalaryPay;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
    
//    public void getEmployeeInformation() {
//        System.out.println("Salaried Employee 1's yearly pay is " + baseSalaryPay + " and thier yearly bonus can be " + yearlyBonus);
//
//    }


}
