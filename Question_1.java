/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanvir Rahman Shuvo
 */

    
    
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) throws IOException {
        // Question 1(a),(b)
        
        File f = new File ("Numbers.txt");
        Scanner i = new Scanner(f);
        ArrayList <Integer> a = new ArrayList <Integer> ();
        while (i.hasNextInt())
            a.add(i.nextInt());
        i.close();
        if (a.get(0)>=0)
        {
            for (int j = 1; j <= a.get(0); j++) {
                if (a.get(0)%j==0)
                    System.out.println(j);
            }
        }
        else
            System.out.println("Sorry, I don’t do negatives.");
        
        //Question 1(C)
        
        int max = a.get(0);
        for (int j = 0; j < a.size(); j++)
            if (max<a.get(j))
                max = a.get(j);
        System.out.println("Largest value of that file = "+max);
        
        //Question 1(d)
        
        File f2 = new File("Output.txt");
        f2.createNewFile();
        FileWriter fw = new FileWriter ("Output.txt");
        if (a.get(0)>=0)
        {
            for (int j = 1; j <= a.get(0); j++) {
                if (a.get(0)%j==0)
                    fw.write(Integer.toString(j)+"\n");
            }
        }
        else
            fw.write("Sorry, I don’t do negatives.");
        fw.write("Largest value of that file = "+max);
        fw.close();
    }
    
}

