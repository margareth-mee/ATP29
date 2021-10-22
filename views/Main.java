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
                "\nMenu\n1 - Cadastrar\n2 - Lista de Produto\n3 - Atualizar Produto\n4 - Remover Produto\n5 - sair\n");
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
            case2();
            break;

        case 3:
            case3();
            break;

        case 4:
            case4();
            break;

        case 5:
            System.out.println("Obrigada!");
            break;

        default:
            System.out.println("Não possui essa opção, tente novamente!");
            break;
        }
    }

    public static void case1() {
        Produto p = new Produto();
        lerProduto(p);
        pc.create(p);
        System.out.println("\nProduto cadastrado com sucesso!");
    }

    public static void lerProduto(Produto p) {
        p.id = lerString("Informe o id do produto: ");
        p.nome = lerString("Infome o nome do produto: ");
        p.categoria.descricao = lerString("Informe a categoria: ");

        System.out.print("Informe o preço: ");
        double valor = Double.parseDouble(sc.nextLine());
        p.preco = valor;
    }

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    public static void case2() {
        System.out.println("Lista de Produtos:");

        if(pc.read().isEmpty()){
            System.out.println("A lista está vazia!");
        }else{
            for (Produto pElement : pc.read()) {
                System.out.println(pElement);
            }
        }
    }

    public static void case3() {
        Produto p = new Produto();
        lerProduto(p);
        pc.update(p);
        System.out.println("\nProduto atualizado com sucesso!");
    }

    public static void case4() {
        Produto p = new Produto();

        System.out.print("Informe o id do produto a ser removido: ");
        p.id = sc.nextLine();
        pc.delete(p);
        System.out.println("\nProduto removido com sucesso");
    }
}
