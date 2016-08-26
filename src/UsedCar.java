
public class UsedCar extends Car{

	private int miles;

	public UsedCar(String make, String model, int year, double price, int miles) {
		super(make, model, year, price);
		this.miles = miles;
		
	}
	
	@Override
	public String toString(){
		return super.toString() + " (ONLY: " + getMiles() + " MILES!)";
	}

	/**
	 * @return the miles
	 */
	public int getMiles() {
		return miles;
	}

	/**
	 * @param miles the miles to set
	 */
	public void setMiles(int miles) {
		this.miles = miles;
	}

}
