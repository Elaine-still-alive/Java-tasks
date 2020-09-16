package com.company;
import java.util.Scanner;

public class Main {
    //Main функция
    public static void main(String[] args) {
	    Scanner InputData = new Scanner(System.in);
	    //String s1 = InputData.nextLine();
        //String s2 = InputData.nextLine();
	    //int N = InputData.nextInt();
        //int a = InputData.nextInt();
        //int b = InputData.nextInt();
        //int c = InputData.nextInt();
        int arCounter = InputData.nextInt();
        int arr[] = new int[arCounter];
        for (int i = 0; i<arCounter; i++){
            arr[i] = InputData.nextInt();
        }
        for(int i:cumulativeSum(arr)){
            System.out.println(i);
        }
    }
    //1.1
    public static int remainder(int a, int b) {
        return a%b;
    }
    //1.2
    public static double triArea(int a, int b) {
        return 0.5*a*b;
    }
    //1.3
    public static int animals(int a, int b, int c) {
        return a*2+b*4+c*4;
    }
    //1.4
    public static boolean profitableGamble(double a,int b,int c) {
        if (a*b>c) {
            return true;
        }
        else {
            return false;
        }
    }
    //1.5
    public static String operations(int N, int a, int b){
        if ((a+b)==N) {
            return "сложение";
        }
        else if (a-b==N){
            return "вычитание";
        }
        else if (a*b==N) {
            return "умножение";
        }
        else if (a/b==N) {
            return "деление";
        }
        else {
            return "none";
        }
    }
    //1.6
    public static int ctoa(String s){
        char mychar = s.charAt(0);
        int ascii = (int) mychar;
        return ascii;
    }
    //1.7
    public static int addUpTo(int N){
        int sum = 0;
        for (int i=1; i<=N; i++) {
            sum +=i;
        }
        return sum;
    }
    //1.8
    public static int nextEdge(int a, int b){
        return a+b-1;
    }
    //1.9
    public static int sumOfCubes(int ar[]){
        int sum = 0;
        for (int num: ar) {
            sum += Math.pow(num, 3);
        }
        return sum;
    }
    //1.10
    public static boolean abcmath(int a, int b, int c){
        while(b>0){
            a += a;
            b--;
        }
        if (a%c==0){
            return true;
        } else {
            return false;
        }
    }
    //2.1
    public static String repeat(String s, int N){
        String sum = "";
        for (char l: s.toCharArray()){
            for (int t = 1; t<=N; t++ ){
                sum +=l;
            }
        }
        return sum;
    }
    //2.2
    public static int differenceMaxMin(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        else {
            int smallest = arr[0];
            int biggest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > biggest) {
                    biggest = arr[i];
                }
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
            int result = biggest - smallest;
            return result;
        }
    }
    //2.3
    public static boolean isAvgWhole(int arr[]){
        int sum = 0;
        for (int i: arr){
            sum+=i;
        }
        if (sum%arr.length == 0){
            return true;
        }
        else {
            return false;
        }

    }
    //2.4
    public static int[] cumulativeSum(int arr[]){
        int arr1[] = new int[arr.length];
        arr1[0] = arr[0];
        int sum = 0;
        for (int i = 1; i<= arr.length-1;i++){
            sum+=arr[i-1];
            arr1[i] = arr[i]+sum;
        }
        return arr1;


    }
    //2.5
    public static int getDecimalPlaces(String a){
       String b = a.substring(a.indexOf("."), a.length() - 1);
       return b.length();
    }
    // 2.6
    public static int Fibonacci(int first) {
        int a = 0;
        int b = 1;
        int result = 0 ;
        for (int i = 0; i < first; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
    // 2.7
    public static boolean isValid(String str) {
        String a = new String(str);
        if (a.length() == 5) {
            boolean c = true;
            for (int i = 0; i < 5; i++) {
                if (a.charAt(i) < 48 || a.charAt(i) > 57) {
                    c = false;
                }
            }
            return c;
        }
        else {
            return false;
        }
    }
    //2.8
    public static boolean isStrangePair(String a, String b){
        if ((a.charAt(0) == b.charAt(b.length()-1))&&(a.charAt(0) == b.charAt(b.length()-1)))
            return true;
        else
            return false;
    }
    // 2.9
    public static boolean isPrefix(String first, String second) {
        second = second.substring(0, second.length()-1);
        if (first.contains(second)) {
            if (first.indexOf(second) == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static boolean isSuffix(String first, String second) {
        second = second.substring(1, second.length());
        if (first.contains(second)) {
            if (first.indexOf(second) == first.length()-second.length()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    // 2.10
    public static int boxSeq(int first) {
        int result = 0;
        for (int i = 0; i < first; i++) {
            if (i % 2 == 0) {
                result += 3;
            }
            else {
                result -= 1;
            }
        }
        return result;
    }
    //3.1
    public static int solutions(int a, int b, int c){
        if (b*b-4*a*c > 0){
            return 2;
        }
        else if (b*b-4*a*c == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
    //3.4
    public static String flipEndChars(String s){
        if (s.length() <= 2) {
            return "Incompatible";
        } else if (s.charAt(0)==s.charAt(s.length()-1)){
            return "Two's a pair";
        }
        else {
            String substr = s.substring(1,(s.length()-1));
            String s1 = s.charAt(s.length()-1)+substr+s.charAt(0);
            return s1;
        }

    }
    /* У Лукоморья дуб зеленый
    Златая цепь на дубе том
    И днем и ночью кот ученый
    Всё ходит по цепи кругом.
     */
}
