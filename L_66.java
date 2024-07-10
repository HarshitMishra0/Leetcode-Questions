public class L_66 {
    public int[] plusOne(int[] digits) {

        boolean extend = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                extend = false;
                break;
            }
        }

        int n = digits.length;
        if (extend) {
            n = digits.length + 1;
        }

        int arr[] = new int[n];

        if (extend) {
            arr[0] = 1;
            int a = arr.length - 2;
            arr[arr.length - 1] = (digits[digits.length - 1] + 1) % 10;
            int carry = (digits[digits.length - 1] + 1) / 10;
            for (int i = digits.length - 2; i >= 0; i--) {
                int number = carry + digits[i];
                arr[a] = number % 10;
                carry = number / 10;
                a--;
            }

        } else {
            int a = arr.length - 2;
            arr[arr.length - 1] = (digits[digits.length - 1] + 1) % 10;
            int carry = (digits[digits.length - 1] + 1) / 10;
            for (int i = digits.length - 2; i >= 0; i--) {
                int number = carry + digits[i];
                arr[a] 1528= number % 10;
                carry = number / 10;
                a--;
            }
        }

        return arr;

    }
}
