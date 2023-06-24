public class Method {
    public static void printNumber(int batasawal, int batasakhir) {
        for (int index = batasawal; index <= batasakhir; index++) {
            System.out.println(index);
        }
    }
        public static void main(String[] args){
            printNumber(2, 1000);
        }
    }
