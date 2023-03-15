/*
Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */
public class Main {
    public static void main(String[] args) {
        long numInit = 7893823445L;
        long numInter = numInit;
        long sum = 0;
        do {
            sum += (numInter % 10);
            numInter = numInter / 10;
        } while (numInter != 0);
        System.out.printf("Сумма цифр числа %d равна %d", numInit, sum);
    }
}