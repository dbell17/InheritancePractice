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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{

    public double getTotalCommissionIncome() {
        return totalCommissionIncome;
    }

    public void setTotalCommissionIncome(double totalCommissionIncome) {
        this.totalCommissionIncome = totalCommissionIncome;
    }

    public double getCommissionPayPercentage() {
        return commissionPayPercentage;
    }

    public void setCommissionPayPercentage(double commissionPayPercentage) {
        this.commissionPayPercentage = commissionPayPercentage;
    }
    double totalCommissionIncome;
    double commissionPayPercentage;
    
    @Override
    public void getEmployeeInformation() {
        System.out.println("Salaried Employee 1's yearly pay is " + baseSalaryPay + " and thier yearly bonus can be " + yearlyBonus );
            
    }
}
