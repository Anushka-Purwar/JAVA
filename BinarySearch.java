public class BinarySearch {
    public static void binary_recursive(int[] arr,int low, int high){
        if(low>high){
            return;
        }
        int key=6;
        int mid=(low+high)/2;
        if(key==arr[mid]) System.out.println(mid);
        else if(key<arr[mid])
            binary_recursive(arr,low,mid-1);
        else if(key>arr[mid]) binary_recursive(arr,mid+1,high);
    }
    public static int binary_iterative(int[] arr, int low, int high) {
        int key = 6;
        while(low<=high){
            int mid = (low + high) / 2;
            if (key == arr[mid]) return mid;
            else if (arr[mid]<key) low = mid + 1;
            else if(arr[mid]>key) high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int low = 0;
        int high = arr.length - 1;
        System.out.println(binary_iterative(arr, low, high));
        binary_recursive(arr,0,high);
    }
}
