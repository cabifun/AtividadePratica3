import Individuos.Desenvolvedor;
import Individuos.Estagiario;
import Individuos.Gerente;

public class Sistema {
    
    private static void menu(){

        System.out.println("[1] Cadastrar Funcionario");
        System.out.println("[2] Procurar funcionário");
        System.out.println("[3] Listar todos os funcionários");
        System.out.println("[4] Excluir funcionário");
        System.out.println("[0] Sair do sistema");
        System.out.print("Sua opção: ");

    }

    private static void verificarOpcao(int op){

        switch (op) {
            case 1:
                cadastrarFuncionario();
                break;
            case 2:
                procurarFuncionario();
                break;
            case 3:
                listarFuncionarios();
                break;
            case 4:
                excluirFuncionario();
                break;
            case 0:
                System.out.println("Programa finalizado!!!");
                break;

            default:
                System.out.println("\nOpção inválida. Tente novamente!!!");
                break;
        }

    }

    private static void cadastrarFuncionario(){
    int op;

        do {
            System.out.println("\nSelecione o funcionário que deseja cadastrar");
        System.out.println("[1] Gerente");
        System.out.println("[2] Desenvolvedor");
        System.out.println("[3] Estagiário");
        System.out.println("[0] Voltar ao menu principal");
        System.out.print(" ");
        op = Console.lerInt();

        switch (op) {
            case 1:
                System.out.print("Nome: ");
                String nome = Console.lerString();
                System.out.print("Matricula: ");
                int matricula = Console.lerInt();
                System.out.print("Salário: ");
                float salario = Console.lerFloat();
                System.out.print("Bônus anual: ");
                float bonus = Console.lerFloat();
                System.out.print("Equipe que gere: ");
                String equipe = Console.lerString();

                Gerente g = new Gerente(nome, matricula, salario, bonus, equipe);
                Cadastro.Cadastrar(g);
                System.out.println("Gerente cadastrado!");
                break;
            case 2:
            System.out.print("Nome: ");
            String nomeDesenvolvedor = Console.lerString();
            System.out.print("Matricula: ");
            int matriculaDesenvolvedor = Console.lerInt();
            System.out.print("Salário: ");
            float salarioDesenvolvedor = Console.lerFloat();
            System.out.print("Linguagem dominante: ");
            String linguagens = Console.lerString();

                Desenvolvedor d = new Desenvolvedor(nomeDesenvolvedor, matriculaDesenvolvedor, salarioDesenvolvedor, linguagens);
                Cadastro.Cadastrar(d);
                System.out.println("Desenvolvedor cadastrado!");

                break;

            case 3:
            System.out.print("Nome: ");
            String nomeEstagiario = Console.lerString();
            System.out.print("Matricula: ");
            int matriculaEstagiario = Console.lerInt();
            System.out.print("Salário: ");
            float salarioEstagiario = Console.lerFloat();
            System.out.print("Horas trabalhadas: ");
            int horas = Console.lerInt();
            System.out.print("Nome do supervisor: ");
            String supervisor = Console.lerString();

                Estagiario e = new Estagiario(nomeEstagiario, matriculaEstagiario, salarioEstagiario, horas, supervisor);
                Cadastro.Cadastrar(e);
                System.out.println("Estagiário cadastrado!");

                break;        
        
            case 0:
            System.out.println("Voltando ao menu principal!!!");
            default: System.out.println("Opção inválida. Tente novamente!!!");
                break;
        }
        } while (op != 0);
        
    }

    private static void procurarFuncionario(){
        int matricula;
        System.out.println("PROCURANDO FUNCIONÁRIO:");
        System.out.print("Digite a matricula do funcionário: ");
        matricula = Console.lerInt();
        Cadastro.buscar(matricula);
    }


    private static void listarFuncionarios(){
        System.out.println("\nLISTAGEM DE TODOS OS FUNCIONARIOS:");
        Cadastro.Listar();
    }

    private static void excluirFuncionario(){
int mat;
        System.out.println("\nEXCLUSÃO DE FUNCIONÁRIO");
        System.out.print("Digite a matricula do funcionário que deseja excluir do sistema: ");
        mat = Console.lerInt();
        Cadastro.excluir(mat);

    }

    public static void executar(){
        int op;
       
       do {
        menu();
        op = Console.lerInt();
        verificarOpcao(op);
       } while (op != 0);
        
    }

}