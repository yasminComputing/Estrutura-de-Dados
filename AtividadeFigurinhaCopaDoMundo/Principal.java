
import java.util.Scanner;
import java.util.TreeSet;

public class Principal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       TreeSet<Figura> arvoreRepetidasPessoais = new TreeSet<>();
       TreeSet<Figura> arvoreDesejadasPessoais = new TreeSet<>();


       TreeSet<Figura> arvoreRepetidasOutraPessoa = new TreeSet<>();
       TreeSet<Figura> arvoreDesejadasOutraPessoa = new TreeSet<>();

        Arquivos.carregarArquivo(arvoreRepetidasPessoais,"figuras_repetidas_pessoais.csv");

        Arquivos.carregarArquivo(arvoreDesejadasPessoais,"figuras_desejadas_pessoais.csv");

        int opcao = 0;
        while(opcao != 7){
            System.out.println("==== Menu ====");
            System.out.println("1- Cadastrar Figuras Repetidas Pessoais");
            System.out.println("2- Listar Figuras Repetidas Pessoais");
            System.out.println("3- Cadastrar Figuras Desejadas Pessoais");
            System.out.println("4- Listar Figuras Desejas Pessoais");
            System.out.println("5- Carregar Figuras Repetidas de OUTRA Pessoa");
            System.out.println("6- Carregar Figuras Desejas de Outra Pessoa");
            System.out.println("7- Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            System.out.println("--------------------------------------------");

            switch (opcao){
                case 1:
                    System.out.println("1- Cadastrar Figuras Repetidas Pessoais");
                    System.out.println("Nome da seleção: ");
                    String nome = sc.nextLine();

                    System.out.println("Número da Figura: ");
                    int numero = sc.nextInt();


                    sc.nextLine();

                    System.out.println("Descrição: ");
                    String descricao = sc.nextLine();

                    System.out.println("Quantidade: ");
                    int quantide = sc.nextInt();

                    sc.nextLine();
                    boolean rara = true;
                    System.out.println("Figura é rara? (sim/nao):  ");
                    String isRara= sc.nextLine().toUpperCase();
                    if(isRara.equals("NAO")) rara = false;

                    Figura figuraR = new Figura(nome,numero,descricao,quantide,rara);
                    if(arvoreRepetidasPessoais.add(figuraR)){
                        Arquivos.salvarArquivo(figuraR,"figuras_repetidas_pessoais.csv");
                        System.out.println("Figura cadastrada!");
                    }else{
                        System.out.println("Figura já existente!");
                    }
                    break;
                case 2:
                    if(arvoreRepetidasPessoais.isEmpty()){
                        System.out.println("Nenhuma figura repetida cadastrada.");
                    }else{
                        for(Figura f : arvoreRepetidasPessoais){
                            System.out.println(f);
                        }
                    }
                    break;
                case 3:
                        System.out.println("3- Cadastrar Figuras Desejadas Pessoais");

                        System.out.println("Nome da seleção desejada: ");
                        String nomeD = sc.nextLine();

                        System.out.println("Número da figura: ");
                        int numeroD = sc.nextInt();

                        sc.nextLine();
                        System.out.println("Descrição: ");
                        String descricaoD = sc.nextLine();
                        
                        System.out.println("Quantidade: ");
                        int quantidadeD = sc.nextInt();

                        sc.nextLine();

                        boolean raroD = true;
                        System.out.println("Figura é rara? (sim/nao)");
                        String respostaD = sc.nextLine().toUpperCase();
                        if(respostaD.equals("NAO"))raroD = false;

                        Figura figuraDesejada = new Figura(nomeD,numeroD,descricaoD,quantidadeD,raroD);

                        if(arvoreDesejadasPessoais.add(figuraDesejada)){
                            Arquivos.salvarArquivo(figuraDesejada,"figuras_desejadas_pessoais.csv");
                            System.out.println("Figura cadastrada com sucesso!");
                        }else{
                            System.out.println("Figura já existente!");
                        }
                        break;
                case 4: 
                         System.out.println("4- Listar Figuras Desejas Pessoais");
                        if(arvoreDesejadasPessoais.isEmpty()){
                            System.out.println("Nenhuma figura desejada cadastrada.");
                        }else{
                            for(Figura f : arvoreDesejadasPessoais){
                                System.out.println(f);
                            }
                        }
                        break;
                case 5:
                        System.out.println("5- Carregar Figuras Repetidas de OUTRA Pessoa");
                        System.out.println("Digite nome do arquivo: ");
                        String arquivoRepetido = sc.nextLine();

                        arvoreRepetidasOutraPessoa.clear();
                        Arquivos.carregarArquivo(arvoreRepetidasOutraPessoa,arquivoRepetido);

                        System.out.println("Figuras que você deseja: ");

                        boolean encontrado = false;
                        for(Figura repetida : arvoreRepetidasOutraPessoa){
                            if(arvoreDesejadasPessoais.contains(repetida)){
                                System.out.println(repetida);
                                encontrado = true;
                                System.out.println("Figuras carregadas!");
                            } 

                        }
                        if(!encontrado){
                            System.out.println("Nenhuma troca encontrada!");
                        }
                        break;
                case 6:
                        System.out.println("Informe o arquivo desejado da outra pessoa: ");
                        String arquivoOutroD = sc.nextLine();

                        arvoreDesejadasOutraPessoa.clear();

                        Arquivos.carregarArquivo(arvoreDesejadasOutraPessoa, arquivoOutroD);


                        boolean encontrouD = false;
                        System.out.println("Figuras que você possui e outra pessoa deseja: ");
                        for(Figura repetida : arvoreRepetidasPessoais){
                            if(arvoreDesejadasOutraPessoa.contains(repetida)){
                                System.out.println(repetida);
                                encontrouD = true;
                            }
                        }
                        if(!encontrouD){
                            System.out.println("Nenhuma troca encontrada...");
                        }
                        break;
                case 7:
                        System.out.println("Programa Finalizado!");
                        break;
                default:
                        System.out.println("Opção informado não corresoponde ao menu!Tente Novamente");
            }



        }




    }
}
