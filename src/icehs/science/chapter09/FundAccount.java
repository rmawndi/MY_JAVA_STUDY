package icehs.science.chapter09;

public class FundAccount extends Account {
	private double earningRate;

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	
	
	public void earnMobey() {
		System.out.println("수익률 : "+ this.earningRate+" %");
		System.out.println("수익이 발생했습니다.");
	}
}
