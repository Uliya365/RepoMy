package ru.geekbrains.lesson1;

public class Home {
    public  static void main(String[] args) {
        byte r=3;
        short s=300;
        int t=2760;
        long z=10000000000L;
        double v=2.34;
        float vv=8.76f;
        boolean h=false;
        char w='A';
        int a=4 ;int b = 5;int c=6; int d=1;
        int expressionResult= getExpressionResult(a,b,c,d);
        myNameIs("Barvara");
        int year=2060;
        printIsYearLeanOrNot( year);
        System.out.println(+expressionResult );
        System.out.println(isSum10Or20(a,b));
        System.out.println(isPositivOrNegativeNumber(a));
    }
     static int getExpressionResult(int a, int b, int c, int d) {
        return a *( b + (c / d));
    }
     static boolean isSum10Or20 (int a,int b){
        boolean res =  (a+b)>10&&(a+b)<20;
        return res;
    }
     static boolean isPositivOrNegativeNumber(int a) {
        if (a >= 0) {
           return true;
        }
        else {
            return false;
        }
    }
     static void myNameIs(String name){
        System.out.println("Привет"   + name   +'!');
    }
     static void printIsYearLeanOrNot (int year ) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "Год является  високосным");
        } else {
            System.out.println(year + "Год является не високосным");

        }
    }
}


