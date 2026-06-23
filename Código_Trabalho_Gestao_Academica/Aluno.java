public class Aluno{
    protected String nome;
    protected String curso;
    protected String sexo;
    protected int anoIngresso;

   
    public Aluno(String nome, String curso, String sexo, int anoIngresso) {
        this.nome = nome;
        this.curso = curso;
        this.sexo = sexo;
        this.anoIngresso = anoIngresso;
    }

    @Override
    public String toString(){
        return "Nome do Aluno: " + this.nome +  " \tCurso: " +this.curso +  "\tSexo: " + this.sexo +  "\tAno de Ingresso: " + anoIngresso;
    }
    
  @Override
    public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Aluno other = (Aluno) obj;
            return this.nome != null && this.nome.equals(other.nome);
    }
}