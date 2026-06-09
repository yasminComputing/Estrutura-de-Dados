import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*TRABALHO AQUI..
         - LER UM ARQUIVO.CSV, CHAMADO MAPA.CSV DO TIPO
                  a,b
                  b,c
                  d,a
                  d,b
                  d,c
                  e,d
         EXTRAIR OS VERTICES PRESENTES NO CSV E ADICIONA-LOS NA LISTA DE VERTICES (LEMBRAR DE ORDENAR)*/
        ArrayList<String> estacoes = new ArrayList<>();
        ArrayList<String[]> arestas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("mapa.csv"));
            String linha;
            while((linha = br.readLine())!= null){
                String[] dadoLinha = linha.split(",");
                
                arestas.add(dadoLinha);
                if(!estacoes.contains(dadoLinha[0])){
                    estacoes.add(dadoLinha[0]);
                } 
                if(!estacoes.contains(dadoLinha[1])){
                    estacoes.add(dadoLinha[1]);
                }
            
            }
            br.close();
        } catch (Exception e) {
           System.out.println("Erro ao ler arquivo!");
        }

        Collections.sort(estacoes);

        Grafo grafo = new Grafo(estacoes);

        for(String[] a : arestas){
            int origem = grafo.pegarIndice(a[0]);
            int destino = grafo.pegarIndice(a[1]);
            grafo.inserirAresta(origem, destino);
        }
    

       


        grafo.mostrarMatriz();

        System.out.println();
        grafo.mostrarGrafo();



        /***
         * DESAFIO mapa.csv
         * onde vai ser carregado o mapa 
         * Fazer uma classe:
         * -  ler o csv 
         * - Adiociosse os vertices localizados na lista de vertices (sem DUPLICAÇÃO)
         * O primeiro é a origem, segundo é o destino. E usar o split (",")
         * e depois vertices.sort (para ordenar)
         * 
         */
    }
}
