public class Main {
    public static void main(String[] args)  {
        byte a = 1; short b = 2; int c = 3; long d = 100L; float i = 3.14f; double f = 3.15; char s = 33;
        boolean q = 5 < 3; // первое задание готово

        System.out.println("все указали, вот они: " + a + b + c + d + i + f + s + q);
        double boxer1 = 78.2; double boxer2 = 82.7; double weightBoxers = boxer1 + boxer2;
        double boxerWeightDifference = boxer2 - boxer1;
        System.out.println(" Общий вес двух бойцов равен " + weightBoxers + "кг");
        System.out.println("Разница в весе " + boxerWeightDifference + "кг"); // 2 задание готово

        int bananas = 5*80; int milk = 2*105; int iceCream = 2*100; int eggs = 4*70;
        int totalWeight = bananas + milk + iceCream + eggs;
        double breakfastWeight = totalWeight /(1000*1.0);
        System.out.println("Вес спорт-завтрака равен " + breakfastWeight + "кг"); // 3 задание готово

        int weightGr = 7*1000;
        int workoutOne = weightGr/250; int workoutToo = weightGr/500;
        double average = (workoutOne + workoutToo) / (2*1.0);
        System.out.println(" Кол-во дней для похудения если терять по 250гр в день равно " + workoutOne);
        System.out.println(" Кол-во дней для похудения если терять по 500гр в день равно " + workoutToo);
        System.out.println(" Среднее кол-во дней для похудения  равно " + average);// 4 задание готово

        int incomeMasha = 67760; int incomeDenis = 83690; int incomeKristina = 76230;
        int incomYearMasha = 67760*12; int incomeYearDenis = 83690*12; int incomeYearKristina = 76230*12;
        double MashaNew = 67760*0.10+incomeMasha; double DenisNew = 83690*0.10+incomeDenis; double KristinaNew = 76230*0.10+incomeKristina;
        double newIncomYearMasha = MashaNew *12; double newIncomeYearDenis = DenisNew*12; double newIncomeYearKristina = KristinaNew*12;
        double differenceMasha = newIncomYearMasha - incomYearMasha; double differenceDenis = newIncomeYearDenis - incomeYearDenis;
        double differenceKristina = newIncomeYearKristina - incomeYearKristina;
        System.out.println("Маша теперь получает  " + MashaNew + " рублей. Годовой доход вырос на " + differenceMasha + " рублей" );
        System.out.println("Денис теперь получает  " + DenisNew + " рублей. Годовой доход вырос на " + differenceDenis + " рублей" );
        System.out.println("Кристина теперь получает  " + KristinaNew + " рублей. Годовой доход вырос на " + differenceKristina + " рублей" );
        // 5 задание выполнено
    }
}