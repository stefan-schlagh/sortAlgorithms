public class SelectionSort {

    public static void selectionSort(int[]a){
        for(int i=0;i<a.length;i++){
            int minI=minSuche(a,i);
            int s=a[i];
            a[i]=a[minI];
            a[minI]=s;
        }

    }
    public static void selectionSortBack(int[]a){
        for(int i=a.length-1;i>=0;i--){
            int minI=minSuche2(a,i);
            int s=a[i];
            a[i]=a[minI];
            a[minI]=s;
        }
    }
    public static int minSuche2(int[]a,int bis){
        int min=0;
        for(int i=0;i<bis;i++){
            if(a[i]<a[min])
                min=i;
        }
        return min;
    }
    public static int minSuche(int[]a,int ab){
        int min=ab;
        for(int i=ab;i<a.length;i++){
            if(a[i]<a[min])
                min=i;
        }
        return min;
    }
}
