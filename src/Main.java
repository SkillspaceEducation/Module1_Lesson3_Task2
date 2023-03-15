/*
Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */
public class Main {
    public static void main(String[] args) {
        final long NUM = 7893823445L;
        long numInter = NUM;
        long sum = 0;
        do {
            sum += (numInter % 10);
            numInter = numInter / 10;
        } while (numInter != 0);
        System.out.printf("Сумма цифр числа %d равна %d", NUM, sum);
    }
}