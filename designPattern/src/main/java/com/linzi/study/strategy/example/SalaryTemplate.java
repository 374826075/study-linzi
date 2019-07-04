package com.linzi.study.strategy.example;

import com.linzi.study.strategy.example.salaryInterface.Bonus;
import com.linzi.study.strategy.example.salaryInterface.Salary;
import com.linzi.study.strategy.example.salaryInterface.Tax;

/**
 * com.linzi.study.strategy.example.SalaryTemplate
 *
 * @Description: 工资模板
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-04
 */
public class SalaryTemplate {
    private Bonus bonus;
    private Tax tax;
    private Salary salary;

    public void computer () {
        salary.computerSalary();
        bonus.computerBonus();
        tax.computerTax();
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
