#include <iostream>
#include <cstdlib>
#include <vector> //para a lista

using namespace std;

#include "Biblioteca.h"

int main(){
        
        vector<int>listaNumeros;

        int quantidadeDeNumeros;
        int faixaInicial = 10, faixaFinal = 50;

        vector<int>listaResultado;
        
        cout << "Informe uma quantidade de numeros que gostaria de armazenar: ";
        cin >> quantidadeDeNumeros;

        populaListaAleatoria(listaNumeros, quantidadeDeNumeros, faixaInicial, faixaFinal);

        exibirLista(listaNumeros);

        copiarListaSemReplicados (listaNumeros,listaResultado);
        exibirLista(listaResultado);
        









    return 1;
}