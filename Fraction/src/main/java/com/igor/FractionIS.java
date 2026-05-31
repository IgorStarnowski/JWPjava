package com.igor;

import java.util.Scanner;

public class FractionIS {
    private int num;
    private int den;

    public FractionIS() {
        this(0,1);
    }

    public FractionIS(int num) {
        this(num, 1);
    }

    public FractionIS(FractionIS fractionIS){
        this(fractionIS.num, fractionIS.den);
    }

    public FractionIS(int num, int den) {
        if(den==0) throw new IllegalArgumentException("parametr n = 0!");
        this.num = num;
        this.den = den;
        correction();
        //reduce();
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        if(den <= 0) throw new IllegalArgumentException("parametr n = 0!");
        this.den = den;
    }

    public void setFrac(int num, int den){
        setDen(den);
        setNum(num);
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    private void correction(){
        if(den < 0) {num = -num; den = -den;}
    }

    private static int nwd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return  a;
    }

    public void reduce(){
        int nwd = nwd(num, den);
        num /= nwd;
        den /= nwd;
    }

    public void equivalent(int n){
        num *=n;
        den *= n;
    }

    public void reduce(int d){
        if(den <= 0) throw new IllegalArgumentException("parametr d = 0!");
        num /= d;
        den /= d;
    }

    public FractionIS mult (FractionIS fractionIS){
        return new FractionIS(this.num * fractionIS.num, this.den * fractionIS.den);
    }

    public FractionIS mult(int n){
        return new FractionIS(this.num * n, this.den);
    }
    public static FractionIS product(FractionIS fractionIS, FractionIS fractionIS1){
        return new FractionIS(fractionIS.num * fractionIS1.num, fractionIS.den * fractionIS1.den);
    }
    public static FractionIS product(FractionIS fractionIS, int n){
        return new FractionIS(fractionIS.num * n, fractionIS.den);
    }
    public static FractionIS product(int n, FractionIS fractionIS){
        return new FractionIS(fractionIS.num * n, fractionIS.den);
    }
    public static FractionIS product(int a, int b){
        return new FractionIS(a).mult(b)    ;
    }
    @Override
    public String toString() {
        return num + "/" + den;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionIS fractionIS = (FractionIS) o;
        FractionIS copyThis = new FractionIS(this);
        FractionIS copyOther = new FractionIS(fractionIS);
        copyThis.reduce();
        copyOther.reduce();
        return copyThis.num == copyOther.num && copyThis.den == copyOther.den;
    }
    @Override
    public int hashCode() {
        FractionIS copyThis = new FractionIS(this);
        copyThis.reduce();
        return copyThis.num * copyThis.den;
    }
    public double doubleValue(){
        return (double) num / den;
    }
    public float floatValue(){
        return (float) num / den;
    }
    public static double toDouble(FractionIS fractionIS) {
        return fractionIS.doubleValue();
    }
    public  static float toFloat(FractionIS fractionIS) {
        return fractionIS.floatValue();
    }
    public FractionIS(String str){
        if(str.contains("/")){
            int index = str.indexOf("/");
            this.num = Integer.parseInt(str.substring(0, index));
            this.den = Integer.parseInt(str.substring(index + 1));
        } else if (str.contains(".") || str.contains(",")) {
            str = str.replace(",", ".");
            int dotIndex = str.indexOf(".");
            int decimalPlaces = str.length() - dotIndex - 1;
            String numberStr = str.replace(".", "");
            this.num = Integer.parseInt(numberStr);
            this.den = (int) Math.pow(10, decimalPlaces);
        }else {
            this.num = Integer.parseInt(str);
            this.den = 1;
        }
        if (this.den == 0) throw new IllegalArgumentException("parametr n = 0!");
        correction();
        reduce();
    }
    public static FractionIS valueOf(float f){
        return new FractionIS(""+f);
    }
    public static FractionIS valueOf(double d){
        return new FractionIS(""+d);
    }
    public static FractionIS valueOf(String s){
        return new FractionIS(s);
    }
    public static FractionIS valueOf(int n){
        return new FractionIS(n);
    }
    public static FractionIS valueOf(int num, int den){
        return new FractionIS(num, den);
    }

    public static void main(String[] args) {
//        FractionIS ulamek = new FractionIS(3, 5);
//        System.out.println(ulamek);
//        ulamek.setNum(1);
//        System.out.println(ulamek);
//        ulamek.setDen(6);
//        System.out.println(ulamek);
//        ulamek.setFrac( 4, 9);
//        System.out.println(ulamek);
//        FractionIS u = new FractionIS();
//        System.out.println(u);
//        FractionIS u1 = new FractionIS(3);
//        System.out.println(u1);
//        FractionIS a = new FractionIS(-5,-15);
//        System.out.println(a);
//        FractionIS b = new FractionIS(a);
//        FractionIS c = a;
//        a.equivalent(3);
//        System.out.println(a);
//        a.reduce(3);
//        System.out.println(a);
//        System.out.println(a == b);
//        System.out.println(b == c);
//        System.out.println(a == c);
//        FractionIS a = new FractionIS(5,15);
//        System.out.println(a.mult(3));
//        System.out.println(a);
            System.out.println("--- Test zadania 8 (equals) ---");
            FractionIS eq1 = new FractionIS(12, 27);
            FractionIS eq2 = new FractionIS(20, 45);
            System.out.println("Czy 12/27 equals 20/45? " + eq1.equals(eq2));
            System.out.println("\n--- Test zadania 9 (dziesiętne) ---");
            FractionIS dec = new FractionIS(3, 4);
            System.out.println("3/4 jako double: " + dec.doubleValue());
            System.out.println("3/4 statycznie: " + FractionIS.toDouble(dec));

            System.out.println("\n--- Test zadania 10 i 11 (String, valueOf) ---");
            System.out.println(FractionIS.valueOf("4/7"));
            System.out.println(FractionIS.valueOf(5));
            System.out.println(FractionIS.valueOf("2.45"));
            System.out.println(FractionIS.valueOf("2,45"));
            System.out.println(FractionIS.valueOf(3.14));

            System.out.println("\n--- Test zadania 12 (Scanner) ---");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj ułamek (np. 2,4115, -852.45, -5 lub 2/3): ");
            String input = scanner.next();

            try {
                FractionIS fromConsole = FractionIS.valueOf(input);
                System.out.println("Utworzono ułamek: " + fromConsole);
                System.out.println("Jego wartość dziesiętna to: " + fromConsole.doubleValue());
            } catch (Exception e) {
                System.out.println("Błąd: Nieprawidłowy format ułamka!");
            }

            scanner.close();
        }
    }
