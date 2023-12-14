package br.com.newtonpaiva.q2;



import java.io.FileNotFoundException;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc;
        Scanner scanner = new Scanner(System.in);
        AVLTree arvore = new AVLTree();

        int [] valor = new int[]{50, 13, 5, 17, 9, 8, 10, 12, 55, 70};
        int num = 0;

        AVLTree.Node raiz = null;


        do {

            System.out.println("<Inserir 1> <Excluir 2> <Pré ordem 3> <Sair 4>");
            num = scanner.nextInt();

            for (int i = 0; i < valor.length; i++) {
                if (num == 1) {
                    raiz = arvore.insert(raiz, valor[i]);

                    arvore.print(raiz);
                }
            }

            if (num == 2) {
                System.out.println("--------------------------------------------------");
                System.out.println("Digite um valor para excluir: ");
                int val = scanner.nextInt();
                raiz = arvore.deleteNode(raiz, val);
                arvore.print(raiz);
            } else if (num == 3) {
                System.out.println("Preorder:");
                arvore.preOrder(raiz);
            } else if (num != 4) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (num != 4);

        System.out.println("Saindo do Programa....");
    }
}