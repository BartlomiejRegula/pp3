public class MyArrayTest {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,-1,-2,-3,-4,-5};
        int [] array2 = {1,2,3,4,5,6,7,8};
        String x = ("abcdefg");
        System.out.println(MyArray.even(array));
        System.out.println(MyArray.positiveOdd(array));
        System.out.println(MyArray.compare(array, array2));
        System.out.println(MyArray.different(array, array2));
    }
}
