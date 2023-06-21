package org.example;

public class Main {
    public static void main(String[] args) {

        int intVal1 = 1;
        int intVal2 = 3;
        int intVal3 = 5;
        int intVal4 = 7;

        int Sum1 = intVal1 + intVal2; // 4
        int Sum2 = intVal3 + intVal4; // 12

        if (Sum1 < Sum2){
            System.out.println("Result of (Sum1 < Sum2): " + Sum1 + " < " + Sum2 + " is True");
        }

        Sum1 +=1; // 5
        Sum2 -=2; // 10

        if (Sum1 > Sum2){
            System.out.println("Result of (Sum1 > Sum2): " + Sum1 + " < " + Sum2 + " is True");
        } else {
            System.out.println("Result of (Sum1 > Sum2): " + Sum1 + " > " + Sum2 + " is False");
        }

        if ((Sum1 % 2 == 0) || (Sum2 % 2 == 0)) {
            System.out.println("(Sum1 [" + Sum1 + "] is even) OR (Sum2 [" + Sum2 + "] is even) = True");
        } else {
            System.out.println("(Sum1 [" + Sum1 + "] is even) OR (Sum2 [" + Sum2 + "] is even) = False");
        }
    }
}