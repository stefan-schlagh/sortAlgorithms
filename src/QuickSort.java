public class QuickSort {

    public static void quicksort (int[]a,int links,int rechts){
        int v;//Trennelement
        int k;//endgültiger Index des Trennelements nach dem Partitionieren
        if (rechts > links) {

            v=a[rechts];
            k=partition(a,links,rechts,v);
            quicksort(a,links,k-1);
            quicksort(a,k+1,rechts);
        }
    }
    public static int partition(int[]a,int links,int rechts,int v){
        int i,j;//Laufindizies
        int t;//Hilfselement zum tauschen

        i=links-1;
        j=rechts;

        do{
            do{
                i++;
            }while ((a[i]<v)&&(j>i));
            do{
                j--;
            }while((a[j]>v)&& (j>i));

            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }while(j>i);
        /*
            stellt Werte von a[j] (wurde einmal zu oft getauscht)
            und a [i] (erhält das Trennelement und
            a[rechts] (dorthin kommt das übriggebliebene Element) richtig
         */
        a[j]=a[i];
        a[i]=a[rechts];
        a[rechts]=t;

        return i;
    }
}
