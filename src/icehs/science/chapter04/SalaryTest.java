package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthySalary = 1000000;
		int annualSalary = monthySalary * 12;
		int bonus = monthySalary * 4 * 20/100;
		int bonusTax = bonus * 55 / 1000;
		int monthyTax = monthySalary * 10 / 100;
		int annualTax = monthyTax* 12;
		int annualIncomeAfterTax = annualSalary - annualTax + bonus - bonusTax;
		
		
		System.out.println("���� : " + annualSalary +", ���� ���� : " + (annualSalary - annualTax));
		System.out.println("���ʽ� : " + bonus + ", ���� ���ʽ� : " + (bonus - bonusTax));
		System.out.println("���޾� : " + annualIncomeAfterTax);

	}

}
