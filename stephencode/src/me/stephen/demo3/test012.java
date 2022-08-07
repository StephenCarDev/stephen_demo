package me.stephen.demo3;

public class test012 {
    public static void main(String[] args) {
        // TODO: 用抽象类给一个有工资收入和稿费收入的小伙伴算税:
        Income[] incomes = new Income[]{new SalaryIncome(7500), new RoyaltyIncome(12000)};
        double total = 0;
        for (Income income : incomes) {
            total += income.getTax();
        }
        System.out.println(total);
    }
}
/**
 * 定义接口Income
 */
interface Income {
    double getTax();
}
class SalaryIncome implements Income {
    private double income;
    public SalaryIncome(double income) {
        this.income = income;
    }
    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
/**
 * 稿费收入税率是20%
 */
class RoyaltyIncome implements Income {
    private double income;
    public RoyaltyIncome(double income) {
        this.income = income;
    }
    @Override
    public double getTax() {
        return income * 0.2;
    }
}
