package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatest = (((first>second)? first:second)>third) ? ((first>second)? first:second) : third;
        System.out.println(greatest);
    }
}
