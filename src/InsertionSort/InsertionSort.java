package InsertionSort;

public class InsertionSort {
    private int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    public void InsertionSort() {
        int size = this.data.length;

        for (int step = 1; step < size; step++) {
            int key = this.data[step];// this.data[1] - >pertama kali program dijalankan
            int j = step - 1;

            //Compare key with each elemen on the left of it until an elemen smaller than
            // it is found.
            // For descending order. change key<array[j] to key>array[j].
            while (j >= 0 && key < this.data[j]) {
                this.data[j + 1] = this.data[j];
                --j;
            }
            // Place key at after the elemen just smaller than it.
            this.data[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] age={12, 7, 2, 1, 0, 67, 78, 95};
        // 1. 7,12,2,....
        // 2. 7,2,12,....-> 2,7,12,1,0,67,78....
        // 3. 2,7,1,12,0,67....->2,1,7,12,0,....->1,2,7,12,0....

        //TODO : Lengkapi coding agar bisa berjalan sebagaimana mestinya
        InsertionSort p = new InsertionSort();
        p.setData(age);
        // for(int[] s : data){
        //  System.out.println();

        //}
    }
}