public class L_3079 {
    public int sumOfEncryptedInt(int[] nums) {
        int totalSum = 0;
        for (int index = 0; index < nums.length; index++) {
            int currentValue = nums[index];
            int largestDigit = 0;
            int digitCount = 0;
            int tempValue = currentValue;
            while (tempValue > 0) {
                int currentDigit = tempValue % 10;
                tempValue /= 10;
                digitCount++;
                largestDigit = Math.max(largestDigit, currentDigit);
            }
            int encryptedNumber = 0;
            for (int j = 0; j < digitCount; j++) {
                encryptedNumber = encryptedNumber * 10 + largestDigit;
            }
            totalSum += encryptedNumber;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] param_1 = { 1, 2, 3 };
        int ret = new L_3079().sumOfEncryptedInt(param_1);
        System.out.println(ret);
    }
}
