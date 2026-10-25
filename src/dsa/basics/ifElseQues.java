package javaCollege;
import java.util.*;

public class ifElseQues {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //1.
        /*String isMembership = sc.nextLine();
        double total_bill = sc.nextDouble();
        boolean isHappyHour = sc.nextBoolean();
        double discount_rate = 0;
        double flat_discount = 0;
        double final_amount = 0;
        if (isMembership.equalsIgnoreCase("VIP")) {
            if (isHappyHour) {
                discount_rate = 0.25;
            } else {
                discount_rate = 0.15;
            }
        }
        if(isMembership.equalsIgnoreCase("regular")){
            if(total_bill>20){
                discount_rate = 0.10;
            }
            if(isHappyHour && total_bill>=20){
                discount_rate = 0.15;
            }
            else {
                discount_rate = 0;
            }
        }
        if(isMembership.equalsIgnoreCase("GUEST")){
            if(isHappyHour && total_bill > 50){
                flat_discount = 5;
            }
        }
        System.out.println(final_amount = total_bill - (total_bill * discount_rate) - flat_discount );*/

        //2.
        /*String destination = sc.nextLine();
        double weight = sc.nextDouble();
        boolean isExpress = sc.nextBoolean();
        double order_amount = sc.nextDouble();
        double shipping = 0;
        double extrakg = weight - 2;
        if (destination.equalsIgnoreCase("domestic")) {
            if (order_amount >= 100) {
                shipping = 0;
            } else if (order_amount < 100) {
                if (weight <= 2){
                    shipping = 5;
                }
                else {
                    shipping = 5 + (2 * extrakg );
                }
            }
            if(isExpress){
                shipping = shipping + 8;
            }
        }
        if(destination.equalsIgnoreCase("international")){
            if(weight <= 5){
                shipping = 25;
            } else if (weight > 5) {
                shipping = 25 +  (5 * extrakg);
            }
            if(isExpress){
                    shipping = shipping + 20;
            }
        }
        System.out.println(shipping);*/

        //3.
         /* String time_period = sc.next();
          String weather = sc.next();
          double distance = sc.nextDouble();
          boolean isWeekend = sc.nextBoolean();
          double baseFare = 3;
          double rate_per_mile = 0 ;

          if(weather.equalsIgnoreCase("clear")){
              rate_per_mile = 1.50;
          } else if (weather.equalsIgnoreCase("rainy")) {
              rate_per_mile = 2.00;
          }
          else{
              rate_per_mile = 2.50;
          }
            double subTotal = baseFare + (rate_per_mile * distance);
            if(time_period.equalsIgnoreCase("peak")){
                if(isWeekend){
                    subTotal = subTotal * 1.2;
                }
                else {
                    subTotal = subTotal * 1.4;
                }
            }
            if(distance > 20){
                subTotal = subTotal-5;
            }

        System.out.println(subTotal);*/
    }
}