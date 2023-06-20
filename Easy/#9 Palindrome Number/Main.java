public class Main {
    public static void main(String[] args) {
        System.out.print(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        char[] obtainedNoArr = Integer.toString(x).toCharArray();
        for (int i = 0; i < obtainedNoArr.length / 2; i++) {
            int secInd = obtainedNoArr.length - (i + 1);
            if (obtainedNoArr[i] != obtainedNoArr[secInd]) {
                return false;
            }
        }
        return true;
    }
}
