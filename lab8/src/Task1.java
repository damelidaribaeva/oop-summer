public class Task1 {
    public static void main(String[] args) {
        Country country = new Country("Kazakhstan");

        ResortPlace resort1 = new ResortPlace("Shymbulak", "Almaty");
        ResortPlace resort2 = new ResortPlace("Borovoe", "Akmola");
        ResortPlace resort3 = new ResortPlace("Charyn Canyon", "Almaty");
        ResortPlace resort4 = new ResortPlace("Alakol", "Almaty");
        ResortPlace resort5 = new ResortPlace("Bayanaul", "Pavlodar");


        resort1.addTourist(new Tourist("Ilyas", 200));
        resort1.addTourist(new Tourist("Arman", 300));
        resort1.addTourist(new Tourist("Damelya", 500));
        resort1.addTourist(new Tourist("Murat", 250));
        resort1.addTourist(new Tourist("Dana", 150));

        resort2.addTourist(new Tourist("Dana", 150));
        resort2.addTourist(new Tourist("Ermek", 250));
        resort2.addTourist(new Tourist("Marat", 400));
        resort2.addTourist(new Tourist("Bota", 200));
        resort2.addTourist(new Tourist("Nurzhan", 350));

        resort3.addTourist(new Tourist("Askar", 100));
        resort3.addTourist(new Tourist("Bolat", 200));
        resort3.addTourist(new Tourist("Serik", 300));
        resort3.addTourist(new Tourist("Aizhan", 250));
        resort3.addTourist(new Tourist("Gulnar", 150));

        resort4.addTourist(new Tourist("Aruzhan", 350));
        resort4.addTourist(new Tourist("Gulnar", 150));
        resort4.addTourist(new Tourist("Zhanar", 200));
        resort4.addTourist(new Tourist("Kairat", 400));
        resort4.addTourist(new Tourist("Almas", 300));

        resort5.addTourist(new Tourist("Nurbol", 250));
        resort5.addTourist(new Tourist("Daniyar", 350));
        resort5.addTourist(new Tourist("Zhandos", 450));
        resort5.addTourist(new Tourist("Rauan", 300));
        resort5.addTourist(new Tourist("Madi", 200));

        country.addResort(resort1);
        country.addResort(resort2);
        country.addResort(resort3);
        country.addResort(resort4);
        country.addResort(resort5);

        System.out.println("All resort places in the country:");
        country.printAllResorts();

        System.out.println("Total number of tourists in the country: " + country.getTotalTourists());

        System.out.println("Total income from all resorts in the country: " + country.getTotalIncome());

        ResortPlace mostProfitableResort = country.getMostProfitableResort();
        System.out.println("Most profitable resort: " + mostProfitableResort);

        Tourist richestTourist = country.getRichestTourist();
        System.out.println("Richest tourist: " + richestTourist);
    }
}
