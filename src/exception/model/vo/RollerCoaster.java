package exception.model.vo;

public class RollerCoaster {

	public final static double CUTHEIGHT = 110;
	public final static int PRICE = 4500;
	public final static int PERMITNUMBER = 2;
	
	public RollerCoaster() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cUTHEIGHT
	 */
	public static double getCUTHEIGHT() {
		return CUTHEIGHT;
	}


	/**
	 * @return the pRICE
	 */
	public static int getPRICE() {
		return PRICE;
	}


	/**
	 * @return the pERMITNUMBER
	 */
	public static int getPERMITNUMBER() {
		return PERMITNUMBER;
	}

	@Override
	public String toString() {
		return "RollerCoaster []";
	}



	
}
