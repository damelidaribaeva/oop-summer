public class Continent {
    private String name;
    private Country[] countries = new Country[1000];
    private int countryCount = 0;

    public Continent() {}

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCountry(Country country) {
        if (countryCount < countries.length) {
            countries[countryCount++] = country;
        }
    }

    public double getTotalIncomeOfAllResorts() {
        double totalIncome = 0;
        for (int i = 0; i < countryCount; i++) {
            totalIncome += countries[i].getTotalIncome();
        }
        return totalIncome;
    }

    public Country getTheMostProfitableCountry() {
        Country mostProfitableCountry = null;
        double maxIncome = 0;
        for (int i = 0; i < countryCount; i++) {
            double income = countries[i].getTotalIncome();
            if (income > maxIncome) {
                maxIncome = income;
                mostProfitableCountry = countries[i];
            }
        }
        return mostProfitableCountry;
    }
}
