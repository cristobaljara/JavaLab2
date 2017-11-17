import java.util.Arrays;

/**
 * 
 * @author jara
 *
 */
public class Country {
	private String name;
	private Province provinces[];

	/**
	 * 
	 * Constructor
	 */
	public Country() {
		this.name = "Canada";
		provinces = new Province[10];

		provinces[0] = new Province("Alberta", "Edmonton", 4);
		provinces[1] = new Province("British Columbia", "Victoria", 4);
		provinces[2] = new Province("Ontario", "Toronto", 13);
		provinces[3] = new Province("Quebec", "Quebec City", 8);
		provinces[4] = new Province("Nova Scotia", "Halifax", 1);
		provinces[5] = new Province("New Brunswick", "Fredericton", 2);
		provinces[6] = new Province("Manitoba", "Winnipeg", 2);
		provinces[7] = new Province("Prince Edward Island", "Charlottetown", 5);
		provinces[8] = new Province("Saskatchewan", "Regina", 6);
		provinces[9] = new Province("Newfoundland and Labrador", "St. John's", 7);
	}

	/**
	 * 
	 * It will print a province
	 */
	public void displayAllProvinces() {
		for (Province province : provinces) {

			System.out.println(province.getDetails());
		}
	}

	/**
	 * eturns how many Provinces there are with populations in that range
	 * 
	 * @param min
	 *            of population of millions
	 * @param max
	 *            of population of millions
	 * @return a range between a min and a max population of millions, returning
	 *         those provinces with their own capitals and populations.
	 */
	public int howManyHaveThisPopulation(int min, int max) {
		int count = 0;
		for (Province province : provinces) {
			if (province.getpopulationInMillions() >= min && province.getpopulationInMillions() <= max) {
				count++;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", provinces=" + Arrays.toString(provinces) + "]";
	}
}
