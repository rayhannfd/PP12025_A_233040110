package Pertemuan11;

public class ParsePost {
    private String input;
    private MyStack stack;

    public ParsePost(String input) {
        this.input = input;
        stack = new MyStack(20);
    }

    public int doParse() {
        char ch;
        int i, num1, num2, interAns;

        for (i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push((int)(ch - '0'));
            } else {
                num2 = stack.pop();
                num1 = stack.pop();
                switch (ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                stack.push(interAns);
            }
        }
        return stack.pop();
    }
}