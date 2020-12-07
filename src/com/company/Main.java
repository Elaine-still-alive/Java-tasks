package com.company;
import java.util.*;
import java.text.DecimalFormat;
//5.8(SHA-256)
import java.security.*;

public class Main {
    //Цвета в консоли
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    //Main функция
    public static void main(String[] args) {
	    Scanner InputData = new Scanner(System.in);
	    //String s1 = InputData.nextLine();
        //String s2 = InputData.nextLine();
	    //int N = InputData.nextInt();
        //int a = InputData.nextInt();
        //int b = InputData.nextInt();
        //int c = InputData.nextInt();
        /*int arCounter = InputData.nextInt();
        float arr[] = new float[arCounter];
        for (int i = 0; i<arCounter; i++){
            arr[i] = InputData.nextFloat();
        }

        for(int i:cumulativeSum(arr)){
            System.out.println(i);
        }*/
        /*
        testIt(11211230, true);
        testIt(13001120, true);
        testIt(23336014, true);
        testIt(11, true);
        testIt(5628, false);
        testIt(9009, true);

         */

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
    //2.6
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
    //2.7
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
    //2.9.1
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
    //2.9.2
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
    //2.10
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
    //3.2
    public static int findZip(String s){
        int a = s.indexOf("zip");
        String s1 = s.substring(a+1);
        int b = s1.indexOf("zip") + (s.length()-s1.length());
        if (s1.indexOf("zip") == -1){
            b = -1;
        }
        return b;
    }
    //3.3
    public static boolean CheckPerfect(int N){
        int sum = 0;
        for (int i = 1; i<N;i++){
            if (N%i == 0) {
                sum += i;}
        }
        if (sum==N){
            return true;
        }
        else{
            return false;
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
    //3.5
    public static boolean isValidHexCode(String a) {
        boolean checking = true;
        if (a.length() == 7 && a.charAt(0) == '#') {
            for (int i = 1; i < 7; i++) {
                if (!((a.charAt(i) >= '0' && a.charAt(i) <= '9') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'F') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'f'))) {
                    checking = false;
                    break;
                }
            }
            return checking;
        }
        else {
            return false;
        }
    }
    //3.6
    public static boolean same(int arr1[], int arr2[]){
        int k = 0;
        int c = 0;
        for (int i=0; i< arr1.length; i++){
            for (int j=0; j<arr1.length; j++) {
                if (arr1[i] == arr1[j]&& (i!=j)) {
                    arr1[j]=456789;
                }
            }
        }
        for (int t=0; t<arr1.length; t++){
            if(arr1[t]!=456789) {
                k+=1;
            }
        }
        for (int i=0; i<arr2.length; i++) {
            for (int j = 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j]&& (i!=j)) {
                    arr2[j]=456789;
                }
            }
        }
        for (int t=0; t<arr2.length; t++){
            if(arr2[t]!=456789) {
                c+=1;
            }
        }
        if (c==k){
            return true;
        }
        else{
            return false;
        }
    }
    //3.7
    public static boolean isKaprekar(int a) {
        int sec = a * a;
        String strSqrt = String.valueOf(sec);
        String strFirst = strSqrt.substring(0, strSqrt.length() / 2);
        String strSec = strSqrt.substring(strSqrt.length() / 2);
        if (strFirst.length() == 0) {
            int intSec = Integer.parseInt(strSec);
            return intSec == a;
        }
        else {
            int intFirst = Integer.parseInt(strFirst);
            int intSec = Integer.parseInt(strSec);
            return intFirst + intSec == a;
        }
    }
    //3.8
    public static String longestZero(String a) {
        boolean checkNumbers = true;
        char[] aArray = a.toCharArray();
        for (char i : aArray) {
            if (!(i == (int) '0' || i == (int) '1')) {
                checkNumbers = false;
                break;
            }
        }
        if (!checkNumbers) {
            return "В строке содержатся другие символы, помимо 0 и 1";
        }
        else {
            int x = Integer.parseInt(a,2);
            long count = 0, maxZero = 0;
            while (x > 0) {
                if ((x & 1) == 1) {
                    if (count > maxZero) {
                        maxZero = count;
                    }
                    count = 0;
                }
                else {
                    count += 1;
                }
                x = x >> 1;
            }
            String result = "";
            for (int i = 0; i < maxZero; i++) {
                result += "0";
            }
            return result;
        }
    }
    //3.9.1
    public static int nextPrime(int a) {
        while (true) {
            if (isPrime(a)) {
                return a;
            }
            a++;
        }
    }
    //3.9.2
    public static boolean isPrime(int n) {


        boolean result = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
    //3.10
    public static boolean rightTriangle(int a, int b, int c) {
        int maxValue = 0;
        int firstValue = 0;
        int secondValue = 0;
        if (a > b && a > c) {
            maxValue = a;
            firstValue = b;
            secondValue = c;
        }
        else if (b > a && b > c) {
            maxValue = b;
            firstValue = a;
            secondValue = c;
        }
        else if (c > a && c > b) {
            maxValue = c;
            firstValue = a;
            secondValue = b;
        }
        else {
            return false;
        }
        return maxValue * maxValue == firstValue * firstValue + secondValue * secondValue;
    }
    //4.1.1
    public static int isSpace(String a, String b) {
        String withSpaces = a + " " + b;
        int count = 0;
        for (int i = 0; i < withSpaces.length(); i++) {
            char c = withSpaces.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        return withSpaces.length() - count;
    }
    //4.1.2
    public static String essay(int n, int k, String str) {
        String[] arrStr = str.split(" ");
        for (int i = 1; i < n; i++) {
            if (isSpace(arrStr[i-1], arrStr[i]) <= k) {
                arrStr[i] = arrStr[i-1] + " " + arrStr[i];
                arrStr[i-1] = "";
            }
        }
        String outTxt = "";//Строка необходимая для вывода
        for (int i = 0; i < n; i++) {
            if (arrStr[i].length() > 0) {
                outTxt += arrStr[i]+"\n";
            }
        }
        return outTxt;
    }
    //4.2
    public static String[] split(String a) {
        boolean checkBkt = true;
        char[] aArray = a.toCharArray();
        String[] resArray = new String[0];
        for (char i : aArray) {
            if (!(i == (int) '(' || i == (int) ')')) {
                checkBkt = false;
                break;
            }
        }
        if (checkBkt) {
            int count0 = 0, count1 = 0, preI = 0;
            for (int i = 0; i < aArray.length-1; i++) {
                if (aArray[i] == '(') count0++;
                if (aArray[i] == ')') count1++;
                if (count0 == count1) {
                    resArray = Arrays.copyOf(resArray, resArray.length + 1);
                    resArray[resArray.length - 1] = a.substring(preI, i+1);
                    preI = i + 1;
                }
            }
            resArray = Arrays.copyOf(resArray, resArray.length + 1);
            resArray[resArray.length - 1] = a.substring(preI);
        }
        return resArray;
    }
    //4.3.1
    public static String toCamelCase(String a) {
        while (a.contains("_")) {
            int find = a.indexOf("_");
            if (find == 0) {
                a = a.substring(1);
            }
            else if (find < a.length() - 2) {
                a = a.substring(0, find) + a.substring(find+1, find + 2).toUpperCase() + a.substring(find + 2);
            }
            else if (find < a.length() - 1) {
                a = a.substring(0, find) + a.substring(find+1, find + 2).toUpperCase();
            }
            else if (find < a.length()) {
                a = a.substring(0, find);
            }
        }
        return a;
    }
    //4.3.2
    public static String toSnakeCase(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                if (i == 0) {
                    a = a.substring(0, 1).toLowerCase() + a.substring(1);
                }
                else if (i < a.length() - 1) {
                    a = a.substring(0, i) + "_" + a.substring(i, i + 1).toLowerCase() + a.substring(i + 1);
                }
                else {
                    a = a.substring(0, i) + "_" + a.substring(i).toLowerCase();
                }
            }
        }
        return a;
    }
    //4.4
    public static String overTime(float[] array) {
        float overtimeMorning = 0.0f, overtime = 0.0f;
        if (array[0] < 9) {
            overtimeMorning = 9.0f - array[0];
        }
        if (array[1] > 17) {
            overtime = (array[1] - 17.0f) + overtimeMorning;
        }
        float result = (array[1] - array[0] - overtime) * array[2] + overtime * array[2] * array[3];
        String res = String.valueOf(result);
        res += "00";
        res = res.substring(0, res.indexOf(".") + 3);
        return "$" + res;
    }
    //4.5
    public static String BMI(String s, String s2){
        String slovor = "";
        s = s.trim();
        s2 = s2.trim();
        int ind = s.indexOf(' ');
        int ind2 = s2.indexOf(' ');
        String chislo = s.substring(0,ind);
        String slovo = s.substring(ind+1);
        String chislo2 = s2.substring(0,ind2);
        String slovo2 = s2.substring(ind2+1);
        double a = Double.parseDouble(chislo);
        double b = Double.parseDouble(chislo2);
        if (slovo.equalsIgnoreCase("pounds")) {
            a = a/(2.205);
        }
        if (slovo2.equalsIgnoreCase("inches")) {
            b = b/(39.37);
        }
        double rez = a/(b*b);
        if (rez<18.5) {
            slovor = "Недостаточный вес";
        }
        else if (rez<25) {
            slovor = "Нормальный вес";
        }
        else {
            slovor = "Избыточный вес";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        String rezokr = decimalFormat.format(rez);
        String result = String.valueOf(rezokr)+" "+slovor;
        return result;

    }
    //4.6
    public static int bugger(int a) {
        int count = 0;
        while (a >= 10) {
            int mlt = 1, mod;
            while (a != 0) {
                mod = a % 10;
                mlt *= mod;
                a = a / 10;
            }
            a = mlt;
            count++;
        }
        return count;
    }
    //4.7
    public static String toStarShorthand(String a) {
        int i = 1, count = 1;
        String res = "";
        while (i < a.length()) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                count++;
                if (a.length() - 1 == i){
                    res += a.charAt(i) + "*" + count;
                    break;
                }
                else
                    i++;
            }
            else {
                if (count == 1) {
                    res += a.charAt(i - 1);
                    if (i == a.length() - 1) {
                        res += a.charAt(i);
                    }
                }
                else {
                    res += a.charAt(i - 1) + "*" + count;
                }
                count = 1;
                i++;
            }
        }
        return res;
    }
    //4.8
    public static boolean doesRhyme(String s, String s2){
        String c ="";
        String k ="";
        int a = s.lastIndexOf(" ");
        int b = s2.lastIndexOf(" ");
        String subs = s.substring(a);
        String subs2 = s2.substring(b);

        for (char l:subs.toCharArray()){
            if ((l=='a')||(l=='e')||(l=='i')||(l=='o')||(l=='u')||(l=='y')||(l=='A')||(l=='E')||(l=='I')||(l=='O')||(l=='U')||(l=='Y')){
                c+=l;
            }
        }
        for (char l:subs2.toCharArray()){
            if ((l=='a')||(l=='e')||(l=='i')||(l=='o')||(l=='u')||(l=='y')||(l=='A')||(l=='E')||(l=='I')||(l=='O')||(l=='U')||(l=='Y')){
                k+=l;
            }
        }
        return c.equalsIgnoreCase(k);



    }
    //4.9
    public static boolean trouble(String a, String b) {
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        boolean result = false;
        int[] num1 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 1; i < aChar.length; i++) {
            if (aChar[i] == aChar[i-1]) {
                num1[Character.getNumericValue(aChar[i])] += 1;
            }
        }
        for (int i = 1; i < bChar.length; i++) {
            if (bChar[i] == bChar[i-1]) {
                num2[Character.getNumericValue(bChar[i])] += 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (num1[i] == 2 && num2[i] == 1) {
                result = true;
                break;
            }
        }
        return result;
    }
    //4.10
    public static int countUniqueBooks(String a, String b) {
        if (b.length() == 1) {
            String partA = a;
            String[] parts = new String[0];
            while (partA.length() != 0) {
                int beginPart = partA.indexOf(b);
                if (beginPart == -1) {
                    break;
                }
                partA = partA.substring(beginPart + 1);
                int endPart = partA.indexOf(b);
                parts = Arrays.copyOf(parts, parts.length + 1);
                parts[parts.length - 1] = partA.substring(0, endPart);
                partA = partA.substring(endPart + 1);
            }
            String resStr = "";
            for (String i: parts) {
                resStr += i;
            }
            String lowerRes = resStr.toLowerCase();
            boolean[] isItThere = new boolean[Character.MAX_VALUE];
            for (int i = 0; i < lowerRes.length(); i++) {
                isItThere[lowerRes.charAt(i)] = true;
            }
            int count = 0;
            for (boolean value: isItThere) {
                if (value) {
                    count++;
                }
            }
            return count;
        }
        else {
            return -1;
        }
    }
    //5.1.1
    public static String encrypt(String a) {
        String outStr = "";
        int[] res = new int[a.length()];
        int lastChar = 0;
        char[] charArray = a.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int charSym = (int) charArray[i];
            res[i] = charSym - lastChar;
            outStr += res[i] + " ";
            lastChar = charSym;
        }
        return outStr;
    }
    //5.1.2
    public static String decrypt(int[] a) {
        String res = "";
        int lastCode = 0;
        for (int i = 0; i < a.length; i++) {
            char newAscii = (char) (lastCode + a[i]);
            lastCode = lastCode + a[i];
            res += String.valueOf(newAscii);
        }
        return res;
    }
    //5.2
    public static boolean canMove(String a, String bStr, String cStr) { // 5.2
        char[] b = bStr.toCharArray();
        char[] c = cStr.toCharArray();
        if ((b.length == 2 && c.length == 2) && ((b[0] >= 'A' && b[0] <= 'H') || (b[0] >= 'a' && b[0] <= 'h')) &&
                ((c[0] >= 'A' && c[0] <= 'H') || (c[0] >= 'a' && c[0] <= 'h')) && (b[1] >= '1' && b[1] <= '8')
                && (c[1] >= '1' && c[1] <= '8')) {
            if (a.trim().toLowerCase().equals("пешка")) {
                if (b[0] == c[0]) {
                    if (b[1] == '1') {
                        return false;
                    }
                    if (b[1] == '2' && c[1] == '4') {
                        return true;
                    }
                    int begin = (int) b[1];
                    int end = (int) c[1];
                    return begin + 1 == end;
                } else {
                    return false;
                }
            } else if (a.trim().toLowerCase().equals("конь")) {
                return ((Math.abs((b[1] - c[1])) == 2 && Math.abs(b[0] - c[0]) == 1) ||
                        (Math.abs((b[0] - c[0])) == 2 && Math.abs(b[1] - c[1]) == 1));
            } else if (a.trim().toLowerCase().equals("слон")) {
                return (Math.abs(b[0] - c[0]) == Math.abs(b[1] - c[1]));
            } else if (a.trim().toLowerCase().equals("ладья")) {
                return b[0] == c[0] || b[1] == c[1];
            } else if (a.trim().toLowerCase().equals("ферзь")) {
                return (b[0] == c[0] || b[1] == c[1]) || (Math.abs(b[0] - c[0]) == Math.abs(b[1] - c[1]));
            } else if (a.trim().toLowerCase().equals("король")) {
                return ((b[0] == c[0]) && (b[1] + 1 == c[1]) || (b[1] == c[1]) && (b[0] + 1 == c[0]) ||
                        (b[0] == c[0]) && (b[1] - 1 == c[1]) || (b[1] == c[1]) && (b[0] - 1 == c[0]));
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    /*
    testIt("пешка", "B7", "A8",false);
    testIt("конь", "D3", "E5", true);
    testIt("слон", "G3", "H3",false);
    testIt("Ладья", "H1", "H6",true);
    testIt("Ферзь", "E3", "H6",true);
    testIt("король", "E3", "E1",false);
    */
    //5.3
    public static boolean canComplete(String a, String b){
        for (char let: a.toCharArray()) {
            int curSymPos = b.indexOf((int)let);
            if ((curSymPos != -1)) {
                b = b.substring(curSymPos+1, b.length());
            } else
                return false;
        }
        return true;
    }
    //5.4
    public static int sumDigProd(int[] arrOfNums){
        int sum = 0;
        for (int num:arrOfNums) {
            sum += num;
        }
        while (sum / 10 != 0){
            int allNumProded = 1;
            String temp = Integer.toString(sum);
            for (int i = 0; i < temp.length(); i++)
            {
                allNumProded = Character.getNumericValue(temp.charAt(i)) * allNumProded;
            }
            sum = allNumProded;
        }
        return sum;
    }
    //5.5
    public static ArrayList<String> sameVowelGroup(String[] a){
        ArrayList<String> AnsWords = new ArrayList<>(Arrays.asList(a[0]));

        ArrayList<Character> usedVowelsDefault = new ArrayList<>();
        for (char symFromMainWord: a[0].toLowerCase().toCharArray()) {
            if (usedVowelsDefault.indexOf(symFromMainWord) == -1) {
                switch (symFromMainWord) {
                    case 'a':
                        usedVowelsDefault.add('a');
                        break;
                    case 'e':
                        usedVowelsDefault.add('e');
                        break;
                    case 'i':
                        usedVowelsDefault.add('i');
                        break;
                    case 'o':
                        usedVowelsDefault.add('o');
                        break;
                    case 'u':
                        usedVowelsDefault.add('u');
                        break;
                }
            }
        }

        for (int i = 1; i < a.length; i++) {
            ArrayList<Character> usedVowelsCur = new ArrayList<>();
            for (char checkSym: a[i].toLowerCase().toCharArray()) {
                if (usedVowelsCur.indexOf(checkSym) == -1) {
                    switch (checkSym) {
                        case 'a':
                            usedVowelsCur.add('a');
                            break;
                        case 'e':
                            usedVowelsCur.add('e');
                            break;
                        case 'i':
                            usedVowelsCur.add('i');
                            break;
                        case 'o':
                            usedVowelsCur.add('o');
                            break;
                        case 'u':
                            usedVowelsCur.add('u');
                            break;
                    }
                }
            }
            if(usedVowelsDefault.containsAll(usedVowelsCur) && usedVowelsCur.containsAll(usedVowelsDefault)) AnsWords.add(a[i]);
        }

        return AnsWords;
    }
    //5.6
    public static boolean validateCard(long a){
        String cardNum = Long.toString(a);
        int cardNumLength = cardNum.length();
        
        if((cardNumLength > 13) && (cardNumLength < 20)){
            int contralNum = cardNum.charAt(cardNumLength-1) - '0';
            int sumOfNums = 0;
            
            for (int i = cardNumLength-2; i > -1; i--){
                int curNum;
                if (i % 2 == 0) {
                    curNum = (cardNum.charAt(i) - '0') * 2;
                    if(curNum > 9)
                        sumOfNums += curNum - 9;
                    else
                        sumOfNums += curNum;
                } else
                    sumOfNums += cardNum.charAt(i) - '0';
            }

            if((10 - (sumOfNums % 10)) == contralNum)
                return true;
            else
                return false;
            
        } else 
            return false;
    }
    /*
        testIt(1234567890123456L, false);
        testIt(1234567890123452L, true);
        testIt(73549559387541L, true);
        testIt(7354955938L, false);
        testIt(54364856284521L, true);
         */
    //5.7.1 (RUS)
    public static String numToRus(int a){
        String s = Integer.toString(a);
        if (s.length()==1){
            return oneNumberRus(a);
        }
        else if (s.length()==2){
            return twoNumberRus(a);
        }
        else {
            return threeNumberRus(a);
        }
    }
    public static String oneNumberRus(int a){
        String res = " ";
        switch (a){
            case 0:
                res = "ноль";
                break;
            case 1:
                res = "один";
                break;
            case 2:
                res = "два";
                break;
            case 3:
                res = "три";
                break;
            case 4:
                res = "четыре";
                break;
            case 5:
                res = "пять";
                break;
            case 6:
                res = "шесть";
                break;
            case 7:
                res = "семь";
                break;
            case 8:
                res = "восемь";
                break;
            case 9:
                res = "девять";
                break;
        }
        return res;
    }
    public static String twoNumberRus(int a){
        String res = " ";
        String juu = " ";
        if (a<20){
            switch (a){
                case 10:
                    res = "десять";
                    break;
                case 11:
                    res = "одиннадцать";
                    break;
                case 12:
                    res = "двенадцать";
                    break;
                case 13:
                    res = "тринадцать";
                    break;
                case 14:
                    res = "четырнадцать";
                    break;
                case 15:
                    res = "пятнадцать";
                    break;
                case 16:
                    res = "шестнадцать";
                    break;
                case 17:
                    res = "семнадцать";
                    break;
                case 18:
                    res = "восемнадцать";
                    break;
                case 19:
                    res = "девятнадцать";
                    break;
            }
        }
        else {
            int b = a%10;

            a = a/10;
            switch (a){
                case 2:
                    juu = "двадцать ";
                    break;
                case 3:
                    juu = "тридцать ";
                    break;
                case 4:
                    juu = "сорок ";
                    break;
                case 5:
                    juu = "пятьдесят ";
                    break;
                case 6:
                    juu = "шестьдесят ";
                    break;
                case 7:
                    juu = "семьдесят ";
                    break;
                case 8:
                    juu = "восемьдесят ";
                    break;
                case 9:
                    juu = "девяносто ";
                    break;

            }

            res = juu + oneNumberRus(b);
            if (b==0){
                res = juu;
            }
        }
        return res;
    }
    public static String threeNumberRus(int a){
        String res = " ";
        String sotnya =" ";
        int b = a%100;
        a = a/100;
        switch (a){
            case 1:
                sotnya = "сто ";
                break;
            case 2:
                sotnya = "двести ";
                break;
            case 3:
                sotnya = "триста ";
                break;
            case 4:
                sotnya = "четыреста ";
                break;
            case 5:
                sotnya = "пятьсот ";
                break;
            case 6:
                sotnya = "шестьсот ";
                break;
            case 7:
                sotnya = "семьсот ";
                break;
            case 8:
                sotnya = "восемьсот ";
                break;
            case 9:
                sotnya = "девятьсот ";
                break;
        }
        if (b == 0) {
            res = sotnya;
        }
        else if (b>0&&b<=9){
            res = sotnya + oneNumberRus(b);
        }

       else
           res = sotnya + twoNumberRus(b);

        return res;
    }
    /*
        testIt(0,"ноль");
        testIt(18,"восемнадцать");
        testIt(126,"сто двадцать шесть");
        testIt(909,"девятьсот девять");
        testIt(137,"сто тридцать семь");
        testIt(719,"семьсот девятнадцать");
        testIt(877,"восемьсот семьдесят семь");
        testIt(503,"пятьсот три");
     */
    //5.7.2 (ENG)
    public static String numToEng(int a){
        String s = Integer.toString(a);
            if (s.length()==1){
            return oneNumber(a);
        }
            else if (s.length()==2){
            return twoNumber(a);
        }
            else {
            return threeNumber(a);
        }
    }
    public static String oneNumber(int a){
        String res = " ";
        switch (a){
            case 0:
                res = "zero";
                break;
            case 1:
                res = "one";
                break;
            case 2:
                res = "two";
                break;
            case 3:
                res = "three";
                break;
            case 4:
                res = "four";
                break;
            case 5:
                res = "five";
                break;
            case 6:
                res = "six";
                break;
            case 7:
                res = "seven";
                break;
            case 8:
                res = "eight";
                break;
            case 9:
                res = "nine";
                break;
        }
        return res;
    }
    public static String twoNumber(int a){
        String res = " ";
        String juu = " ";
        if (a<20){
            switch (a){
                case 10:
                    res = "ten";
                    break;
                case 11:
                    res = "eleven";
                    break;
                case 12:
                    res = "twelve";
                    break;
                case 13:
                    res = "thirteen";
                    break;
                case 14:
                    res = "fourteen";
                    break;
                case 15:
                    res = "fifteen";
                    break;
                case 16:
                    res = "sixteen";
                    break;
                case 17:
                    res = "seventeen";
                    break;
                case 18:
                    res = "eighteen";
                    break;
                case 19:
                    res = "nineteen";
                    break;
            }
        }
        else {
            int b = a/10;

            a = a%10;

            switch (b){
                case 2:
                    juu = "twenty ";
                    break;
                case 3:
                    juu = "thirty ";
                    break;
                case 4:
                    juu = "fourty ";
                    break;
                case 5:
                    juu = "fifty ";
                    break;
                case 6:
                    juu = "sixty ";
                    break;
                case 7:
                    juu = "seventy ";
                    break;
                case 8:
                    juu = "eighty ";
                    break;
                case 9:
                    juu = "ninety ";
                    break;
            }
            res = juu + oneNumber(a);
            if (a==0){
                res = juu;
            }
        }
        return res;
    }
    public static String threeNumber(int a){
        String res = " ";
        int c = a%100;
        a = a/100;
        if (c == 0) {
            res = oneNumber(a) + " hundred";
        }
        else if (c>0&&c<=9){
            res = oneNumber(a) + " hundred " + oneNumber(c);
        }
        else
            res = oneNumber(a) + " hundred " + twoNumber(c);
        return res;
    }
    /*
        testIt(0,"zero");
        testIt(18,"eighteen");
        testIt(126,"one hundred twenty six");
        testIt(909,"nine hundred nine");
        testIt(137,"one hundred thirty seven");
        testIt(719,"seven hundred nineteen");
        testIt(877,"eight hundred seventy seven");
        testIt(503,"five hundred three");
     */
    //5.8
    public static String getSha256Hash(String a){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");//Выбираем тип шифрования
            byte[] hash = digest.digest(a.getBytes("UTF-8"));//Шифруем
            StringBuffer hexString = new StringBuffer();
            //Собираем строку
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch(Exception e){
            return "Error"; //https://stackoverflow.com/a/37424329
        }
    }
    //5.9
    public static String correctTitle(String a){
        String[] words = a.toLowerCase().split("\\s+");
        String ans = "";

        for (int i = 0; i < words.length; i++){

            if (words[i].equals("in") || words[i].equals("of") || words[i].equals("the") || words[i].equals("and"))
                ans += words[i] + " ";
            else {
                char[] numArr = words[i].toCharArray();
                ans += Character.toUpperCase(numArr[0]) + words[i].substring(1,words[i].length()) + " ";
            }

            if (i == words.length - 1)
                ans = ans.substring(0, ans.length()-1);
            System.out.println("ans = " + ans);
        }

        return ans;
    }
    /*
        testIt("jOn SnoW, kINg IN thE noRth.", "Jon Snow, King in the North.");
        testIt("sansa stark, lady of winterfell.", "Sansa Stark, Lady of Winterfell.");
        testIt("TYRION LANNISTER, HAND OF THE QUEEN.", "Tyrion Lannister, Hand of the Queen.");
        testIt("criPPles, bastards, aND brokEn thINGs", "Cripples, Bastards, and Broken Things");
        testIt("FIRE AND BLOOD", "Fire and Blood");
        testIt("mother's mercy", "Mother's Mercy");
         */
    //5.10
    public static String hexLattice(int a){
        int pointInFirstLine = 0;
        int workedNum = a;
        int subNum = 1;
        while (workedNum > 0){
            pointInFirstLine++;
            workedNum -= subNum;
            subNum = pointInFirstLine * 6;
        }
        if ((((a - 1) % 6 == 0) || (a == 1)) && (workedNum == 0)) {
            String ans = "";

            int dotsInLine = pointInFirstLine;
            for (int i = pointInFirstLine; i > 0; i--){
                for (int spaceCount = i; spaceCount > 1; spaceCount--)
                    ans += " ";

                for (int j = dotsInLine; j > 0; j--)
                    ans += " o";

                dotsInLine++;
                ans += "\n";
            }
            for (int i = dotsInLine-1; i > pointInFirstLine; i--){
                for (int spaceCount = ((dotsInLine)-i); spaceCount > 0; spaceCount--)
                    ans += " ";

                for (int j = i-1; j > 0; j--){
                    ans += " o";
                }
                ans += "\n";
            }
                return ans;
        } else
            return "Invalid";
    }
    /* testIt(1, "Valid");
        testIt(7, "Valid");
        testIt(19, "Valid");
        testIt(21, "Invalid");
        testIt(37, "Valid");
        testIt(91, "Valid");*/
    /*
    //6.1.1
    public static int bell(int a){
        int ans = 0;
        if (a==1||a==2||a==3){
            switch (a) {
                case 1:
                    ans = 1;
                    break;
                case 2:
                    ans = 2;
                    break;
                case 3:
                    ans = 5;
                    break;

            }    }
        else if (a%2!=0){
            ans = 2+a;
            for (int k = 2;k<=a/2;k++){
                ans+=getFactorial(a)/(getFactorial(k)*getFactorial(a-k));
            }
        }
        else {
            ans = 2+a;
            for (int k = 2;k<=a/2;k++){
                if (k==a/2) {
                    ans += (getFactorial(a) / (getFactorial(k) * getFactorial(a-k)))/2;
                }
                else
                    ans+=getFactorial(a)/(getFactorial(k)*getFactorial(a-k));
            }
        }
        return ans;
    }
    //6.1.2
    public static int getFactorial(int a){
        int result = 1;
        for (int i = 1; i <=a; i ++){
            result = result*i;
        }
        return result;
    }

     */
    //6.1
    static int bell(int a) {
        int[][] bell = new int[a+1][a+1];
        bell[0][0] = 1;
        //System.out.println("bell[0][0] = 1 => " + bell[0][0]);

        for (int i=1; i<=a; i++)
        {
            bell[i][0] = bell[i-1][i-1];
            //System.out.println("bell["+i+"][0] = bell["+(i-1)+"]["+(i-1)+"] => " + bell[i][0]);

            for (int j=1; j<=i; j++) {
                bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
                //System.out.println("bell["+i+"]["+j+"] = bell["+(i - 1)+"]["+(j - 1)+"] + bell["+i+"]["+(j - 1)+"] => " + bell[i][j]);
            }
        }
        return bell[a][0];
    }
    //6.2
    public static String translateWord(String s){
        String res = "";
        boolean ifLetterUp = false;
        if (s == " "||s == ""){
            return res;
        }
        char l = s.charAt(0);
        if (l>='A'&&l<='Z')
            ifLetterUp = true;
        if ((l=='a')||(l=='e')||(l=='i')||(l=='o')||(l=='u')||(l=='y')||(l=='A')||(l=='E')||(l=='I')||(l=='O')||(l=='U')||(l=='Y')){
            res = s + "yay";
        }
        else {
            for (int i = 1; i<=s.length()-1;i++){
                char r = s.charAt(i);
                if ((r=='a')||(r=='e')||(r=='i')||(r=='o')||(r=='u')||(r=='y')){
                    String end = s.substring(0,i);
                    res = s.substring(i,s.length())+end+"ay";
                    break;
                }
            }
        }
        if (ifLetterUp)
            res = Character.toUpperCase(res.charAt(0)) + res.toLowerCase().substring(1,res.length());
        return res;
    }
    /*
                testIt("flag", "agflay");
                testIt("Apple", "Appleyay");
                testIt("button", "uttonbay");
                testIt("","");
                testIt("shit", "itshay");
                testIt("yellow", "yellowyay");
    */
    public static String translateSentence(String s) {
        String res = "";
        String letters = "";
        String symbols = "";
        if (s == " ") {
            return res + " ";
        }
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            letters = "";
            symbols = "";
            for (char l : words[i].toCharArray()) {
                if (l >= 'A' && l <= 'z') {
                    letters += l;
                } else {
                    symbols += l;
                }


            }
            if (i == words.length - 1)
                res += translateWord(letters) + symbols;
            else
                res += translateWord(letters) + symbols + " ";
        }
        return res;
    }
    /*
        testIt("I like to eat honey waffles.", "Iyay ikelay otay eatyay oneyhay afflesway.");
        testIt("Do you think it is going to rain today?", "Oday youyay inkthay ityay isyay oinggay otay ainray odaytay?");
    */
    //6.3
    public static boolean validColor(String a){
        a = a.toLowerCase();
        if (a.contains("rgba")) {
            String[] arrOfRGBA = a.substring(5, a.length()).split("[\\D&&[^.]]");
            if (arrOfRGBA.length == 4) {
                try{
                    for (int i = 0; i < 3; i++){
                        if (!(Integer.parseInt(arrOfRGBA[i]) >= 0 && Integer.parseInt(arrOfRGBA[i]) <= 255))
                            return false;
                    }
                    if (Float.parseFloat(arrOfRGBA[3]) >= 0 && Float.parseFloat(arrOfRGBA[3]) <= 1)
                        return true;
                    else
                        return false;
                } catch (Exception e) {
                    return false;
                }
            } else
                return false;
        } else if (a.contains("rgb")) {
            String[] arrOfRGBA = a.substring(4, a.length()).split("[\\D&&[^.]]");
            if (arrOfRGBA.length == 3) {
                try{
                    for (int i = 0; i < 3; i++){
                        if (!(Integer.parseInt(arrOfRGBA[i]) >= 0 && Integer.parseInt(arrOfRGBA[i]) <= 255))
                            return false;
                    }
                    return true;
                } catch (Exception e){
                    return false;
                }
            } else
                return false;
        } else
            return false;
    }
    /*
        testIt("rgb(0,0,0)", true);
        testIt("rgb(0,,0)", false);
        testIt("rgb(255,256,255)", false);
        testIt("rgba(0,0,0,0.123456789)", true);
        testIt("rgba(-asd,-5,-3,123)", false);
        testIt("rgba(51,82,90,0.5)", true);
         */
    //6.4
    public static String stripUrlParams(String url, String ... argsToDell){
        String[] args = url.substring(url.indexOf("?") + 1).split("&");
        String finalArgs = "";
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].charAt(0) == args[j].charAt(0))
                    args[i] = " ";
            }
            for (int j = 0; j < argsToDell.length; j++) {
                if (args[i].charAt(0) == argsToDell[j].charAt(0))
                    args[i] = " ";
            }

        }
        Arrays.sort(args);
        for (int i = 0; i < args.length; i++) {
            if (args[i] != " ")
                if (i != args.length - 1)
                    finalArgs += args[i] + "&";
                else
                    finalArgs += args[i];
        }
        return url.substring(0, url.indexOf("?")+1) + finalArgs;
    }
    /*
        testIt("https://edabit.com?a=1&b=2&a=2", "https://edabit.com?a=2&b=2");
        testIt("https://edabit.com?a=1&b=2&a=2", "https://edabit.com?a=2", ("b"));
        testIt("https://edabit.com", "https://edabit.com", ("b"));
        testIt("https://www.google.com/search?q=1&q=2&q=3", "https://www.google.com/search?q=3");
        testIt("https://www.google.com/search?q=123", "https://www.google.com/search?",new String[] {"q", "s", "w"});
        testIt("https://www.google.com/search?q=MTUCI", "https://www.google.com/search?q=MTUCI");
         */
    //6.5
    public static String[] getHashTags(String a){
        String[] wordsArr = a.toLowerCase().split("[\\s,]+");
        int highLength = wordsArr[0].length();
        for (int i = 1; i < wordsArr.length; i++) {
            if (wordsArr[i].length() > highLength)
                highLength = wordsArr[i].length();
        }
        int tagsSize = 3;
        if (wordsArr.length < 3)
            tagsSize = wordsArr.length;
        String[] tagsArr = new String[tagsSize];
        int tagsLeft = tagsSize;
        int tagsPosCounter = 0;
        for (int i = 0; (tagsLeft > 0)&&(highLength > 0); i++) {
            if (wordsArr[i].length() == highLength) {
                tagsArr[tagsPosCounter] = "#" + wordsArr[i];
                tagsLeft--;
                tagsPosCounter++;
            }
            if (i == wordsArr.length-1){
                i = -1;
                highLength--;
            }
        }
        return tagsArr;
    }
    /*
        testIt("How the Avocado Became the Fruit of the Global Trade", new String[] {"#avocado", "#became", "#global"});
        testIt("Why You Will Probably Pay More for Your Christmas Tree This Year", new String[] {"#christmas", "#probably", "#will"});
        testIt("Hey Parents, Surprise, Fruit Juice Is Not Fruit", new String[] {"#surprise", "#parents", "#fruit"});
        testIt("Visualizing Science", new String[] {"#visualizing", "#science"});
        testIt("Kek, Monday", new String[] {"#monday", "#kek"});
        testIt("The 2020 year set to be in top three warmest", new String[] {"#warmest", "#three", "#2020"});

         */
    //6.6
    public static int ulam(int a){
        int[] ulamaPeriod = new int[a];
        for (int i = 0; i < ulamaPeriod.length; i++) {
            switch (i) {
                case 0:
                    ulamaPeriod[i] = 1;
                    break;
                case 1:
                    ulamaPeriod[i] = 2;
                    break;
                default:
                    int waysOfSolve = 0;
                    int rightNumber = ulamaPeriod[i-1] + 1;
                    while (waysOfSolve != 2) {
                        waysOfSolve = 0;
                        for (int j = 0; j < i; j++) {
                            for (int k = 0; k < i; k++) {
                                if ((ulamaPeriod[j] != ulamaPeriod[k]) && (ulamaPeriod[j] + ulamaPeriod[k] == rightNumber))
                                    waysOfSolve++;
                            }
                        }
                        if (waysOfSolve != 2)
                            rightNumber++;
                        else
                            ulamaPeriod[i] = rightNumber;
                    }
                    break;
            }
        }
        return ulamaPeriod[a-1];
    }
    /*
        testIt(4,4);
        testIt(9,16);
        testIt(206,1856);
        testIt(13, 36);
        testIt(17, 53);
        testIt(8, 13);

         */
    //6.7
    public static String longestNonrepeatingSubstring(String str) {
        Map<Character, Integer> visitedChars = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < str.length(); end++) {
            char currChar = str.charAt(end);
            if (visitedChars.containsKey(currChar))
                start = Math.max(visitedChars.get(currChar)+1, start);
            if (output.length() < end - start + 1)
                output = str.substring(start, end + 1);
            visitedChars.put(currChar, end);
        }
        return output;
    }
    /*
        testIt("abcabcbb", "abc");
        testIt("aaaaaa", "a");
        testIt("abcde", "abcde");
        testIt("abcda", "abcd");
        testIt("wintercomestoday", "wintercom");
        testIt("jkabra", "jkabr");

         */
    //6.8
    public static String convertToRoman(int a){
        String ans = "";
        if (a/1000 != 0) {
            for (int i = a; i/1000 != 0; i -= 1000){
                ans += "M";
            }
            a %= 1000;
        }
        if (a/100 != 0) {
            int hundred = a/100;
            if (hundred <= 3)
                for (int i = 0; i < hundred; i++) {
                    ans += "C";
                }
            else if (hundred == 4)
                ans += "CD";
            else if (hundred <= 8) {
                ans += "D";
                for (int i = 5; i < hundred; i++) {
                    ans += "C";
                }
            } else if (hundred == 9)
                ans += "CM";
            a %= 100;
        }
        if (a/10 != 0) {
            int ten = a/10;
            if (ten <= 3)
                for (int i = 0; i < ten; i++) {
                    ans += "X";
                }
            else if (ten == 4)
                ans += "XL";
            else if (ten <= 8) {
                ans += "L";
                for (int i = 5; i < ten; i++) {
                    ans += "X";
                }
            } else if (ten == 9)
                ans += "XC";
            a %= 10;
        }
        if (a%10 != 0){
            int num = a%10;
            if (num <= 3)
                for (int i = 0; i < num; i++) {
                    ans += "I";
                }
            else if (num == 4)
                ans += "IV";
            else if (num <= 8) {
                ans += "V";
                for (int i = 5; i < num; i++) {
                    ans += "I";
                }
            } else if (num == 9)
                ans += "IV";
        }
        return ans;
    }
    /*
        testIt(2,"II");
        testIt(12,"XII");
        testIt(16,"XVI");
        testIt(201,"CCI");
        testIt(2240,"MMCCXL");
        testIt(2975, "MMCMLXXV");
        testIt(3490, "MMMCDXC");
        testIt(3662,"MMMDCLXII");

         */
    //6.9
    public static boolean formula(String a){
        boolean ans = false;
        int equalsPos = a.indexOf("=");

        if ((equalsPos > -1) && (a.lastIndexOf("=") == equalsPos)) {
            int mathAns = Integer.parseInt(a.substring(equalsPos+1).trim());
            String mathExpres = a.substring(0, equalsPos);

            if ((a.indexOf("+") > -1) && (a.indexOf("+") < equalsPos)) {
                String[] mathVars = mathExpres.trim().split(" \\+ ");
                if (Integer.parseInt(mathVars[0]) + Integer.parseInt(mathVars[1]) == mathAns)
                    ans = true;


            } else if ((a.indexOf("*") > -1) && (a.indexOf("*") < equalsPos)) {
                String[] mathVars = mathExpres.trim().split(" \\* ");
                if (Integer.parseInt(mathVars[0]) * Integer.parseInt(mathVars[1]) == mathAns)
                    ans = true;

            } else if ((a.indexOf("/") > -1) && (a.indexOf("/") < equalsPos)) {
                String[] mathVars = mathExpres.trim().split(" \\/ ");
                if (Integer.parseInt(mathVars[0]) / Integer.parseInt(mathVars[1]) == mathAns)
                    ans = true;

            } else if ((a.indexOf("-") > -1) && (a.indexOf("-") < equalsPos)) {
                String[] mathVars = mathExpres.trim().split(" \\- ");
                if (Integer.parseInt(mathVars[0]) - Integer.parseInt(mathVars[1]) == mathAns)
                    ans = true;
            }

        }
        return ans;
    }
    /*
        testIt("2 + 2 = 4", true);
        testIt("-2 - -2 = 0", true);
        testIt("6 * 4 = 24", true);
        testIt("18 / 17 = 2", false);
        testIt("16 * 10 = 160 = 14 + 120", false);

         */
    //6.10
    public static boolean palindromeDescendant(int a){
        boolean ans = false;
        int aLength = Integer.toString(a).length();
        String[] arrayOfNums = Integer.toString(a).split("");
        String workNum = Integer.toString(a);
        while ((aLength > 1) && (Integer.parseInt(workNum) != numReverse(Integer.parseInt(workNum)))) {
            workNum = "";
            for (int i = 0; i < arrayOfNums.length; i++) {
                if (i % 2 != 0)
                    workNum += Integer.parseInt(arrayOfNums[i-1]) + Integer.parseInt(arrayOfNums[i]);
            }
            aLength = workNum.length();
            arrayOfNums = workNum.split("");
        }
        if ((Integer.parseInt(workNum) == numReverse(Integer.parseInt(workNum))) && (aLength > 1))
            ans = true;
        return ans;
    }
    public static int numReverse(int a) {

        int reversed = 0;

        while(a != 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a /= 10;
        }

        return reversed;
    }
    /*
        testIt(11211230, true);
        testIt(13001120, true);
        testIt(23336014, true);
        testIt(11, true);
        testIt(5628, false);
        testIt(9009, true);

         */
    //Test unit
    public static void testIt(int a, boolean b){
        boolean testFunc = palindromeDescendant(a);
        String firstHalf = "(" + a + ") -> ";
        String secondHalf = "" + testFunc ;
        if (testFunc == b)
            System.out.println(firstHalf + ANSI_GREEN + secondHalf + ANSI_RESET);
        else
            System.out.println(firstHalf + ANSI_RED + secondHalf + " | \"" + b + "\"" + ANSI_RESET);
    }
}
