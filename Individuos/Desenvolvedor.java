package Individuos;

public class Desenvolvedor extends Funcionario {

    private String linguagens;
    
    public Desenvolvedor(){
    }

    public Desenvolvedor(String linguagens, String nome, String matricula, float salario) {
        super(nome, matricula, salario);
        this.linguagens = linguagens;
    }

    public String getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }

    @Override
    public String toString() {
        return "\nDESENVOLVEDOR\nLinguagens: " + linguagens;
    }

    @Override
    public float calcularSalario() {
        return getSalario();
    }

}
