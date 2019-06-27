package ro.mirodone;

public class CoinSums {

    //recursive java code for coin change


    // Returns the count of ways we ca sum S[0...m-1] coins to get sum n

    int count ( int sum[], int m, int n){

        // If n is 0 then there is 1 solution (do not include any coin)

        if( n == 0)
            return 1;

        // If n is less than 0 then no solution exists

        if ( n < 0 )
            return 0;

        // If there are no coins and is greater than 0, then no solution exist
        if( m <=0 && n >=1)
            return 0;

        // count is sum of solutions (*) including S[m-1] (**) excluding S[m-1]
        return count(sum, m-1, n) + count(sum, m, n-sum[m-1]);

    }


}
