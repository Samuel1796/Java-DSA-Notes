package com.amalitech.problems.dsaTrials;

public class TraceTheStack {


    public static int Fib(int value){
//        Base case
        if (value <= 1){
            return value;
        }

        return Fib(value -1) + Fib(value-2);
    }

    public static void main(String[] args) {
        System.out.println(Fib(4));

    }
}
