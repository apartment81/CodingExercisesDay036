package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        CoinSums coinSums = new CoinSums();

        int arr[] = {1, 2, 3};
        int m = arr.length;
        System.out.println(coinSums.count(arr, m, 4));

        int arr1[] = {2, 5, 3,6};
        int a = arr.length;
        System.out.println(coinSums.count(arr1, a, 12));


    }
}
