public class MyArray {

    static int even(int[] array) {
        int count = 0;
        
        for(int i = 0; i < array.length; i++){
            if (i%2 == 0 && i != 0){
                count++;
            }
        }
        return count;
    }


    static int positiveOdd(int[] array){
        int count = 0;
        for (int i : array){
            if ( i%2 != 0 && i > 0 ){
                count ++;
            }
        }
            return count;
    }
        
    static void reverse(int[] array){
        int [] revArr = {};
        int j = 0;
        for (int i = 0; i < array.length; i++){
            revArr[j - 1] += array[i];
            j--;
        }
        System.out.println(revArr);

    }

    static boolean compare(int[] array1, int[] array2){
        int x = 0;
        for (int i = 0; i < array1.length; i++){
            if (array1[i] != array2[i] || array1.length != array2.length){
                x=0;
                break;
            } else{
                x=1;
            }  
        }
        if (x == 0){
            return false;
        } else {
            return true;
        }
    }

    static String different(int[] array1, int[] array2){
        String x = "";
        int y = 0;
        int [] sprawdz = {};
        for (int i1 : array1){
            for (int i2 : array2){
                if(i1 != i2 && y != i2){
                    x += i1 + " ";
                    y=i1;
                    break;
                } else{
                    y = i1;
                    break;
                
                } 
            }
        }  
        return x;
    }

    






    
}

