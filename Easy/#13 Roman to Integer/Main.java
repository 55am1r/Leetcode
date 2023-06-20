public class Main {
    public static void main(String[] args) {
        System.out.print(romanToInt("DCXXI"));
    }

    public static int romanToInt(String s) {
        int returnNo = 0;
        s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i + 1 != s.length()) {
                        if (s.charAt(i + 1) == 'V') {
                            returnNo += 4;
                            i++;
                        } else if (s.charAt(i + 1) == 'X') {
                            returnNo += 9;
                            i++;
                        } else {
                            returnNo += 1;
                        }
                    } else {
                        returnNo += 1;
                    }
                    break;
                case 'V':
                    returnNo += 5;
                    break;
                case 'X':
                    if (i + 1 != s.length()) {
                        if (s.charAt(i + 1) == 'L') {
                            returnNo += 40;
                            i++;
                        } else if (s.charAt(i + 1) == 'C') {
                            returnNo += 90;
                            i++;
                        } else {
                            returnNo += 10;
                        }
                    } else {
                        returnNo += 10;
                    }
                    break;
                case 'L':
                    returnNo += 50;
                    break;
                case 'C':
                    if (i + 1 != s.length()) {
                        if (s.charAt(i + 1) == 'D') {
                            returnNo += 400;
                            i++;
                        } else if (s.charAt(i + 1) == 'M') {
                            returnNo += 900;
                            i++;
                        } else {
                            returnNo += 100;
                        }
                    } else {
                        returnNo += 100;
                    }
                    break;
                case 'D':
                    returnNo += 500;
                    break;
                case 'M':
                    returnNo += 1000;
                    break;
                default:
                    return -1;
            }
        }
        return returnNo;
    }
}
