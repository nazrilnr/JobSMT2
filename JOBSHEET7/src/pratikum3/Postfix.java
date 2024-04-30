package pratikum3;

public class Postfix {
    private int n;
    private int top;
    private char[] stack;

    public Postfix(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c) {
        if (top == n - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++; // Menambahkan top terlebih dahulu
        stack[top] = c; // Menambahkan elemen ke tumpukan
    }
    
    // public void push(char c) {
    //     if (top == n - 1) {
    //         top++;
    //         stack[top] = c;
    //         System.out.println("Stack Overflow");
    //         return;
    //     }
    // }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0'; // Mengembalikan nilai karakter kosong jika tumpukan kosong
        } else {
            char item = stack[top];
            top--;
            return item;
        }
    }
    // public char pop() {
    //     char item = stack[top];
    //     top--;
    //     return item;
    // }

    public boolean isOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ||
            (c >= '0' && c <= '9') || c == '_' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOperator(char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public int degrees(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String convert(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < Q.length(); i++) {
            c = Q.charAt(i);
            if (isOperand(c)) {
                P = P + c;
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (top != -1 && stack[top] != '(') {
                    P = P + pop();
                }
                if (top != -1 && stack[top] == '(') {
                    pop(); // Hapus '(' dari tumpukan
                } else {
                    System.out.println("Error: Kurung tidak seimbang");
                    return ""; // Mengembalikan string kosong karena kurung tidak seimbang
                }
            } else if (isOperator(c)) {
                while (top != -1 && degrees(stack[top]) >= degrees(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        // Pastikan tumpukan kosong setelah membaca seluruh karakter
        while (top != -1 && stack[top] != '(') {
            P = P + pop();
        }
        return P;
    }
    
    // public String convert(String Q) {
    //     String P = "";
    //     char c;
    //     for (int i = 0; i < Q.length(); i++) {
    //         c = Q.charAt(i);
    //         if (isOperand(c)) {
    //             P = P + c;
    //         }
    //         if (c == '(') {
    //             push(c);
    //         }
    //         if (c == ')') {
    //             while(stack[top] != '(') {
    //                 P = P + pop();
    //             }
    //             pop(); // remove '(', not used anymore
    //         }
    //         if(isOperator(c)) {
    //             while(degrees(stack[top]) >= degrees(c)) {
    //                 P = P + pop();
    //             }
    //             push(c);
    //         }
    //     }
    //     return P;
    // }



    // public String convert(String Q) {
    //     String P = "";
    //     char c;
    //     for (int i = 0; i < Q.length(); i++) {
    //         c = Q.charAt(i);
    //         if (isOperand(c)) {
    //             P = P + c;
    //         }
    //         if (c == '(') {
    //             push(c);
    //         }
    //         if (c == ')') {
    //             while(stack[top] != '(') {
    //                 P = P + pop();
    //             }
    //             pop(); // remove '(', not used anymore
    //         }
    //         }
    //         if(isOperator(c)) {
    //             while(degrees(stack[top]) >= degrees(c)) {
    //                 P = P + pop();
    //             }
    //             push(c);
    //         }
    //     return P;
    // }
    
}

// public class Postfix {
//     int n;
//     int top;
//     char[] stack;

//     // Constructor
//     public Postfix(int total) {
//         n = total;
//         top = -1;
//         stack = new char[n];
//         push('(');
//     }
//     // public void push(char c) {
//     //     if (top == n - 1) {
//     //         top++;
//     //         stack[top] = c;
//     //         System.out.println("Stack Overflow");
//     //         return;
//     //     }
        
//     // }
//         public void push(char c){
//             top++;
//             stack[top] = c;
//         }

//     public char pop() {
//         char item = stack[top];
//         top--;
//         return item;
//     }

//     public boolean isOperand(char c) {
//         if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ||
//             (c >= '0' && c <= '9') || c == '_' || c == '.' ) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public boolean isOperator(char c) {
//         if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
//             return true;
//         } else {
//             return false;
//         }
//     }

//         public int degree(char c) {
//             switch(c) {
//                 case '^':
//                     return 3;
//                 case '%':
//                     return 2;
//                 case '/':
//                     return 2;
//                 case '*':
//                     return 2;
//                 case '-':
//                     return 1;
//                 case '+':
//                     return 1;
//                 default:
//                     return 0;
//             }
        
//     }
        
// }