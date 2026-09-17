class Solution {

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {

            int mainDiag = nums[i][i];
            int antiDiag = nums[i][n - 1 - i];

            if (isPrime(mainDiag)) {
                maxPrime = Math.max(maxPrime, mainDiag);
            }

            if (isPrime(antiDiag)) {
                maxPrime = Math.max(maxPrime, antiDiag);
            }
        }

        return maxPrime;
    }
}