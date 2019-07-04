package com.linzi.study.strategy.example;

import com.linzi.study.strategy.example.salaryInterface.Bonus;
import com.linzi.study.strategy.example.salaryInterface.Salary;
import com.linzi.study.strategy.example.salaryInterface.Tax;

/**
 * com.linzi.study.strategy.example.XianSalary
 *
 * @Description: 西安工资
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-04
 */
public class XianSalary implements Salary {
    @Override
    public void computerSalary() {
        System.out.println("西安的基本工资");
    }
}

class XianBonus implements Bonus {
   @Override
    public void computerBonus() {
        System.out.println("西安的奖金");
    }
}

class XianTax implements Tax {
    @Override
    public void computerTax() {
        System.out.println("西安的所得税");
    }
}
