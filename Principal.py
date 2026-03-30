from Glicemia import Glicemia
from minhas_funcoes import popular_lista_arquivo,exibir_lista,calcular_media,calcular_mediana

lista = []
nome_base = "dados.csv"

popular_lista_arquivo(lista,nome_base)
exibir_lista(lista)

media = calcular_media(lista)

print("Média glicêmica: ",media)

mediana = calcular_mediana(lista)

print("Mediana glicêmica: ",mediana)

#calcular a mediana glicemica e exibir na tela se for par tem que pegar os dois caras e fazer a media e se for impar ele é a mediana 