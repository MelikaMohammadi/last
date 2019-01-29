package last;

public class Sort {
    Array arr =new Array();
    public int[]sort(){
        synchronized (this){
        int i, j, minIndex, tmp;
        int n = arr.o.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arr.o[j] < arr.o[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                tmp = arr.o[i];
                arr.o[i] = arr.o[minIndex];
                arr.o[minIndex] = tmp;

}}
    return arr.o;}}
    public int[]sort1(){
        synchronized (this){
        int i, j, minIndex, tmp;
        int n = arr.t.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arr.t[j] < arr.t[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                tmp = arr.t[i];
                arr.t[i] = arr.t[minIndex];
                arr.t[minIndex] = tmp;

            }}
        return arr.t;}}
    public int[]sort2(){
        synchronized (this){
        int i, j, minIndex, tmp;
        int n = arr.th.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arr.th[j] < arr.th[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                tmp = arr.th[i];
                arr.th[i] = arr.th[minIndex];
                arr.th[minIndex] = tmp;

            }}
        return arr.th;}}
    public int[]sort3(){
        synchronized (this){
        int i, j, minIndex, tmp;
        int n = arr.f.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arr.f[j] < arr.f[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                tmp = arr.f[i];
                arr.f[i] = arr.f[minIndex];
                arr.f[minIndex] = tmp;

            }}
        return arr.f;
    }}
        public void Mainsort(){int j=0;
        {
            for (int i = 0; i <arr.o.length; i++) {
            arr.array[j]=arr.o[i];
                j++;
            }

            for (int i = 0; i <arr.t.length ; i++) {
                arr.array[j]=arr.t[i];
                j++;
            }

            for (int i = 0; i <arr.th.length ; i++) {
                arr.array[j]=arr.th[i];
                j++;
            }

            for (int i = 0; i <arr.f.length ; i++) {
                arr.array[j]=arr.f[i];
               j++;
            }
            for (int b:arr.array
                 ) {
                System.out.println(b);

            }} }
        }
