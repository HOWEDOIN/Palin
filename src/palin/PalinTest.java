/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palin;

import java.util.Scanner;

/**
 *
 * @author lambi
 */
public class PalinTest {

    public static void main(String[] args) {
        Palin<Character> p = new Palin();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        char[] word = s.next().toCharArray();
        int i = 0;
        while (word.length != i) {
            p.push(word[i]);
            i++;
        }
        boolean palin = true;
        for (i = 0; i < word.length / 2; i++) {
            if (p.pop() != word[i]) {
                palin = false;
                break;
            }
        }
        if (palin == true) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not palindrome :( ");
        }
    }
}
