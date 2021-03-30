package com.company.excrcises;
/**
  @author   Volodymyr Lakusta
  @project   vsem2
  @class  MyInteger
  @version  1.0.0 
  @since 30.03.2021 - 19.13
**/

public class MyInteger {

    public static boolean isPrime(int num){
        return isPrimeRecursion(num, num/2);
    }
    public static boolean isPrimeRecursion(int num, int i){
        if(i == 1) return true;
        if(num % i == 0) return false;
        return isPrimeRecursion(num,--i);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(21));  //output: false
        System.out.println(isPrime(11)); //output: true
        System.out.println(isPrime(31));   //output: true
        System.out.println(isPrime(1001));  //output: false

    }
}
