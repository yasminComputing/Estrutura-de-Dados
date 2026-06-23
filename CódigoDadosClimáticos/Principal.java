import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        
        List<Clima> lista = new ArrayList<>();
        String nomeBase = "dadosClimaticos.csv";

        try (BufferedReader leitor = new BufferedReader(
                new FileReader(nomeBase, StandardCharsets.UTF_8))) {
            
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dadosLinha = linha.split(",");
                
                Clima objClima = new Clima(dadosLinha[0], dadosLinha[1], dadosLinha[2], dadosLinha[3]);

                if (!lista.contains(objClima)) {
                    lista.add(objClima);
                }
            }


            int quantidadeTemperaturaQuente = 0;
            int quantidadeTemperaturaFrio = 0;
            int quantidadeTemperaturaAmeno = 0;

            for (Clima item : lista) {
                System.out.println(item);
                String temp = item.temperatura.toLowerCase();
                if(temp.equals("quente")){
                    quantidadeTemperaturaQuente++;
                } else if(temp.equals("frio")){
                    quantidadeTemperaturaFrio++;
                } else {
                    quantidadeTemperaturaAmeno++;
                }
            }
            System.out.println("=======================================");

            System.out.println("--- Controle de Temperaturas que aparecem no arquivo ---");
            System.out.println("Quente: " + quantidadeTemperaturaQuente +" vezes");
            System.out.println("Frio: " + quantidadeTemperaturaFrio + " vezes");
            System.out.println("Ameno: " + quantidadeTemperaturaAmeno + " vezes");

            System.out.println("Informe a temperatura que deseja filtrar (Quente,Ameno,Frio): ");
            String temperaturaEscolhida = sc.nextLine().toLowerCase();
            System.out.println("Meses com a temperatura: "+ temperaturaEscolhida);

            boolean encontrado = false;
            for(Clima item:lista){
            if(item.temperatura.toLowerCase().equals(temperaturaEscolhida)){
                System.out.println("Mês: " + item.mes + " Ano: " + item.ano);
                encontrado = true;
            }
        }
         if(!encontrado){
                System.out.println("Não foi encontado nenhum mês com a temperatura informada: " + temperaturaEscolhida);
            }

        } catch (Exception e) {
            System.err.println("Ocorreu algum erro... " + e.getMessage());
        }
    }
}