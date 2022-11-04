public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte byteValue = 100;
        short shortValue = 10000;
        int intValue = 100000;
        long longValue = 1000000;
        float floatValue = 3.75f;
        double doubleValue = 1.70;
        System.out.println("Значение переменной byteValue с типом byte равно " + byteValue);
        System.out.println("Значение переменной shortValue с типом short равно " + shortValue);
        System.out.println("Значение переменной intValue с типом int равно " + intValue);
        System.out.println("Значение переменной longValue с типом long равно " + longValue);
        System.out.println("Значение переменной floatValue с типом float равно " + floatValue);
        System.out.println("Значение переменной doubleValue с типом double равно " + doubleValue);
        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int i = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a + " " + b + " " +  c + " " + d + " " + i + " " + f + " " + g);
        System.out.println("\n");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short sumPaper = 480;
        int sumPeople = class1 + class2 + class3;
        int onlyPaper = sumPaper / sumPeople;
        System.out.println("На каждого ученика рассчитано " + onlyPaper + " листов бумаги");
        System.out.println("\n");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte min = 20;
        byte hours = 24;
        byte day = 3;
        byte month = 1;
        int colBottleMin = (min / 2) * 16;
        System.out.println("За " + min + " минут машина произвела " + colBottleMin + " штук бутылок");
        int colBottleHours = ((hours * 60) / 2) * 16;
        System.out.println("За " + hours + " часа машина произвела " + colBottleHours + " штук бутылок");
        int colBottleDay = ((day * 24 * 60) / 2) * 16;
        System.out.println("За " + day + " дня машина произвела " + colBottleDay + " штук бутылок");
        int colBottleMonth = ((month * 31 * 24 * 60) / 2) * 16;
        System.out.println("За " + month + " месяц машина произвела " + colBottleMonth + " штук бутылок");
        System.out.println("\n");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte sumColor = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int sumClass = sumColor / (whiteColor + brownColor);
        int sumWhiteColor = sumClass * whiteColor;
        int sumBrownColor = sumClass * brownColor;
        System.out.println("В школе, где " + sumClass + " классов, нужно " + sumWhiteColor + " банок белой " +
                "краски и " + sumBrownColor + " банок коричневой краски");
        System.out.println("\n");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int sumBreakFastGr = (bananas * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);
        float sumBreakFastKg = sumBreakFastGr / 1000f;
        System.out.println("Вес завтрака в граммах " + sumBreakFastGr);
        System.out.println("Вес завтрака в килограммах " + sumBreakFastKg);
        System.out.println("\n");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        byte vesKg = 7;
        int vesGr = vesKg * 1000;
        int dayOf250 = vesGr / 250;
        System.out.println("Если худеть на 250 г. в день, то на похудение уйдет " + dayOf250 + " дней.");
        int dayOf500 = vesGr / 500;
        System.out.println("Если худеть на 500 г. в день, то на похудение уйдет " + dayOf500 + " дней.");
        int avrDay = (dayOf250 + dayOf500) / 2;
        System.out.println("В среднем может потребоваться " + avrDay + " день для похудения.");
        System.out.println("\n");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int yearIncomeMasha = masha * 12;
        int yearIncomeDenis = denis * 12;
        int yearIncomeKristina = kristina * 12;
        int raisingMasha = masha + (masha * 10 / 100);
        int raisingDenis = denis + (denis * 10 / 100);
        int raisingKristina = kristina + (kristina * 10 / 100);
        int yearIncomeRaisingMasha = raisingMasha * 12;
        int yearIncomeRaisingDenis = raisingDenis * 12;
        int yearIncomeRaisingKristina = raisingKristina * 12;
        double diffMasha = yearIncomeRaisingMasha - yearIncomeMasha;
        double diffDenis = yearIncomeRaisingDenis - yearIncomeDenis;
        double diffKristina = yearIncomeRaisingKristina - yearIncomeKristina;
        System.out.println("Маша теперь получает " + raisingMasha + " рублей. " +
                "Годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Денис теперь получает " + raisingDenis + " рублей. " +
                "Годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Кристина теперь получает " + raisingKristina + " рублей. " +
                "Годовой доход вырос на " + diffKristina + " рублей");
    }
}