import java.util.*;
public class LinearSearch {
    public static int linear(int []arr , int target){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,2,34,4};
        System.out.println(linear(arr,2));
    }
}
