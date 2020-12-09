import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    // This function selects barcodes with 2 threads

    public static void twoThreads(){

        List<Type> barcode = new ArrayList<>();
        generateItems(barcode);

        // BarcodeList class is initialized and barcode list is passed to it.
        // Two threads are declared and passed to the item

        BarcodeList item = new BarcodeList(barcode);
        Thread t1 = new Thread(item);
        Thread t2 = new Thread(item);

        t1.start();
        t2.start();

        // Checking if the threads are still running

        while (t1.isAlive() || t2.isAlive())
        {

            try {
                Thread.sleep(4);
            }
            catch (InterruptedException ex) { };
        }

        System.out.println("Barcodes of 2 Threads are : ");
        item.printTypes();

    }



    // This function selects barcodes with 3 threads

    public static void threeThreads(){
        List<Type> barcode = new ArrayList<>();
        generateItems(barcode);


        // BarcodeList class is initialized and barcode list is passed to it.
        // Three threads are declared and passed to the item

        BarcodeList item = new BarcodeList(barcode);
        Thread t1 = new Thread(item);
        Thread t2 = new Thread(item);
        Thread t3 = new Thread(item);

        t1.start();
        t2.start();
        t3.start();


        // Checking if the threads are still running

        while (t1.isAlive() || t2.isAlive() || t3.isAlive())
        {

            try {
                Thread.sleep(4);
            }
            catch (InterruptedException ex) { };
        }

        System.out.println("\n\nBarcodes of 3 Threads are : ");
        item.printTypes();

    }



    // This function selects barcodes with 4 threads

    public static void fourThreads(){

        List<Type> barcode = new ArrayList<>();
        generateItems(barcode);


        // BarcodeList class is initialized and barcode list is passed to it.
        // Four threads are declared and passed to the item

        BarcodeList item = new BarcodeList(barcode);
        Thread t1 = new Thread(item);
        Thread t2 = new Thread(item);
        Thread t3 = new Thread(item);
        Thread t4 = new Thread(item);


        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Checking if the threads are still running


        while (t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive())
        {

            try {
                Thread.sleep(4);
            }
            catch (InterruptedException ex) { };
        }

        System.out.println("\n\nBarcodes of 4 Threads are : ");
        item.printTypes();

    }


    // This function selects barcodes with 6 threads

    public static void sixThreads(){
        List<Type> barcode = new ArrayList<>();
        generateItems(barcode);


        // BarcodeList class is initialized and barcode list is passed to it.
        // Six threads are declared and passed to the item

        BarcodeList item = new BarcodeList(barcode);
        Thread t1 = new Thread(item);
        Thread t2 = new Thread(item);
        Thread t3 = new Thread(item);
        Thread t4 = new Thread(item);
        Thread t5 = new Thread(item);
        Thread t6 = new Thread(item);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        // Checking if the threads are still running

        while (t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive() || t5.isAlive() || t6.isAlive())
        {

            try {
                Thread.sleep(4);
            }
            catch (InterruptedException ex) { };
        }


        System.out.println("\n\nBarcodes of 6 Threads are : ");
        item.printTypes();

    }




    public static void main(String args[]) {

        // This block of code compares the time taken for 2, 3, 4 and 6 Threads respectively

        // 2 thread time execution
        long tBefore2 = System.currentTimeMillis();
        twoThreads();
        long tAfter2 = System.currentTimeMillis();
        System.out.println("Duration For 2 Threads : " + (tAfter2 - tBefore2) + " Milliseconds");

        // 3 thread time execution
        long tBefore3 = System.currentTimeMillis();
        threeThreads();
        long tAfter3 = System.currentTimeMillis();
        System.out.println("Duration For 3 Threads : " + (tAfter3 - tBefore3) + " Milliseconds");

        // 4 thread time execution
        long tBefore4 = System.currentTimeMillis();
        fourThreads();
        long tAfter4 = System.currentTimeMillis();
        System.out.println("Duration For 4 Threads : " + (tAfter4 - tBefore4) + " Milliseconds");

        // 6 thread time execution
        long tBefore5 = System.currentTimeMillis();
        sixThreads();
        long tAfter5 = System.currentTimeMillis();
        System.out.println("Duration For 6 Threads : " + (tAfter5 - tBefore5) + " Milliseconds");

    }


    // This function generates Items of the class "Type"
    public static void generateItems(List<Type> items) {
        int counter = 100000;
        Random rand = new Random();
        while (counter >= 1) {
            Type item = new Type();
            int barcode = rand.nextInt(100000);
            item.setBarcodes(barcode);
            int number = rand.nextInt(100) + 1;
            item.setType(number);
            items.add(item);
            counter--;
        }
    }
}
