import java.util.Comparator;
import java.util.List;

public class Funcoes {

    public static void ordenarLista(List<Aluno> lista,String ordemEscolhida){
            if (ordemEscolhida.equals("INGRESSO")){
                lista.sort(Comparator.comparing(a-> a.anoIngresso));
                System.out.println("Lista ordenada por Ano de Ingresso........\n-------------------");
            }else{
                 lista.sort(Comparator.comparing(a -> a.nome));
                 System.out.println("Lista ordenada por Nome........\n------------------");
            }
    }
    public static void buscandoAluno(List<Aluno> lista, String nome){
            boolean achado= false;
            for(Aluno a : lista){
                if (a.nome.trim().equalsIgnoreCase(nome.trim())){
                    System.out.println(a);
                    achado = true;
                }
            }
            if(!achado){
                System.out.println("Nome não encontrado na lista!");
            }
            
            System.out.println("---------------------------------");
    }
    public static void quantidadeIngresso(List<Aluno> lista){
           
            for(int i = 0; i<lista.size();i++){
                int ano = lista.get(i).anoIngresso;
                int contador = 0;
                boolean repetido = false;
                for(int j = 0; j< i; j++){
                    if(lista.get(j).anoIngresso == ano){
                        repetido = true;
                        break;
                    }
                }
                if(repetido) continue;
                for(Aluno a : lista){
                    if(a.anoIngresso == ano){
                        contador++;
                    }
                }
                System.out.println("Quantidade de alunos por ano\n"+ano + ": " + contador + " alunos");
            }
            
            
    }
}
