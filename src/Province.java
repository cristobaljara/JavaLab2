/**
 * 
 * @author jara
 *
 */
public class Province {

	private String name;
	private String capital;
	private int populationInMillions;

	private String DEFAULT_CAPITAL = "Victoria";
	private String DEFAULT_PROVINCE = "British Columbia";
	private int DEFAULT_POPULATION_MILLIONS = 4;
	private int MIN_POPULATION = 0;
	private int MAX_POPULATION = 38;

	/**
	 * 
	 * @param name
	 *            (Reffers to the name of the Province)
	 * @param capital
	 *            (Reffers to the name of the Capital)
	 * @param populationInMillions
	 *            (Reffers to the Population of the province in millions)
	 */
	public Province(String name, String capital, int populationInMillions) {

		if (this.isValidProvince(name) && this.isValidCapitalCity(capital)
				&& this.isValidPopulation(populationInMillions)) {
			this.name = name;
			this.capital = capital;
			this.populationInMillions = populationInMillions;

		} else {

			this.populationInMillions = DEFAULT_POPULATION_MILLIONS; // 4
			this.name = DEFAULT_PROVINCE; // “British Columbia”
			this.capital = DEFAULT_CAPITAL; // “Victoria”

		}
	}

	/**
	 * 
	 * We are defining constant for Population in Millions, Provinces and Capitals.
	 */
	public Province() {

		this.populationInMillions = DEFAULT_POPULATION_MILLIONS; // 4
		this.name = DEFAULT_PROVINCE; // “British Columbia”
		this.capital = DEFAULT_CAPITAL; // “Victoria”
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	private boolean isValidProvince(String name) {
		String[] myStrings = { "Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador",
				"Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec",
				"Saskatchewan", "Yukon", };
		boolean exists = false;
		boolean continue_for_the_province = true;
		int index = 0;
		while (continue_for_the_province) {
			if (name == myStrings[index]) {
				exists = true;
				continue_for_the_province = false;
			}
			;
			index = index + 1;
		}
		return exists;
	}

	/**
	 * 
	 * @param name
	 *            Reffers to the name that it has to be written as a valid capital
	 *            city
	 * @return exists if we define a valid capital city
	 */
	private boolean isValidCapitalCity(String name) {
		String[] myStrings = { "Ottawa", "Edmonton", "Victoria", "Winnipeg", "Fredericton", "St. John's", "Halifax",
				"Toronto", "Charlottetown", "Quebec City", "Regina", "Yellowknife", "Iqaluit", "Whitehorse" };
		boolean exists = false;
		boolean continue_for_the_province = true;
		int index = 0;
		while (continue_for_the_province) {
			if (name == myStrings[index]) {
				exists = true;
				continue_for_the_province = false;
			}
			;
			index = index + 1;
		}
		return exists;
	}

	/**
	 *
	 * 
	 * @param population
	 *            Set boolean for a valid population
	 * @return Set range from 0 to 38 million population
	 */
	private boolean isValidPopulation(int population) {
		return (population > MIN_POPULATION && population < MAX_POPULATION);
	}

	/**
	 * 
	 * @return We define the return phrase to get the province name, with population
	 *         in millions and the capital
	 */
	public String getDetails() {

		return "The capital of " + this.name + " (pop. " + this.populationInMillions + " million) is " + this.capital;
	}

	/**
	 * 
	 * @param We
	 *            set the Name of the province
	 */
	public void setName(String setName) {

		this.name = setName;

	}

	/**
	 * 
	 * @param We
	 *            set Name of the Capital
	 */
	public void setCapital(String setCapital) {

		this.capital = setCapital;

	}

	/**
	 * 
	 * @param We
	 *            set name for populationInMillions
	 */
	public void populationInMillions(int populationInMillions) {

		this.populationInMillions = populationInMillions;

	}

	/**
	 * 
	 * @return It will return the Name of the province
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return It will return the Name of the capital
	 */
	public String getCapital() {
		return capital;
	}

	/**
	 * 
	 * @return It will return the population in millions
	 */
	public int getpopulationInMillions() {
		return populationInMillions;
	}

	@Override
	public String toString() {
		return "Province [name=" + name + ", capital=" + capital + ", populationInMillions=" + populationInMillions
				+ ", DEFAULT_CAPITAL=" + DEFAULT_CAPITAL + ", DEFAULT_PROVINCE=" + DEFAULT_PROVINCE
				+ ", DEFAULT_POPULATION_MILLIONS=" + DEFAULT_POPULATION_MILLIONS + "]";
	}
}
