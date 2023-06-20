import java.util.Stack;

//        s1 = "()" - true
//        s2 = "()[]{}" - true
//        s3 = "(]" - false
//        s4 = "([{}])" - true
//        s5 = "[()]{}" - true
//        s6 = "[(][)]{}" - false
//          ")(){}" - false

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("[()]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<Character>();
        boolean finalAns = false;
        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case ')':
                    if (bracketStack.peek() == '(') {
                        bracketStack.pop();
                        finalAns = true;
                        break;
                    }
                    return false;
                case ']':
                    if (bracketStack.peek() == ']') {
                        bracketStack.pop();
                        finalAns = true;
                        break;
                    }
                    return false;
                case '}':
                    if (bracketStack.peek() == '}') {
                        bracketStack.pop();
                        finalAns = true;
                        break;
                    }
                    return false;
                default:
                    return finalAns = false;
            }
        }
        if (!bracketStack.empty()) {
            finalAns = false;
        }
        return finalAns;
    }
}
