/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanvir Rahman Shuvo
 */

    
import java.util.Scanner;
public class questwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Data: ");
        String str = sc.nextLine();
        String[] word = str.split(" ");
        int count;
        for (int i = 0; i < word.length; i++) {
            count = 1;
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count = count + 1;
                    word[j] = "0";}}
            if (word[i] != "0") {
                System.out.println(word[i] + " occurs " + count + " times");}
        }
    }
}
