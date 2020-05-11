public class InsertionSort{

    public static void insertionSort(int[] a) {
        for(int i=1;i<a.length;i++) {
            int v=a[i];
            int j=i-1;
            while((j>=0)&&(a[j]>v)) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=v;
        }
    }
}
