// Sistema de Controle de Estoque e Vendas
// versao 1.0 - feito rapido pra entregar antes do prazo
// autor: equipe antiga

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

    static String SENHA_ADMIN = "1234";  // senha do admin

    static ArrayList<Produto> produtos = new ArrayList<>();
    static ArrayList<String> historicoProdutosCadastrados = new ArrayList<>();

    static final int LIMITE_ESTOQUE_BAIXO = 5;
    static final double VENDA_NAO_REALIZADA = -1.0;
    static final double LIMITE_DESCONTO_VENDA = 100;
    static final double VALOR_DESCONTO_VENDA = 0.10;
    static final double LIMITE_DESCONTO_RELATORIO = 200;
    static final double VALOR_DESCONTO_RELATORIO = 0.15;

    static class Produto {
        String nome;
        double preco;
        int qtd;
    }

    static void cadastrarProduto(String nomeProduto, double precoProdto, int qquantidadeProduto) {
        Produto prod = new Produto();
        prod.nome = nomeProduto;
        prod.preco = precoProdto;
        prod.qtd = qquantidadeProduto;
        produtos.add(prod);
        historicoProdutosCadastrados.add(nomeProduto);
        System.out.println("Produto adicionado!");
    }

    static double vender(String nome, int quantidade) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).nome.equals(nome)) {
                if (produtos.get(i).qtd >= quantidade) {
                    produtos.get(i).qtd = produtos.get(i).qtd - quantidade;
                    double total = produtos.get(i).preco * quantidade;
                    // desconto pra compras grandes
                    if (total > LIMITE_DESCONTO_VENDA) {
                        total = total * (1.0 - VALOR_DESCONTO_VENDA);
                    }
                    System.out.println("Venda realizada. Total: " + total);
                    return total;
                } else {
                    System.out.println("Estoque insuficiente");
                    return VENDA_NAO_REALIZADA;
                }
            }
        }
        System.out.println("Produto nao encontrado");
        return 0;
    }

    // calcula o total de uma compra (usado no relatorio)
    static double calcular_total(double preco, int quantidade) {
        double t = preco * quantidade;
        if (t > LIMITE_DESCONTO_RELATORIO) {              // limite diferente do usado em vender()
            t = t * (1 - VALOR_DESCONTO_RELATORIO);       // desconto diferente do usado em vender()
        }
        return t;
    }

    static void listar() {
        System.out.println("=== PRODUTOS ===");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).nome + " - R$" + produtos.get(i).preco
                    + " - qtd: " + produtos.get(i).qtd);
        }
    }

    static void relatorio_estoque_baixo() {
        System.out.println("=== ESTOQUE BAIXO ===");
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).qtd < LIMITE_ESTOQUE_BAIXO) {   // estoque baixo
                System.out.println(produtos.get(i).nome + " esta com estoque baixo ("
                        + produtos.get(i).qtd + ")");
            }
        }
    }

    // funcao antiga, nao usamos mais
    // static void exportar() {
    //     try {
    //         FileWriter f = new FileWriter("dados.txt");
    //         for (int i = 0; i < produtos.size(); i++) {
    //             f.write(produtos.get(i).nome + "\n");
    //         }
    //         f.close();
    //     } catch (Exception e) {}
    // }

    static void relatorio_vendas() {
        // TODO: implementar de verdade
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1-Cadastrar  2-Vender  3-Listar  4-Estoque baixo  5-Admin  0-Sair");
            System.out.print("Opcao: ");
            String op = sc.next();
            if (op.equals("1")) {
                System.out.print("Nome: ");
                String nomeProduto = sc.next();
                System.out.print("Preco: ");
                double precoProduto = Double.parseDouble(sc.next());   // quebra se digitar texto
                System.out.print("Qtd: ");
                int quantidadeProduto = Integer.parseInt(sc.next());        // quebra se digitar texto
                cadastrarProduto(nomeProduto, precoProduto, quantidadeProduto);
            } else if (op.equals("2")) {
                System.out.print("Nome do produto: ");
                String n = sc.next();
                System.out.print("Quantidade: ");
                int q = Integer.parseInt(sc.next());
                vender(n, q);
            } else if (op.equals("3")) {
                listar();
            } else if (op.equals("4")) {
                relatorio_estoque_baixo();
            } else if (op.equals("5")) {
                System.out.print("Senha: ");
                String s = sc.next();
                if (s.equals(SENHA_ADMIN)) {
                    System.out.println("Acesso liberado");
                } else {
                    System.out.println("Senha errada");
                }
            } else if (op.equals("0")) {
                break;
            } else {
                System.out.println("Opcao invalida");
            }
        }
    }
}