package last;

import java.util.Random;

public class Array {
static  int []o;
static  int []t;
static int []th;
static int[]f;
static int[]array;
    Random random = new Random();
    public void partition1(int n){
        array=new int[n];
        o = new int[n/4];
        t = new int[n/4];
        th=new  int[n/4];
        f=new int[n/4];
        int m= n/4;
        for (int i = 0; i <m ; i++) {
            o[i]=random.nextInt(250);
            t[i]=random.nextInt((500-250)+1)+250;
            th[i]=random.nextInt((750-500)+1)+500;
        }  for (int i = 0; i <f.length ; i++) {
            f[i] = random.nextInt((1000 - 750) + 1) + 750;
        }
        int j=0;
        for (int i = 0; i <o.length ; i++) {
            array[j]=o[i];
            j++;
        }

        for (int i = 0; i <t.length ; i++) {
            array[j]=t[i];
            j++;
        }

        for (int i = 0; i <th.length ; i++) {
            array[j]=th[i];
            j++;
        }
        for (int i = 0; i <f.length ; i++) {
            array[j]=f[i];
            j++;
        }
        for (int b:array) {
            System.out.println(b);
        }

    } public void partition2(int n){
        array=new int[n];
        o = new int[n/4];
        t = new int[n/4];
        th=new  int[n/4];
        f=new int[n/4+1];
        int m= n/4;
        for (int i = 0; i <m ; i++) {
            o[i]=random.nextInt(250);
            t[i]=random.nextInt((500-250)+1)+250;
            th[i]=random.nextInt((750-500)+1)+500;
        }  for (int i = 0; i <f.length ; i++) {
            f[i] = random.nextInt((1000 - 750) + 1) + 750;
        }
        int j=0;
        for (int i = 0; i <o.length ; i++) {
            array[j]=o[i];
            j++;
        }

        for (int i = 0; i <t.length ; i++) {
            array[j]=t[i];
            j++;
        }

        for (int i = 0; i <th.length ; i++) {
            array[j]=th[i];
            j++;
        }
        for (int i = 0; i <f.length ; i++) {
            array[j]=f[i];
            j++;
        }
        for (int b:array) {
            System.out.println(b);
        }
    } public void partition3(int n){
        array=new int[n];
        o = new int[n/4];
        t = new int[n/4];
        th=new  int[n/4];
        f=new int[n/4+2];
        int m= n/4;
        for (int i = 0; i <m ; i++) {
            o[i]=random.nextInt(250);
            t[i]=random.nextInt((500-250)+1)+250;
            th[i]=random.nextInt((750-500)+1)+500;
        }  for (int i = 0; i <f.length ; i++) {
            f[i] = random.nextInt((1000 - 750) + 1) + 750;
        }
        int j=0;
        for (int i = 0; i <o.length ; i++) {
            array[j]=o[i];
            j++;
        }

        for (int i = 0; i <t.length ; i++) {
            array[j]=t[i];
            j++;
        }

        for (int i = 0; i <th.length ; i++) {
            array[j]=th[i];
            j++;
        }
        for (int i = 0; i <f.length ; i++) {
            array[j]=f[i];
            j++;
        }
        for (int b:array) {
            System.out.println(b);
        }
    } public void partition4(int n){
         array=new int[n];
        o = new int[n/4];
        t = new int[n/4];
        th=new  int[n/4];
        f=new int[n/4+3];
        int m= n/4;
        for (int i = 0; i <m ; i++) {
            o[i]=random.nextInt(250);
            t[i]=random.nextInt((500-250)+1)+250;
            th[i]=random.nextInt((750-500)+1)+500;
        }  for (int i = 0; i <f.length ; i++) {
            f[i] = random.nextInt((1000 - 750) + 1) + 750;
        }
        int j=0;
        for (int i = 0; i <o.length ; i++) {
            array[j]=o[i];
            j++;
        }

        for (int i = 0; i <t.length ; i++) {
            array[j]=t[i];
            j++;
        }

        for (int i = 0; i <th.length ; i++) {
            array[j]=th[i];
            j++;
        }
        for (int i = 0; i <f.length ; i++) {
            array[j]=f[i];
            j++;
        }
        for (int b:array) {
            System.out.println(b);
        }            System.out.println("/////////////");

    }
}
