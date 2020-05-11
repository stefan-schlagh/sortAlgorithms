import javax.swing.*;

public class BubbleSort {
    public static void bubbleSort1(int[]a){
        boolean fertig;
        do {
            fertig = true;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i + 1]) {
                    int h = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = h;
                    fertig = false;
                }
            }
            /*je Durchlauf:
                    Vergleiche: N-1
                    Tauschen:   ?
               wieviele Durchläufe?
                    max. N
                    min. 1
             */
        }while(!fertig);
    }
    public static void bubbleSort2(int[]a){
        for(int j= a.length-1;j>=0;j--){
            boolean fertig=true;
            for(int i=0;i<j;i++){
                if (a[i] > a[i + 1]) {
                    int h = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = h;
                    fertig = false;
                }
            }
            if(fertig)return;
        }
    }
    public static void doublebubble(int[]a){
        int lowerLimit = 0;
        int upperLimit = a.length-2;
        for(int j=0;j<a.length;j++){
            boolean fertig = true;
            if(j%2==0) {
                int lastSwapRight= upperLimit;
                for (int i = lowerLimit; i < upperLimit+1; i++) {
                    if (a[i] > a[i + 1]) {
                        int h = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = h;
                        fertig = false;
                        lastSwapRight=i;
                    }
                }
                upperLimit = lastSwapRight;
            }else {
                int lastSwapLeft =lowerLimit;
                for(int i = upperLimit;i>=lowerLimit;i--){
                    if (a[i] > a[i + 1]) {
                        int h = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = h;
                        fertig = false;
                        lastSwapLeft=i;
                    }
                }
                lowerLimit = lastSwapLeft;
            }

            if(fertig)return;

        }
    }
}
