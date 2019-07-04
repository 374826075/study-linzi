package com.linzi.study.strategy.example;

import com.linzi.study.strategy.example.salaryInterface.Bonus;
import com.linzi.study.strategy.example.salaryInterface.Salary;
import com.linzi.study.strategy.example.salaryInterface.Tax;

/**
 * com.linzi.study.strategy.example.ShanghaiSalary
 *
 * @Description: 上海工资
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-04
 */
public class ShanghaiSalary implements Salary {
    @Override
    public void computerSalary() {
        System.out.println("上海的基本工资");
    }
}

class ShanghaiBonus implements Bonus {
    @Override
    public void computerBonus() {
        System.out.println("上海的奖金");
    }
}

class ShanghaiTax implements Tax {
    @Override
    public void computerTax() {
        System.out.println("上海的所得税");
    }
}
