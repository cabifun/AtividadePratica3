package Individuos;

public class Estagiario extends Funcionario {

    private int horasDeTrabalho;
    private String supervisor;

    public Estagiario(int horasDeTrabalho, String supervisor, String nome, String matricula, float salario) {
        super(nome, matricula, salario);
        this.horasDeTrabalho = horasDeTrabalho;
        this.supervisor = supervisor;
    }

    public int getHorasDeTrabalho() {
        return horasDeTrabalho;
    }

    public void setHorasDeTrabalho(int horasDeTrabalho) {
        this.horasDeTrabalho = horasDeTrabalho;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoras de trabalho " + horasDeTrabalho + "\nSupervisor: " + supervisor;
    }

    @Override
    public float calcularSalario() {
        return getSalario() * horasDeTrabalho;
    }

    @Override
    public String trabalhar() {
    
    return "O estagiário " + nome + " está trabalhando.";
    }

    @Override
    public String relatarProgresso() {
    
    return "O estagiário " + nome + " está trabalhando em conjunto com seu supervisor: " + supervisor + ".";
    }

}
