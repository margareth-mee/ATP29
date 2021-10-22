package views;

import java.util.Scanner;

import controllers.ProdutoController;
import models.Produto;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ProdutoController pc = new ProdutoController();

    public static void main(String[] args) {
        int op;

        do {
            menu();
            op = opcao();
            cases(op);
        } while (op != 5);
    }

    public static void menu() {
        System.out.println(
                "Menu\n1 - Cadastrar\n2 - Lista de Produto\n3 - Atualizar Produto\n4 - Remover Produto\n5 - sair\n");
    }

    public static int opcao() {
        System.out.print("Digite uma opção: ");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    public static void cases(int op) {
        switch (op) {
        case 1:
            case1();
            break;

        case 2:

            break;

        case 3:

            break;

        case 4:

            break;

        case 5:
               System.out.println("Obrigada!");
            break;

        default:
            System.out.println("Não possui essa opção tente novamente ");
            break;

        }
    }

    public static void case1() {
        Produto p = new Produto();

        System.out.println("Informe o id do produto:");
        String id = sc.nextLine();
        p.id = id;

        System.out.println("Infome o nome do produto:");
        String produto = sc.nextLine();
        p.nome = produto;

        System.out.println("Informe a categoria:");
        String categoria = sc.nextLine();
        p.categoria.descricao = categoria;

        System.out.println("Informe o preço:");
        double valor = Double.parseDouble(sc.nextLine());
        p.preco = valor;

        pc.create(p);

    }
}
