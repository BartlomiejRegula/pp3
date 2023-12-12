public class Arrays {

    public static boolean arr(int[] arr1, int[] arr2){
        int x = 0;
        for (int i : arr1){
            if ( i >= 10 && i <=99){
                x++;
            }
        }        
        int y = 0;
        for (int j : arr2){
            if ( j >= 10 && j <=99){
                y++;
            }
        } 
        
        
        return (x == y);
    }







    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,17};
        int[] arr2 = {9,6,7,12,48,4,6,90,95};

        System.out.println(arr(arr1, arr2));
    }
}
