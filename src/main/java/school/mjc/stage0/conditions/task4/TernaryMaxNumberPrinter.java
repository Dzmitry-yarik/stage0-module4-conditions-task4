package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
           int a = first > second ? first: second;
        a = a > third ? a: third;
        if (a == first)
        System.out.println( "first. Greatest from 3");
        else if (a == second) {
            System.out.println( "second. Greatest from 3");
        } else System.out.println( "third. Greatest from 3");
    }
}
