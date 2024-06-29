public class Country {
    private String name;
    private ResortPlace[] resortPlaces = new ResortPlace[1000];
    private int resortCount = 0;

    public Country() {}

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addResort(ResortPlace resort) {
        if (resortCount < resortPlaces.length) {
            resortPlaces[resortCount++] = resort;
        }
    }

    public void printAllResorts() {
        for (int i = 0; i < resortCount; i++) {
            if (i == resortCount - 1) {
                System.out.print(resortPlaces[i].getName() + "\n");
                break;
            }
            System.out.print(resortPlaces[i].getName() + ", ");
        }
    }

    public double getTotalIncome() {
        double totalIncome = 0;
        for (int i = 0; i < resortCount; i++) {
            totalIncome += resortPlaces[i].getTotalIncome();
        }
        return totalIncome;
    }

    public int getTotalTourists() {
        int totalTourists = 0;
        for (int i = 0; i < resortCount; i++) {
            totalTourists += resortPlaces[i].getTotalTourists();
        }
        return totalTourists;
    }

    public ResortPlace getMostProfitableResort() {
        ResortPlace mostProfitableResort = null;
        double maxIncome = 0;
        for (int i = 0; i < resortCount; i++) {
            double income = resortPlaces[i].getTotalIncome();
            if (income > maxIncome) {
                maxIncome = income;
                mostProfitableResort = resortPlaces[i];
            }
        }
        return mostProfitableResort;
    }

    public Tourist getRichestTourist() {
        Tourist richestTourist = null;
        double maxIncome = 0;
        for (int i = 0; i < resortCount; i++) {
            for (int j = 0; j < resortPlaces[i].getTotalTourists(); j++) {
                Tourist tourist = resortPlaces[i].getTourists()[j];
                if (tourist.getIncomeMoney() > maxIncome) {
                    maxIncome = tourist.getIncomeMoney();
                    richestTourist = tourist;
                }
            }
        }
        return richestTourist;
    }
}

