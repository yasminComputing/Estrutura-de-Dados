public class Clima{
    public String ano;
    public String mes;
    public String temperatura;
    public String precipitacao;

    public Clima(String ano, String mes, String temperatura, String precipitacao){
        this.ano = ano;
        this.mes = mes;
        this.temperatura = temperatura;
        this.precipitacao = precipitacao;
    }

    @Override
    public String toString() {
        return "Clima -> Ano: "+this.ano + " Mês: "+this.mes + " Temperatura: " + this.temperatura + " Precipitação: " +this.precipitacao;
    }

   
    @Override 
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;
        Clima c = (Clima)obj; 
        return (this.ano.equals(c.ano) && this.mes.equals(c.mes)); 
    }

}
