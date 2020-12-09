public class Main {

    // This function runs the bubble sort algorithm in 2 threads

    public static void parallelCalcTwoThreads(){

        // declaring the array with value of 100,000 values.
        int[] array = new int[100000];

        // declaring threads out of the BubbleSort class and passing a high and low value parameter
        // for splitting the work among the threads
        // This contains two threads with the number values and the array declared above

        BubbleSort t1 = new BubbleSort(0, 50000, array);
        BubbleSort t2 = new BubbleSort(50000, 100000,array);

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

    }

    // This function runs the bubble sort algorithm in 3 threads

    public static void parallelCalcThreeThreads(){


        // declaring the array with value of 100,000 values.
        int[] array = new int[100000];


        // declaring threads out of the BubbleSort class and passing a high and low value parameter
        // for splitting the work among the threads
        // This contains three threads with the number values and the array declared above

        BubbleSort t1 = new BubbleSort(0, 30000,array);
        BubbleSort t2 = new BubbleSort(30000, 60000,array);
        BubbleSort t3 = new BubbleSort(60000, 100000,array);


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

    }


    // This function runs the bubble sort algorithm in 4 threads

    public static void parallelCalcFourThreads(){

        // declaring the array with value of 100,000 values.
        int[] array = new int[100000];


        // declaring threads out of the BubbleSort class and passing a high and low value parameter
        // for splitting the work among the threads
        // This contains four threads with the number values and the array declared above

        BubbleSort t1 = new BubbleSort(0, 20000,array);
        BubbleSort t2 = new BubbleSort(20000, 40000,array);
        BubbleSort t3 = new BubbleSort(40000, 80000,array);
        BubbleSort t4 = new BubbleSort(80000, 100000,array);


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

    }



    // This function runs the bubble sort algorithm in 6 threads

    public static void parallelCalcSixThreads(){


        // declaring the array with value of 100,000 values.

        int[] array = new int[100000];



        // declaring threads out of the BubbleSort class and passing a high and low value parameter
        // for splitting the work among the threads
        // This contains four threads with the number values and the array declared above

        BubbleSort t1 = new BubbleSort(0, 10000,array);
        BubbleSort t2 = new BubbleSort(10000, 20000,array);
        BubbleSort t3 = new BubbleSort(20000, 30000,array);
        BubbleSort t4 = new BubbleSort(30000, 40000,array);
        BubbleSort t5 = new BubbleSort(40000, 50000,array);
        BubbleSort t6 = new BubbleSort(50000, 100000,array);


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

    }



    public static void main(String[] args) {
        // Calculating Time for 2 Threads
        long tBefore2 = System.currentTimeMillis();
        parallelCalcTwoThreads();
        long tAfter2 = System.currentTimeMillis();
        System.out.println("Duration For 2 Threads : " + (tAfter2 - tBefore2));

        // Calculating Time for 3 Threads
        long tBefore3 = System.currentTimeMillis();
        parallelCalcThreeThreads();
        long tAfter3 = System.currentTimeMillis();
        System.out.println("Duration For 3 Threads: " + (tAfter3 - tBefore3));

        // Calculating Time for 4 Threads
        long tBefore4 = System.currentTimeMillis();
        parallelCalcFourThreads();
        long tAfter4 = System.currentTimeMillis();
        System.out.println("Duration For 4 Threads: " + (tAfter4 - tBefore4));

        // Calculating Time for 6 Threads
        long tBefore6 = System.currentTimeMillis();
        parallelCalcSixThreads();
        long tAfter6 = System.currentTimeMillis();
        System.out.println("Duration For 6 Threads: " + (tAfter6 - tBefore6));
    }
}
