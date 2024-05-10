package Individuos;

public class Gerente extends Funcionario {

    private String equipe;
    private float bonus;

    public Gerente(){
    }

    public Gerente(String nome, String matricula, float salario, float bonus, String equipe) {
        super(nome, matricula, salario);
        this.bonus = bonus;
        this.equipe = equipe;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float calcularSalario() {
        return getSalario() + bonus;
    }

    @Override
    public String toString() {
       return super.toString() + "\nGERENTE\nBônus: " + bonus + "\nEquipe: " + equipe;
    }

}
