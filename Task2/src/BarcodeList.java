import java.lang.Runnable;
import java.util.Iterator;
import java.util.List;

public class BarcodeList implements Runnable{

    // declaring attributes

    private List<Type> items;
    int[] barcode1;
    int[] barcode7;
    int[] barcode10;


    // BarcodeList constructor with item parameter
    public BarcodeList(List<Type> items) {
        this.items = items;
        this.barcode1 = new int[3];
        this.barcode7 = new int[5];
        this.barcode10 = new int[8];
        getTypes();
    }


    private void getTypes() {

        // This function iterates through the items, and selects values for of 3,5 and 8.

        Iterator<Type> i = this.items.iterator();
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        while (i.hasNext()) {
            Type item = i.next();
            if (item.getType() == 1 && counter1 < 3) {
                this.barcode1[counter1] = item.getBarcodes();
                counter1++;
            } else if (item.getType() == 7 && counter2 < 5) {
                this.barcode7[counter2] = item.getBarcodes();
                counter2++;
            } else if (item.getType() == 10 && counter3 < 8) {
                this.barcode10[counter3] = item.getBarcodes();
                counter3++;
            }
            if ((counter3 > 8 && counter1 > 3 && counter2 < 5)) {
                break;
            }

        }
    }


    // This function prints the types of barcodes generated
    public void printTypes() {
        System.out.println("Barcodes of Type 1 : ");
        displayResults(this.barcode1);
        System.out.println("Barcodes of Type 7 : ");
        displayResults(this.barcode7);
        System.out.println("Barcodes of Type 10 : ");
        displayResults(this.barcode10);

    }

    // This function displays the results of the selection
    private void displayResults(int[] a) {
        for (int count = 0; count < a.length; count++) {
            System.out.println("The Barcode of the " + (count + 1) + " item = " + a[count]);
        }
    }


    @Override
    public void run() {

    }
}
