import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Arquivos {

    public static void carregarArquivo(TreeSet<Figura> arvore, String arquivo){
        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while((linha = leitor.readLine()) != null){
                String[] dados = linha.split(",");
                Figura figura = new Figura(dados[0],Integer.parseInt(dados[1]),dados[2],Integer.parseInt(dados[3]),Boolean.parseBoolean(dados[4]));


                    arvore.add(figura);


        }
        }catch(Exception e){
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }

    public static void salvarArquivo(Figura figura,String arquivo){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo,true))){

            escritor.write(figura.getNomeSelecao() + "," + figura.getNumeroFigura() + "," + figura.getDescricao() + "," + figura.getQuantidade() + ";" + figura.getRara());

            escritor.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao tentar salvar o arquivo: " + e.getMessage());
        }

    }

}
