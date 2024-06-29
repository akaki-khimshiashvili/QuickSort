
public class Main {
    public static void main(String[] args) {
        int arr[] = {12, 3, 1, 9, 11};
        int size = arr.length;

        quickSort(arr, 0, size-1);

        System.out.println();
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j= low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


}