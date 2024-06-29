public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[10];

        // Create 5 programmers
        workers[0] = new Programmer("Programmer 1", 1000, 10, 0.3, 1.2);
        workers[1] = new Programmer("Programmer 2", 800, 8, 0.2, 1.0);
        workers[2] = new Programmer("Programmer 3", 1200, 12, 0.4, 1.5);
        workers[3] = new Programmer("Programmer 4", 1100, 11, 0.35, 1.3);
        workers[4] = new Programmer("Programmer 5", 900, 9, 0.25, 1.1);

        // Create 5 teachers
        workers[5] = new Teacher("Teacher 1", 1000, 10, 0.3, 0.05);
        workers[6] = new Teacher("Teacher 2", 800, 8, 0.2, 0.04);
        workers[7] = new Teacher("Teacher 3", 1200, 12, 0.4, 0.07);
        workers[8] = new Teacher("Teacher 4", 1100, 11, 0.35, 0.06);
        workers[9] = new Teacher("Teacher 5", 900, 9, 0.25, 0.03);

        double totalWork5Hours = 0;
        double totalWork10Hours = 0;
        Worker maxPowerWorker = workers[0];
        Worker maxWorkDoneWorker = workers[0];
        double maxWorkDone = 0;

        for (Worker worker : workers) {
            double work5Hours = worker.toWork(5);
            totalWork5Hours += work5Hours;

            double work10Hours = worker.toWork(10);
            totalWork10Hours += work10Hours;

            if (worker.getPower() > maxPowerWorker.getPower()) {
                maxPowerWorker = worker;
            }

            if (work10Hours > maxWorkDone) {
                maxWorkDone = work10Hours;
                maxWorkDoneWorker = worker;
            }

            System.out.println(worker.getFullName() + " did " + work10Hours + " KJ of work in 10 hours.");
        }

        System.out.println("Total work done by all workers in 5 hours: " + totalWork5Hours + " KJ");
        System.out.println("Total work done by all workers in 10 hours: " + totalWork10Hours + " KJ");
        System.out.println("Worker with maximum power: " + maxPowerWorker);
        System.out.println("Worker with maximum work done in 10 hours: " + maxWorkDoneWorker);
    }
}
