package com.linzi.study.strategy.example;

/**
 * com.linzi.study.strategy.example.SalayTest
 *
 * @Description: 工资测试类
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-04
 */
public class SalayTest {
    public static void main(String[] args) {
        SalaryTemplate salaryTemplate = new SalaryTemplate();
        salaryTemplate.setTax(new ShanghaiTax());
        salaryTemplate.setBonus(new ShanghaiBonus());
        salaryTemplate.setSalary(new ShanghaiSalary());
        salaryTemplate.computer();
    }
}
