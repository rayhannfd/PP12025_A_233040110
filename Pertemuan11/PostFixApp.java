package Pertemuan11;

import java.util.Scanner;

public class PostFixApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ekspresi Postfix: ");
        String input = sc.nextLine();

        ParsePost parser = new ParsePost(input);
        int result = parser.doParse();

        System.out.println("Hasil: " + result);
    }
}