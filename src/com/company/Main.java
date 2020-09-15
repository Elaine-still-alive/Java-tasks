package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner InputData = new Scanner(System.in);
	    String s = InputData.nextLine();
	    //int N = InputData.nextInt();
        //int a = InputData.nextInt();
        //int b = InputData.nextInt();
        //int c = InputData.nextInt();
        /*int arCounter = InputData.nextInt();
        int ar[] = new int[arCounter];
        for (int i = 0; i<arCounter; i++){
            ar[i] = InputData.nextInt();
        }*/
        flipEndChars(s);
    }
    //1.1
    public static void remainder(int a, int b) {
        System.out.println(a%b);
    }
    //1.2
    public static void triArea(int a, int b) {
        System.out.println(0.5*a*b);
    }
    //1.3
    public static void animals(int a, int b, int c) {
        System.out.println(a*2+b*4+c*4);
    }
    //1.4
    public static void profitableGamble(double a,int b,int c) {
        if (a*b>c) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    //1.5
    public static void operations(int N, int a, int b){
        if ((a+b)==N) {
            System.out.println("сложение");
        }
        else if (a-b==N){
            System.out.println("вычитание");
        }
        else if (a*b==N) {
            System.out.println("умножение");
        }
        else if (a/b==N) {
            System.out.println("деление");
        }
        else {
            System.out.println("none");
        }
    }
    //1.7
    public static void addUpTo(int N){
        int sum = 0;
        for (int i=1; i<=N; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
    //1.8
    public static void nextEdge(int a, int b){
        System.out.println(a+b-1);
    }
    //1.6
    public static void ctoa(String s){
        char mychar = s.charAt(0);
        int ascii = (int) mychar;
        System.out.println(ascii);
    }
    //1.9
    public static void sumOfCubes(int ar[]){
        int sum = 0;
        for (int num: ar) {
            System.out.println("num =" + num +" sum ="+ sum);
            sum += Math.pow(num, 3);
        }
        System.out.println(sum);
    }
    //1.10
    public static void abcmath(int a, int b, int c){
        while(b>0){
            a += a;
            b--;
        }
        if (a%c==0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    //3.1
    public static void solutions(int a, int b, int c){
        if (b*b-4*a*c > 0){
            System.out.println(2);}
        else if (b*b-4*a*c == 0) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
    //3.4
    public static void flipEndChars(String s){
        if (s.length() <= 2) {
            System.out.println("Incompatible");
        } else if (s.charAt(0)==s.charAt(s.length()-1)){
            System.out.println("Two's a pair");
        }
        else {
            String substr = s.substring(1,(s.length()-1));
            String s1 = s.charAt(s.length()-1)+substr+s.charAt(0);
            System.out.println(s1);
        }

    }


}
