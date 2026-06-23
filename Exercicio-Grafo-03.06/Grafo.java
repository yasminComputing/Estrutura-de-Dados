
import java.util.ArrayList;

public class Grafo{
    int matrizAdj[][];
    int qtdeVertices;
    ArrayList<String> vertices;



    /***
     * construtor 
     * @param qtdeVertices para indicar a quantidade de linhas e colunas da matriz
     */
    public Grafo(ArrayList<String> vertices){
        this.vertices = new ArrayList<>();
        this.vertices.addAll(vertices);
        this.qtdeVertices = vertices.size();
        this.matrizAdj = new int[this.qtdeVertices][this.qtdeVertices];

        //inicializar com 0 a matriz que representa o grafo
        for(int i=0;i<qtdeVertices;i++){
            for(int j = 0; j<qtdeVertices;j++){
                this.matrizAdj [i][j] = 0;
            }
        }
}
/***
 * exibe a matrizADJ do grafo em formato de matriz
 */
    void mostrarMatriz(){
         for(String v : this.vertices){
            System.out.print("    "+ v);
        }
        System.out.println();

        for(int i = 0; i< qtdeVertices;i++){
            System.out.print(this.vertices.get(i) + "   ");
            for(int j = 0; j < qtdeVertices;j++){
                System.out.print(matrizAdj[i][j] + "    ");
            }
            System.out.println();
        }
    }

    void mostrarGrafo(){
        for(int i = 0; i <this.qtdeVertices;i++){
            System.out.print(this.vertices.get(i) + ": ");
            for(int j = 0; j < this.qtdeVertices;j++){
                if(this.matrizAdj[i][j] != 0){
                    System.out.print(this.vertices.get(j) + "   ");
                }
            }
            System.out.println();
        }
    }


    /**
     * Dado uma origem e destino é definida uma aresta
     * @param origem representa a linha
     * @param destino representa a coluna
     */
    void inserirAresta(int origem, int destino){
        if(this.matrizAdj[origem][destino] == 0){
            this.matrizAdj[origem][destino] = 1;

        }
    }
    /***
     * Retorna o índice na lista de vertices de um vertice
     * @param vertice um nó ou nodo do grafo
     * @return posição do vértice
    */
         int pegarIndice(String vertice){
            return this.vertices.indexOf(vertice);
        }

    public void adicionarVertices(String vertice){
        if(!this.vertices.contains(vertice)){
            this.vertices.add(vertice);
        }
    }

}
