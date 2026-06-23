from biblioteca import popular_lista_aleatoria, exibir_lista,copiar_lista_sem_replicados 



#declarando uma lista em python
lista_numeros = []

#recebendo a quantidade de números a serem gerados aleatoriamente
quantidade_numeros = int (input("Informe uma quantia de números que gostaria de armanzenar: "))

#definindo a faixa de intervalo dos números a serem sorteados
faixa_inicial = 10
faixa_final = 50

popular_lista_aleatoria(lista_numeros, quantidade_numeros, faixa_inicial, faixa_final)

exibir_lista(lista_numeros)

lista_resultado = []

copiar_lista_sem_replicados(lista_numeros,lista_resultado)
lista_resultado.sort()#ordena a lista com números ordenados
exibir_lista(lista_resultado)
