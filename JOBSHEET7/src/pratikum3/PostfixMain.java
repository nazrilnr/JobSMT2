package pratikum3;

import java.util.Scanner;

public class PostfixMain {

    public static void main(String[] args) {
        Scanner yuhu = new Scanner(System.in);
        String P, Q;
        System.out.println("Insert mathematical expression (infix) : ");
        Q = yuhu.nextLine();
        Q = Q.trim();
        Q += ' ';
        
        int total  = Q.length();

        Postfix post = new Postfix(total);
        P = post.convert(Q);
        System.out.println("Postfix: " + P);

    }
    
}
