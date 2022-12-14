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

    public static void task1() {

        System.out.println("\nЗадача_1");
        int deposit = 15000;
        int max = 2459000;
        int mounth = 0;
        int total = 0;
        while (total < max) {
            mounth++;
            deposit = deposit + deposit / 100;
            total = deposit + total;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + total + " рублей");
        }


    }

    public static void task2() {

        System.out.println("\nЗадача_2\n");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + ", ");
        }
        System.out.println();
        for (i = 10; i > 0; i = i - 1) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void task3() {

        System.out.println("\nЗадача_3\n");
        int countryY = 12000000;
        int bornPerThous = 17;
        int diePerThous = 8;
        int years = 0;
        while (years < 10) {
            years++;
            countryY = countryY + (countryY / 1000 * bornPerThous) - (countryY / 1000 * diePerThous);
            System.out.println("Год " + years + " , численность населения составляет " + countryY);

        }


    }

    public static void task4() {

        System.out.println("\nЗадача_4\n");
        int deposit = 15000;
        double persent = 0.07;
        int maxSum = 12000000;
        int mounth = 0;

        while (deposit <= maxSum) {
            deposit += deposit * persent;
            mounth++;
            System.out.println("Месяц " + mounth + ", сумма накоплений = " + deposit);
        }


    }

    public static void task5() {

        System.out.println("\nЗадача_5\n");
        int deposit = 15000;
        double persent = 0.07;
        int maxSum = 12000000;
        int mounth = 0;

        while (deposit <= maxSum) {
            deposit += deposit * persent;
            mounth++;

            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", сумма накоплений = " + deposit);
            }
        }
    }

    public static void task6() {

        System.out.println("\nЗадача_6\n");
        System.out.println("\nЗадача_5\n");
        int deposit = 15000;
        double persent = 0.07;
        int mounthMax = 9 * 12;
        int mounth = 0;

        while (mounth <= mounthMax) {
            deposit += deposit * persent;
            mounth++;

            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", сумма накоплений = " + deposit);


            }
        }
    }

    public static void task7() {
        System.out.println("\nЗадача_7\n");
        int fryday = 1;
        int totalDay = 31;
        while (fryday <= totalDay) {
            System.out.println("Сегодня пятница, " + fryday + "-е число. Необходимо подготовить отчет");

            fryday = fryday + 7;
        }
    }

    public static void task8() {
        System.out.println("\nЗадача_8\n");
        int yearToday = 2022;
        int period = 79;
        int yearMin = yearToday - 200;
        int yearMax = yearToday + 100;

        while (yearMin <= yearMax) {
            yearMin++;
            if (yearMin % period == 0) {
                System.out.println(yearMin);
            }

        }
    }
}