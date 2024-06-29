public class Task2 {
    public static void main(String[] args) {

        Country kazakhstan = new Country("Kazakhstan");
        Country uzbekistan = new Country("Uzbekistan");
        Country kyrgyzstan = new Country("Kyrgyzstan");

        ResortPlace resort1 = new ResortPlace("Shymbulak", "Almaty");
        ResortPlace resort2 = new ResortPlace("Borovoe", "Akmola");
        ResortPlace resort3 = new ResortPlace("Charyn Canyon", "Almaty");
        ResortPlace resort4 = new ResortPlace("Alakol", "Almaty");
        ResortPlace resort5 = new ResortPlace("Bayanaul", "Pavlodar");

        resort1.addTourist(new Tourist("Ilyas", 200));
        resort1.addTourist(new Tourist("Arman", 300));
        resort1.addTourist(new Tourist("Ermek", 500));
        resort1.addTourist(new Tourist("Murat", 250));
        resort1.addTourist(new Tourist("Dana", 150));

        resort2.addTourist(new Tourist("Dana", 150));
        resort2.addTourist(new Tourist("Aida", 250));
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

        kazakhstan.addResort(resort1);
        kazakhstan.addResort(resort2);
        kazakhstan.addResort(resort3);
        kazakhstan.addResort(resort4);
        kazakhstan.addResort(resort5);


        ResortPlace uzbResort1 = new ResortPlace("Samarkand", "Samarkand");
        ResortPlace uzbResort2 = new ResortPlace("Bukhara", "Bukhara");
        ResortPlace uzbResort3 = new ResortPlace("Khiva", "Khiva");
        ResortPlace uzbResort4 = new ResortPlace("Shakhrisabz", "Kashkadarya");
        ResortPlace uzbResort5 = new ResortPlace("Fergana", "Fergana");

        uzbResort1.addTourist(new Tourist("Ali", 250));
        uzbResort1.addTourist(new Tourist("Murod", 350));
        uzbResort1.addTourist(new Tourist("Rustam", 400));
        uzbResort1.addTourist(new Tourist("Aziz", 300));
        uzbResort1.addTourist(new Tourist("Farrukh", 200));

        uzbResort2.addTourist(new Tourist("Nargiza", 150));
        uzbResort2.addTourist(new Tourist("Malika", 250));
        uzbResort2.addTourist(new Tourist("Dilnoza", 350));
        uzbResort2.addTourist(new Tourist("Jasur", 400));
        uzbResort2.addTourist(new Tourist("Ulugbek", 300));

        uzbResort3.addTourist(new Tourist("Bekzod", 200));
        uzbResort3.addTourist(new Tourist("Komil", 300));
        uzbResort3.addTourist(new Tourist("Otabek", 350));
        uzbResort3.addTourist(new Tourist("Dilmurod", 250));
        uzbResort3.addTourist(new Tourist("Javlon", 150));

        uzbResort4.addTourist(new Tourist("Suhrob", 300));
        uzbResort4.addTourist(new Tourist("Oybek", 250));
        uzbResort4.addTourist(new Tourist("Anvar", 350));
        uzbResort4.addTourist(new Tourist("Shuhrat", 400));
        uzbResort4.addTourist(new Tourist("Sherzod", 200));

        uzbResort5.addTourist(new Tourist("Shohruh", 350));
        uzbResort5.addTourist(new Tourist("Shoxrux", 300));
        uzbResort5.addTourist(new Tourist("Javohir", 400));
        uzbResort5.addTourist(new Tourist("Sanjar", 250));
        uzbResort5.addTourist(new Tourist("Behruz", 200));

        uzbekistan.addResort(uzbResort1);
        uzbekistan.addResort(uzbResort2);
        uzbekistan.addResort(uzbResort3);
        uzbekistan.addResort(uzbResort4);
        uzbekistan.addResort(uzbResort5);

        ResortPlace kgzResort1 = new ResortPlace("Issyk-Kul", "Issyk-Kul");
        ResortPlace kgzResort2 = new ResortPlace("Ala-Archa", "Bishkek");
        ResortPlace kgzResort3 = new ResortPlace("Osh Bazaar", "Osh");
        ResortPlace kgzResort4 = new ResortPlace("Son-Kul", "Naryn");
        ResortPlace kgzResort5 = new ResortPlace("Tash Rabat", "Naryn");

        kgzResort1.addTourist(new Tourist("Bakyt", 300));
        kgzResort1.addTourist(new Tourist("Ruslan", 400));
        kgzResort1.addTourist(new Tourist("Talas", 350));
        kgzResort1.addTourist(new Tourist("Altynbek", 250));
        kgzResort1.addTourist(new Tourist("Nurlan", 200));

        kgzResort2.addTourist(new Tourist("Aigerim", 150));
        kgzResort2.addTourist(new Tourist("Bermet", 250));
        kgzResort2.addTourist(new Tourist("Cholpon", 350));
        kgzResort2.addTourist(new Tourist("Dastan", 300));
        kgzResort2.addTourist(new Tourist("Elaman", 200));

        kgzResort3.addTourist(new Tourist("Farid", 200));
        kgzResort3.addTourist(new Tourist("Gulmira", 300));
        kgzResort3.addTourist(new Tourist("Indira", 250));
        kgzResort3.addTourist(new Tourist("Kanykei", 350));
        kgzResort3.addTourist(new Tourist("Nurzhan", 150));

        kgzResort4.addTourist(new Tourist("Orhan", 250));
        kgzResort4.addTourist(new Tourist("Perizat", 200));
        kgzResort4.addTourist(new Tourist("Ruslanbek", 300));
        kgzResort4.addTourist(new Tourist("Samat", 350));
        kgzResort4.addTourist(new Tourist("Tamara", 400));

        kgzResort5.addTourist(new Tourist("Tilek", 350));
        kgzResort5.addTourist(new Tourist("Ulan", 300));
        kgzResort5.addTourist(new Tourist("Venera", 250));
        kgzResort5.addTourist(new Tourist("Zhanyl", 200));
        kgzResort5.addTourist(new Tourist("Ermek", 150));

        kyrgyzstan.addResort(kgzResort1);
        kyrgyzstan.addResort(kgzResort2);
        kyrgyzstan.addResort(kgzResort3);
        kyrgyzstan.addResort(kgzResort4);
        kyrgyzstan.addResort(kgzResort5);

        
        Continent asia = new Continent("Asia");
        asia.addCountry(kazakhstan);
        asia.addCountry(uzbekistan);
        asia.addCountry(kyrgyzstan);

        System.out.println("Total income of all countries in " + asia.getName() + ": " + asia.getTotalIncomeOfAllResorts());

        Country mostProfitableCountry = asia.getTheMostProfitableCountry();
        System.out.println("Most profitable country in " + asia.getName() + ": " + mostProfitableCountry.getName());

        ResortPlace mostProfitableResortInCountry = mostProfitableCountry.getMostProfitableResort();
        System.out.println("Most profitable resort in " + mostProfitableCountry.getName() + ": " + mostProfitableResortInCountry);
    }
}
