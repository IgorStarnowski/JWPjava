package com.igor;

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
        return new FractionIS(this.num = fractionIS.num, this.den = fractionIS.den);
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
        FractionIS a = new FractionIS(5,15);
        System.out.println(a.mult(3));
        System.out.println(a);
    }
}
