public class Main {
    public static void main(String[] args) {
        //задание1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        double sugarWeight = 1.5;
        float salrWeight = 1.5f;
        long elephant = 110L;
        char bar = 35;
        System.out.println(bar);


        //задание2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllboxers = boxer1 + boxer2;
        double weightOifference = boxer2 - boxer1;
        System.out.println("summa" + weightOfAllboxers);

        System.out.println("difference" + weightOifference);

        //задание3
        int banana = 5 * 80; //400gr
        int milk = 2 * 105; //210gr
        int iceCream = 2 * 100; //200gr
        int eggs = 4 * 70; //280gr
        int weightAll = banana + milk + iceCream + eggs;
        double allWeightKg = weightAll / 1000.0;

        System.out.println("summaGr " + weightAll);
        System.out.println("summaKg " + allWeightKg);

        //задание4
        var day = 7;
        System.out.println(day);
        double day1 = day / 0.5;
        double day2 = day / 0.25;

        double difference = day / 0.5;
        System.out.println("differenceDay " + day / 0.5);

        double difference1 = day / 0.25;
        System.out.println("differenceDay1 " + day / 0.25);

        double averageValue = (0.5 + 0.25) / 2;
        System.out.println("averageValueGR " + averageValue);

        double averageValueDay = (day / 0.375);
        System.out.println("averageResultDay " + averageValueDay);


        //задание5
        int Masha = (67760 * 12);
        int Denis = (83690 * 12);
        int Kristina = (76230 * 12);
        int allincome = Masha + Denis + Kristina;

        System.out.println("summa All Rub " + allincome);

        double income1 = Masha * 0.1;
        System.out.println("Masha Rub in year" + income1);

        double income2 = Kristina * 0.1;
        System.out.println(" Kristina Rub in month" + income2);

        double income3 = Denis * 0.1;
        System.out.println(" Denis Rub in month" + income3);

        double incomeMasha = income1 * 12;
        System.out.println("Masha Rub in year" + incomeMasha);

        double incomeKristina = income2 * 12;
        System.out.println(" Kristina Rub in year" + incomeKristina);

        double incomeDenis = income3 * 12;
        System.out.println(" Denis Rub in year" + incomeDenis);

        double income4 = incomeMasha + incomeKristina + incomeDenis;
        System.out.println("summa Rub in year" + income4);

        double income5 = income4 - allincome;
        System.out.println("difference Rub " + income5);


    }
}