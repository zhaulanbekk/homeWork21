package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("alphabet.txt")) {
            for (char i = 'A'; i <= 'Z'; i++) {
                String a=i + "" + Character.toLowerCase(i)+" \n";
                fileWriter.append(a);
            }

            for (char i = '0'; i <='9' ; i++) {
                fileWriter.append(i+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader=new FileReader("alphabet.txt")){
            Scanner sc=new Scanner(fileReader);
            int c=1;
            while (sc.hasNextLine()){
                System.out.println(c+") "+sc.nextLine());
                c++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

