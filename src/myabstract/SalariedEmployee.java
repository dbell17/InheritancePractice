/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

import my.concrete.*;

/**
 *
 * @author Don
 */
public class SalariedEmployee extends Employee{
    double baseSalaryPay;
    double yearlyBonus;

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
    @Override
    public void getEmployeeInformation() {
        System.out.println("Salaried Employee 1's yearly pay is " + baseSalaryPay + " and thier yearly bonus can be " + yearlyBonus );
            
    }

}

