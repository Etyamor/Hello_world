/**
 * Created by tmp on 29.12.2016.
 */
public class HelloClass {
    public static void main(String[] args) {
        System.out.print("Hello WORLD!");
        //first project on GIT
    }
}

 class BubbleSort{
     public static void main(String[] args) {
         int n = 5;
         int[] a = new int[5];
         a[0]=5;a[1]=10122;a[2]=-42;a[3]=4;a[4]=2;
         for (int i = 0; i < n; i++)
             for (int j = 0; j < n - 1; j++)
                 if (a[j] > a[j + 1]) {
                    int sw = a[j];
                    a[j]=a[j+1];
                    a[j+1]=sw;
                 };
         for (int i = 0; i < n; i++)
             System.out.println(a[i]);
     }
 }
