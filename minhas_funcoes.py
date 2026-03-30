from  Glicemia import Glicemia
def popular_lista_arquivo(lista,nome_base):
    #ler arquivo e popular a lista com dados splitados
    leitor = open(nome_base, "r", encoding= "utf8")

    for linha in leitor: 
        vetor_linha = linha.split(",")
        obj = Glicemia(int(vetor_linha[0]),vetor_linha[1],vetor_linha[2])

        if obj not in lista:
            lista.append(obj)


    leitor.close()
def exibir_lista(lista):
    for item in lista:
        print(item.valor)


    print("Total de dados da base: ",len(lista)) #aparece a quantidade que item que contem no arquivo dados.csv


def calcular_media(lista):
    soma = 0
    for item in lista:
        soma += item.valor
        
    return int(soma /len(lista))

def calcular_mediana(lista):
    lista.sort(key = lambda g: g.valor) #para ordenar a lista da glicemia -> g: glicemia
    n = len(lista)
    if n % 2 != 0: #se for impar
        meio = n // 2
        return lista[meio].valor
    else:
        meio1 = (n//2) -1
        meio2 = n//2
        return (lista[meio1].valor + lista[meio2].valor) / 2
