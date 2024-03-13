public class LoopComputations {

    public static void main(String[] args) {

        System.out.println("This program is for ACO101 Homework-03. Developed by: Jacob Edwards");




        int dividend = 9, rangeBegin = 1, rangeEnd = 100;

        System.out.print("a) Numbers divisible by 9 between 1 and 100: ");

        for (int num = rangeBegin; num <= rangeEnd; num++)
            if (num % dividend == 0)
                System.out.print(num + " ");




        int sum = 0, rangeBeginB = 10, rangeEndB = 20;

        System.out.println();

        System.out.print("b) Sum of odd numbers between 10 and 20: ");

        for (int num2 = rangeBeginB; num2 <= rangeEndB; num2++)
            if (num2 % 2 != 0)
                sum += num2;
        System.out.print(sum);




        System.out.println();

        System.out.print("c) Powers of 3 less than 100: ");

        int rangeBeginC = 1, rangeEndC = 100, power = 3;

        for (double num3 = rangeBeginC; num3 <= rangeEndC; num3++)
            if (num3 == Math.pow(power, 1) || num3 == Math.pow(power, 2) || num3 == Math.pow(power, 3) || num3 == Math.pow(power, 4))
                System.out.print(num3 + " ");




        System.out.println();

        System.out.println("Sum squares lower bound: 3");
        System.out.println("Sum squares upper bound: 5");

        System.out.print("d) The sum of squares between 3 and 5: ");

        int rangeBeginD = 3;
        int rangeEndD = 5;
        int sum2 = 0;

        for (int num4 = rangeBeginD; num4 <= rangeEndD; num4++)
            sum2 += (num4 * num4);

        System.out.print(sum2);




        System.out.println();

        int digits = 254876;

        System.out.println("e) Integer for sum of even digits: 254876");

        System.out.print("Sum of even digits for 254876 is ");

            int lastDigit;
            int evenDigitSum = 0;

            while (digits != 0) {

                lastDigit = digits % 10;

                if (lastDigit % 2 == 0)
                    evenDigitSum += lastDigit;

                digits = digits / 10;
            }

            System.out.print(evenDigitSum);
    }
}