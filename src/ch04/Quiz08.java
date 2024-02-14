package ch04;

public class Quiz08 {
    public static void main(String[] args) {
       String output ="";

       for (int i =1; i <= 5; i ++) {
           for (int j = 1; j <= i; j++) {
               output += "★";
           }
           output += "\n";
       }
        System.out.println(output);
            }
        }
