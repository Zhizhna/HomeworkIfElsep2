public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        byte clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Task 2");
        byte clientOS2 = 0;
        short clientDeviceYear =  2015;
        if (clientOS2 == 0){
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Task 3");
        int year = 1013;
        System.out.println(year + " год ");
        if (year >= 1584){
            if (year % 4 == 0){
                System.out.println("является високосны");
            } else if (year % 400 == 0 && year % 100 != 0){
                System.out.println("является високосны");
            }else{
                System.out.println("не является високосным");
            }
        }else{
            System.out.println("не является високосным");
        }

        System.out.println("Task 4");
         int deliveryDistance = 95;
         byte timeForDelivery = 0;
         if (deliveryDistance < 20){
             //System.out.println("Доставка займет 1 день");
             //можно сделать два исколючения, чтобы было грамматно с точки зрения языка
             timeForDelivery = 1;
         } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
             timeForDelivery = 2;
         } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
             timeForDelivery = 3;
         } else if (deliveryDistance >= 100) {
             //System.out.println("доставки нет");
             timeForDelivery = 0;
         }
         if(timeForDelivery > 0){
             System.out.println("Потребуется дней: " + timeForDelivery);
         }else{
             System.out.println("доставки нет");
         }

         System.out.println("Task 5");
         byte monthNumber = 12;
         switch (monthNumber){
             case 1:
             case 2:
             case 12:
                 System.out.println("Winter");
                 break;
             case 3:
             case 4:
             case 5:
                 System.out.println("Spring");
                 break;
             case 6:
             case 7:
             case 8:
                 System.out.println("Summer");
                 break;
             case 9:
             case 10:
             case 11:
                 System.out.println("Autumn");
                 break;
             default:
                 System.out.println("Error!");
                 break;
         }
    }
}