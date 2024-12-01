package intermediate.statickeyword;

public class CountriesApp {
    public static void main(String[] args) {
        Country brazil = new Country("Brazil", 2100000, "Brasilia");
        brazil.getDetails();
        System.out.println("Number of countries: " + Country.getNumberOfCountries());
        Country ukraine = new Country("Ukraine", 4000000, "Kyiv");
        ukraine.getDetails();
        System.out.println("Number of countries: " + Country.getNumberOfCountries());


    }
}
