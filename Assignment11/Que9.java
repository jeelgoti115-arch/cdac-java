import java.util.Map;
import java.util.TreeMap;

class Country {
    private String countryCode;
    private String countryName;
    private long population;

    public Country(String countryCode, String countryName, long population) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country [Code=" + countryCode + ", Name=\"" + countryName 
                + "\", Population=" + population + "]";
    }
}

class CountryDirectory {
    private Map<String, Country> countryMap = new TreeMap<>();

    public boolean addCountry(Country country) {
        if (countryMap.containsKey(country.getCountryCode())) {
            System.out.println("Country Code '" + country.getCountryCode() + "' already exists!");
            return false;
        }
        countryMap.put(country.getCountryCode(), country);
        System.out.println("Added: " + country.getCountryName() + " (" + country.getCountryCode() + ")");
        return true;
    }

    public Country searchCountry(String countryCode) {
        return countryMap.get(countryCode);
    }

    public boolean removeCountry(String countryCode) {
        Country removed = countryMap.remove(countryCode);
        if (removed != null) {
            System.out.println("Successfully removed: " + removed.getCountryName());
            return true;
        } else {
            System.out.println("Country Code '" + countryCode + "' not found to remove.");
            return false;
        }
    }

    public void displayAllCountries() {
        if (countryMap.isEmpty()) {
            System.out.println("Directory is empty.");
            return;
        }
        System.out.println("\n--- Country Directory (Sorted by Key/Code) ---");
        for (Map.Entry<String, Country> entry : countryMap.entrySet()) {
            System.out.println("Key [" + entry.getKey() + "] -> " + entry.getValue());
        }
    }
}
public class Que9 {
	public static void main(String[] args) {
        CountryDirectory directory = new CountryDirectory();

        directory.addCountry(new Country("US", "United States", 335000000L));
        directory.addCountry(new Country("IN", "India", 1430000000L));
        directory.addCountry(new Country("DE", "Germany", 84000000L));
        directory.addCountry(new Country("CA", "Canada", 40000000L));

        directory.addCountry(new Country("IN", "Republic of India", 1430000000L));

        directory.displayAllCountries();

        System.out.println("\n--- Searching for Country Code 'DE' ---");
        Country c = directory.searchCountry("DE");
        if (c != null) {
            System.out.println("Found: " + c);
        } else {
            System.out.println("Country not found.");
        }

        System.out.println("\n--- Removing Country Code 'US' ---");
        directory.removeCountry("US");

        directory.displayAllCountries();
    }
}