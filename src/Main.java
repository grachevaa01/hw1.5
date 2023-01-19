public class Main {//
    public static void main(String[] args) {//
        var clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }//

        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }//

        var year = 2021;
        int highGradeYear = year / 4;
        if (year == highGradeYear) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }//

        int deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        } else {
            int days = 1;
            if (deliveryDistance > 20) {
                days++;
            }
            if (deliveryDistance > 60) {
                days++;
            }
            System.out.println("Доставка займет " + days + " дней");
        }//
        var monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Не верно введено значение");


        }
    }    }//