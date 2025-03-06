public class Main{
    public static void main(String[] args){
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int result = binarySearch(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Target found at index: " + result);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        
    }
}