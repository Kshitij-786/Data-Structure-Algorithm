package javaCollege;

import java.util.*;
public class bmiCal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble(); //in m
       double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f\n" , bmi);
                if(bmi<18.5){
                    System.out.println("Underweight");
                } else if (bmi<24.9) {
                    System.out.println("Normal Weight");
                } else if (bmi<29.9) {
                    System.out.println("Overweight");
                }
                else System.out.println("Obese");
    }
}
