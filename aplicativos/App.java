package aplicativos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        int opcao, quantidadeRegistrada = 0;
        List<Produto> p = new ArrayList<Produto>();
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastro de produtos");
            System.out.println("2 - Consultar produto");
            System.out.println("3 - Listagem de produtos");
            System.out.println("4 - Relatório de vendas");
            System.out.println("5 - Realizar venda");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); 

            if (opcao == 1) {
                Produto p1 = new Produto();
                System.out.println("Insira o nome do produto: ");
                p1.setNome(in.nextLine());

                System.out.println("Insira o valor do produto: ");
                p1.setValor(in.nextLine());

                System.out.println("Insira o código do produto: ");
                p1.setcodigo(in.nextLine());

                System.out.println("Insira a quantidade em estoque: ");
                p1.setQuantidadeEstoque(in.nextLine());

                p.add(p1);
                quantidadeRegistrada++;

                voltarMenu(in);
                continue;
            } else if (opcao == 2) {
                System.out.println("Insira o código ou nome do produto: ");
                String busca = in.nextLine();

                for (Produto p2 : p) {
                if (busca.equals(p2.getcodigo()) || (busca.equals(p2.getNome()))){
                System.out.println("Produto encontrado: ");
                System.out.println(p2.getNome());
                }
                 else {
                    System.out.println("Produto não encontrado.");
                }}
                voltarMenu(in);
            } else if (opcao == 3) {

                System.out.println("\n****\nPRODUTOS\n****\n");    
                for (Produto p2 : p) {
                    System.out.println(p2 + "\n");
                }
                if (quantidadeRegistrada == 0){
                    System.out.println("Não existem produtos cadastrados.");
                    voltarMenu(in);
                }
                        
                voltarMenu(in);
            } else if (opcao == 4) {
                System.out.println("\n****\nVENDAS\n****\n - Período de emissão.");
                System.out.println("- Data da venda, nome do produto, quantidade, valor unitário e valor total.");
                System.out.println("- Valor médio das vendas para aquele período");
                voltarMenu(in);
            } else if (opcao == 5) {
                
                voltarMenu(in);
            }
            
            else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}