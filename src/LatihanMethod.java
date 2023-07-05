public class LatihanMethod {
    //method tipe 1
    public void HitungJumlah(){
        int i = 4;
        int j = 20;
        int hasil = i+j;
        System.out.println(hasil);
    }
    //method tipe 2
    public static void HitungKali(int a, int b){
        int hasil1 = a*b;
        System.out.println(hasil1);
    }
    public static void main(String[] args){

        HitungJumlah();

        int s = 20;
        int p = 50;
        HitungKali(s, p);//HitungKali(20,50)
    }
}
