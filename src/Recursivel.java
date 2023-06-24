public class Recursivel {
    public static void PrintNumber(int number) {
        if (number < 9900) {
            number++;//number=number +1
            System.out.println(number);
            PrintNumber(number);
        }
    }
        public static void main(String[] args){
            PrintNumber(1);
        }
    }
