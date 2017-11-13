package SockesDemo.ThreadDemo;

import java.util.ArrayList;

/**
 * Created by Stelawliet on 17/10/3.
 */
public class ArryListSort {
    private int number = 0;
    private Object lock;


    public ArryListSort(int number, Object lock) {
        this.number = number;
        this.lock = lock;
    }

    public static void main(String[] args) throws InterruptedException {
        ArryListSort WaitObj = new ArryListSort(0, new Object());

        int RanSize = (int) (Math.random() * 100) + 1;


        ArrayList<Integer> arrayList0 = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for (int i = 0; i < RanSize; i++) {
            int R = (int) (Math.random()*10)+1;
            arrayList0.add(R);
        }

        for (Integer i : arrayList0) {
            arrayList1.add(i);
        }
        System.out.println("arrayList0:" + "size:" + arrayList0.size());
        for (Integer i : arrayList0
                ) {
            System.out.print(i + "   ");

        }
        System.out.println();
        System.out.println("------------");
        System.out.println("arrayList1:");

        for (Integer i : arrayList1
                ) {
            System.out.print(i + "   ");

        }
        System.out.println();

        new Thread(new Runnable() {
            @Override
            public void run() {
                MaoSort(arrayList1, WaitObj);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SelectSort(arrayList0, WaitObj);
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (WaitObj.lock) {


                    if (WaitObj.number!=2) {
                        try {
                            System.out.println("Wait Start");
                            WaitObj.lock.wait();
                            System.out.println("Wait end");

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("\r\n------------");
                    System.out.println("MaoSort:");

                    for (Integer i : arrayList1) {
                        System.out.print(i + "   ");
                    }

                    System.out.println("\r\n------------");
                    System.out.println("SelectSort:");

                    for (Integer i : arrayList0) {
                        System.out.print(i + "   ");
                    }


                }


            }
        }).start();


    }

    public static void SelectSort(ArrayList<Integer> arrayList, ArryListSort WaitObj) {
        int s = arrayList.size();
        //max i =s-1  ; i < s
        ArrayList<Integer> arrayList0 = arrayList;
        long start = System.currentTimeMillis();
        for (int i = 0; i < s - 1; i++) {//count sise-1 ;
            for (int j = i + 1; j < arrayList0.size(); j++) {
                if (arrayList0.get(i) > arrayList0.get(j)) {

                    int temp0 = arrayList0.get(j);
                    arrayList0.set(j, arrayList0.get(i));
                    arrayList0.set(i, temp0);

                }
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("SelectSort use " + (end - start) + "Millis--" + WaitObj.number);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (WaitObj.lock) {

            System.out.println("");
            WaitObj.number = WaitObj.number + 1;
            if (WaitObj.number == 2)
                WaitObj.lock.notify();
            System.out.println("WaitObj. number="+WaitObj.number);
        }

    }

    public static void MaoSort(ArrayList<Integer> arrayList, ArryListSort WaitObj) {
        ArrayList<Integer> arrayList1 = arrayList;
        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList1.size() - 1; i++) {
            for (int j = 0; j < arrayList1.size() - i - 1; j++) {
                if (arrayList1.get(j) > arrayList1.get(j + 1)) {

                    int temp = arrayList1.get(j + 1);
                    arrayList1.set(j + 1, arrayList1.get(j));
                    arrayList1.set(j, temp);

                }
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("MaoSort use " + (end - start) + "Millis--");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (WaitObj.lock) {
            WaitObj.number= WaitObj.number+1;
            if (WaitObj.number==2)
            WaitObj.lock.notify();
            System.out.println("WaitObj.number="+WaitObj.number);

        }

    }
}
