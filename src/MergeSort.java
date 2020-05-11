public class MergeSort {

    private static void mergeSort(int[]a, int links, int rechts, int[]hilfe){ //Man sortiert zuerst die Linke, dann die rechte Hälfte
        if(links<rechts){
            int mitte=(links+rechts)/2;
            mergeSort(a, links, mitte, hilfe); //links, mitte+1 sind die Startwerte, wo zu sortieren begonnen wird, mitte und rechts sind die Endpunkte, bis wohin sortiert wird
            mergeSort(a, mitte+1, rechts, hilfe);
            merge(a, links, mitte, rechts, hilfe); //Zusammenmixxen
        }
    }

    public static void mergeSort(int[]a) { //Macht man, damit benutzer nicht so viele Parameter (Oben) eingeben muss --> Dafür ist die obige private
        int[] hilfe = new int[a.length];
        mergeSort(a, 0, a.length - 1, hilfe);
    }

    private static void merge(int[]a, int links, int mitte, int rechts, int [] hilfe){
        int i = links;
        int j = mitte+1;
        int k = links;
        do{
            if(a[i]<a[j]){
                hilfe[k]=a[i];
                i++;
            }else{
                hilfe[k]=a[j];
                j++;
            }
            k++;
        }while(i<=mitte && j<=rechts);

        //Reste umkopieren
        if(i<=mitte){
            for(int l = i; l<=mitte; l++){
                hilfe[k]=a[l];
                k++;
            }
        }else{
            for(int l=j; j<=rechts; j++){
                hilfe[k]=a[l];
                k++;
            }
        }

        //Rücktauschen
        for(int l=links;l<=rechts;l++){
            a[l]=hilfe[l];
        }
    }
}
