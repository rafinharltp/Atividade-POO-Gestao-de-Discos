import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();

        int opcao;
        do {
            System.out.println("Catalogo de Discos");
            System.out.println("==========================");
            System.out.println("1. Cadastrar Disco");
            System.out.println("2. Cadastrar Artista");
            System.out.println("3. Listar Discos");
            System.out.println("4. Listar Artistas");
            System.out.println("5. Remover Disco");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Titulo do disco: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ano de lancamento: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do artista: ");
                    String nomeArtista = scanner.nextLine();

                    Artista artista = catalogo.buscarArtista(nomeArtista);
                    if (artista == null) {
                        System.out.println("Artista não encontrado. Cadastre o artista primeiro.");
                        break;
                    }

                    System.out.print("Numero de faixas: ");
                    int numFaixas = scanner.nextInt();
                    scanner.nextLine();

                    List<String> faixas = new ArrayList<>();
                    for (int i = 1; i <= numFaixas; i++) {
                        System.out.print("Faixa " + i + ": ");
                        faixas.add(scanner.nextLine());
                    }

                    Disco disco = new Disco(titulo, ano, artista, faixas);
                    catalogo.adicionarDisco(disco);
                    System.out.println("Disco cadastrado");
                    break;

                case 2:
                    System.out.print("Nome do artista: ");
                    String nome = scanner.nextLine();
                    System.out.print("Genero musical: ");
                    String genero = scanner.nextLine();

                    Artista novoArtista = new Artista(nome, genero);
                    catalogo.adicionarArtista(novoArtista);
                    System.out.println("Artista cadastrado");
                    break;

                case 3:
                    catalogo.listarDiscos();
                    break;

                case 4:
                    catalogo.listarArtistas();
                    break;

                case 5:
                    System.out.print("Titulo do disco a ser removido: ");
                    String tituloRemover = scanner.nextLine();
                    catalogo.removerDisco(tituloRemover);
                    System.out.println("Disco removido, se existia.");
                    break;

                case 6:
                    System.out.println("Acabamos por aqui volte depois :)");
                    break;

                default:
                    System.out.println("Opcao invalida :(");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
