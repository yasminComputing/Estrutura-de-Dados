import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Aluno> lista = new ArrayList<>();
        String arquivo = "alunos.csv";

        try (BufferedReader leitor = new BufferedReader(
                new FileReader(arquivo, StandardCharsets.UTF_8))) {

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String dadosLinha[] = linha.split(",");

                Aluno objAluno = new Aluno(dadosLinha[0].toUpperCase(),dadosLinha[1],dadosLinha[2],Integer.parseInt(dadosLinha[3].trim()));

                if (!lista.contains(objAluno)) {
                    lista.add(objAluno);
                }
            }

            System.out.println("ARQUIVO LIDO!");
            System.out.println("-----------------------------------------------");

            for(Aluno a : lista){
                System.out.println(a);
            }
             System.out.println("----------------------------------------------");
     
            System.out.println("Como deseja ordenar a lista final por Ano de Ingresso ou por Nome");
            System.out.print("Digite sua preferencia (ingresso / nome): ");
            String nome = sc.nextLine().toUpperCase();
            
            Funcoes.ordenarLista(lista, nome);
            System.out.println("\nLista final ordenada:");
            for (Aluno a : lista) {
                 System.out.println(a);
            }
            System.out.println("----------------------------------------------");


            System.out.print("Deseja buscar dados de um aluno (sim/nao): ");
            String buscarDados = sc.nextLine().toUpperCase();

            if(buscarDados.equals("SIM")){

                System.out.print("Informe o nome do aluno: ");
                String nomeAluno = sc.nextLine().toUpperCase();

                Funcoes.buscandoAluno(lista, nomeAluno);   
                     
            
            }

            Funcoes.quantidadeIngresso(lista);

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo");
        }

        sc.close();
    }
}
