public class Programmer extends Worker {
    private double moralMotivation; // coefficient from 0.5 to 2

    public Programmer() {}

    public Programmer(String fullName, double energy, double power, double efficiency, double moralMotivation) {
        super(fullName, energy, power, efficiency);
        this.moralMotivation = moralMotivation;
    }

    public double getMoralMotivation() {
        return moralMotivation;
    }

    public void setMoralMotivation(double moralMotivation) {
        this.moralMotivation = moralMotivation;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "moralMotivation=" + moralMotivation +
                "} which is subclass of " + super.toString();
    }

    @Override
    public double toWork(int time) {
        double totalWork = 0;

        for (int i = 0; i < time; i++) {
            if (getEnergy() <= 0) break;
            double work = (getPower() * 1) * getEfficiency() * moralMotivation; // work done in 1 hour
            totalWork += work;
            setEnergy(getEnergy() - work);
        }

        return totalWork;
    }
}