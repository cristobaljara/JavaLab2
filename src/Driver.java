
public class Driver {
	public static void main(String[] args) {
		Country country = new Country();
		country.displayAllProvinces();

		System.out.println("And the total of provinces in this range is: " + country.howManyHaveThisPopulation(4, 10));

		// Province var = new Province();

		// var.setName("Province Name");
		// var.setCapital("Victoria");
		// var.populationInMillions(1000000);
		//
		// System.out.println(var);
	}
}
