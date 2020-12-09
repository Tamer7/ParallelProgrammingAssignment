import java.awt.*;
import java.awt.image.BufferedImage;

public class BubbleSort extends Thread {

    // We initialize a low and high parameter to divide the array into sections
    int nLow = 0;
    int nHigh = 0;
    private int[] arr;


    public BubbleSort() {
        this.arr = new int[100000];
    }

    public BubbleSort(int[] arr) {
        this.arr = arr;

    }

    // This constructor takes a low, high and array arguments once the class is created
    public BubbleSort(int nLowParam, int nHighParam, int[] arr) {
        nLow = nLowParam;
        nHigh = nHighParam;
        main(this.arr = arr);
    }


    // This main function implements the bubble sort algorithm
    public void main(int [] arr) {
        int n = arr.length;
        for (int i = nLow; i < nHigh - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
