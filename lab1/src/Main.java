import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double arr[] = {2,5,19,7,10,35};
        task2();
        task3_4();
//        task5();
        task6();
        task7();
        task8();
        task9();
        System.out.println(sumArray(arr));
    }
    public static void task2(){
        int num1;
        double num2;
        String str;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num1 = in.nextInt();
        System.out.print("Enter a floating point: ");
        num2 = in.nextDouble();
        System.out.print("Enter a string: ");
        str = in.next();
        in.close();
    }
    public static void task3_4(){
        int number;
        number = 99;
        number = 88;
        number = number + 1;
        int sum = 0;
        sum = sum + number;
        System.out.println(sum);
        String msg1;
        msg1 = "Hello";
        String msg2 = "World";
        System.out.println(msg1+" "+msg2);
    }
//    public static void task5(){
//        int number;
//        sum = "Hello";
//    }
    public static void task6(){
    String cp[] = { "CS", "IT", "GIS", "AI"};
    for(String str: cp){
        System.out.println(str);
    }
    }
    public static void task7(){
        int total = 0;
        int bound = 5;
        int i = 1;
        while (i<=bound){
            total += i;
            i++;
        }
        System.out.println("Total is: " + total);
    }
    public static void task8(){
        int[] nums = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
    public static void task9(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if((num%2)==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static double sumArray(double [] Array){
        double sum = 0;
        for(int i=0; i<Array.length; i++ ){
            sum += Array[i];
        }
        return sum;
    }
}
