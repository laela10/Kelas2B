public class Fibonacci {
        public static void main(String[] args) {
            int limit = 4500;

            System.out.println("Deret bilangan Fibonacci genap:");
            int sum = 0;
            int count = 0;
            int a = 0;
            int b = 1;
            int c = a + b;
            while (c <= limit) {
                if (c % 2 == 0) {
                    System.out.print(c + " ");
                    sum += c;
                    count++;
                }
                a = b;
                b = c;
                c = a + b;
            }
            System.out.println("\nTotal bilangan dalam deret: " + count);
            System.out.println("Jumlah bilangan Fibonacci genap: " + sum);
        }
    }
