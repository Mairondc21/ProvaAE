package br.com.newtonpaiva.q1;

import javax.lang.model.element.Element;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Questao01 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayStack<String> stack = new ArrayStack<>();
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File("D://Usuario//12111752//Downloads//nomes.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                stack.push(line);
            }
            while (!stack.isEmpty()) {
                String poppedElement = stack.pop();
                System.out.println("Desempilhado: " + poppedElement);
                arrayList.add(poppedElement);
            }

            scanner.close();
        } catch (FullStackException e) {
            throw new RuntimeException(e);
        }

        stack.status("Leitura do Arquivo", null);

        System.out.println("Elementos na ArrayList: " + arrayList);
    }

}
