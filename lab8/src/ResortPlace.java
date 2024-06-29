public class ResortPlace {
    private String name;
    private String city;
    private Tourist tourists[] = new Tourist[1000];
    private int touristCount = 0;

    public ResortPlace() {}

    public ResortPlace(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addTourist(Tourist tourist) {
        if (touristCount < tourists.length) {
            tourists[touristCount++] = tourist;
        }
    }

    public double getTotalIncome() {
        double totalIncome = 0;
        for (int i = 0; i < touristCount; i++) {
            totalIncome += tourists[i].getIncomeMoney();
        }
        return totalIncome;
    }

    public int getTotalTourists() {
        return touristCount;
    }

    public Tourist[] getTourists() {
        Tourist[] currentTourists = new Tourist[touristCount];
        for (int i = 0; i < touristCount; i++) {
            currentTourists[i] = tourists[i];
        }
        return currentTourists;
    }

    @Override
    public String toString() {
        String result = "Resort Place: " + name + ", City: " + city + "\n_____________\nTourists:\n";
        for (int i = 0; i < touristCount; i++) {
            result += tourists[i].toString() + "\n";
        }
        result += "_____________\nTotal Income: " + getTotalIncome() + " USD";
        return result;
    }
}
