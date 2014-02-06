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
public class SalaryPlusCommissionEmployee extends SalariedEmployee implements Employee{
    double totalCommissionIncome;
    double commissionPayPercentage;

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
}
