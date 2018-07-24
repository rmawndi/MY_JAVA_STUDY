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
		
		
		System.out.println("연봉 : " + annualSalary +", 세후 연봉 : " + (annualSalary - annualTax));
		System.out.println("보너스 : " + bonus + ", 세후 보너스 : " + (bonus - bonusTax));
		System.out.println("지급액 : " + annualIncomeAfterTax);

	}

}
