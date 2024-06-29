public class Teacher extends Worker {
    private double tiredness; // coefficient from 0.01 to 0.1

    public Teacher() {}

    public Teacher(String fullName, double energy, double power, double efficiency, double tiredness) {
        super(fullName, energy, power, efficiency);
        this.tiredness = tiredness;
    }

    public double getTiredness() {
        return tiredness;
    }

    public void setTiredness(double tiredness) {
        this.tiredness = tiredness;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tiredness=" + tiredness +
                "} which is subclass of " + super.toString();
    }

    @Override
    public double toWork(int time) {
        double totalWork = 0;
        double currentEfficiency = getEfficiency();

        for (int i = 0; i < time; i++) {
            if (getEnergy() <= 0) break;
            double work = (getPower() * 1) * currentEfficiency; // work done in 1 hour
            totalWork += work;
            setEnergy(getEnergy() - work);
            currentEfficiency -= tiredness; // decrease efficiency by tiredness after each hour
            if (currentEfficiency < 0)
                currentEfficiency = 0;
        }

        return totalWork;
    }
}