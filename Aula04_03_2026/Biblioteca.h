#include <iostream>
#include <cstdlib>
#include <ctime>
#include <vector> //para a lista
#include <algorithm>

using namespace std;

/**
 * @brief   Método que popula uma lista com números inteiros aleatórios dentro de uma faixa.
 * 
 * @param lista  contém os números aleatórios gerados
 * @param quantidaDeNumeros  contém quantos números se deseja inserir na lista
 * @param faixaInicial  contém o número inicial da faixa
 * @param faixaFinal  contém o número final da faixa
 */

void populaListaAleatoria(vector <int> &lista, int quantidadeDeNumeros,int faixaInicial,int faixaFinal){
        //observe o símbolo & na frente da variável lista. Isso acontece porque em C++ se houver alteração na lista, é 
         //preciso utilizar o símbolo de endereçamento &
         srand(time(NULL));
         int numeroSorteado;
         for(int i = 0; i < quantidadeDeNumeros;i++){
            numeroSorteado = faixaInicial + (rand() % (faixaFinal - faixaInicial + 1));
            lista.push_back(numeroSorteado);
         }


}

/**
 * @brief Método que =exibe o contéudo de uma lista de inteiros,elemento a baixo de elemento
 * 
 * @param lista contém os números inteiros
 */

void exibirLista(vector <int> lista){
            for (int i = 0; i< lista.size();i++){
                cout << lista[i] << "\n";

            }
            cout << "--------------------\n";
            cout << "Total de elemento: " << lista.size() << "\n";
    } 
    /**
     * @brief Método que copia os números da lista origem para lista destino, execeto os repetidos
     * 
     * @param listaOrigem contém os números originais da lista
     * @param listaResultado contém os números copiados da lista original sem ser repetidos
     */

void copiarListaSemReplicados(vector<int> &listaOrigem, vector<int> &listaDestino) {
    for(int item : listaOrigem){
        if (find(listaDestino.begin(), listaDestino.end(),item ) == listaDestino.end()){
            listaDestino.push_back(item);
        }
    }

    }

    



