
public class RewardValue {
	private static double milesToCashConversion = 0.0035;
	private int miles;
	private double cashValue;

	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
		this.miles = (int)(cashValue / milesToCashConversion);
	}
	public RewardValue(int miles) {
		this.miles = miles;
		this.cashValue = miles * milesToCashConversion;
	}

	public double getCashValue() {
		return cashValue;
	}

	public int getMilesValue() {
		return miles;
	}
}

