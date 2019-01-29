package last;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        System.out.println("طول آرایه ی مورد نظر را وارد کنید");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
Array array = new Array();
switch (num%4){
    case 0:array.partition1(num);
    break;
    case 1:array.partition2(num);
        break;
    case 2:array.partition3(num);
        break;
    case 3:array.partition4(num);
}

Sort sort = new Sort();
Thread thread1 = new Thread(new Runnable() {
    @Override
    public void run() {
        sort.sort();
    }
});
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sort.sort1();
            }
        });Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                sort.sort2();
            }
        });Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                sort.sort3();
            }
        });
Thread thread = new Thread(new Runnable() {
    @Override
    public void run() {
        sort.Mainsort();
    }
});
thread1.start();
thread2.start();
thread3.start();
thread4.start();



thread.start();




    }
}
