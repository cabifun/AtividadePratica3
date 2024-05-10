import Individuos.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List <Funcionario> listaFuncionarios = new ArrayList<>();
    
    public static void cadastrar(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    public static void buscar(String matricula){


        for (Funcionario fTemporario : listaFuncionarios){


            if (fTemporario.getMatricula().equals(matricula)) {
                System.out.println("Funcionário encontrado!\n");
                System.out.println(fTemporario.toString());
                return;
            }
        }

        System.out.println("\n" + matricula + " não encontrada"); 
        return;
    }

    public static void Listar(){

        if (listaFuncionarios.isEmpty()) {
            System.out.println("Ainda não há funcionários cadastrados...");
            return;
        }
            for (Funcionario fTemp : listaFuncionarios) {
                System.out.println(fTemp.toString());
            }
        return;
    }

    public static void excluir(String matricula){
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            Funcionario f = listaFuncionarios.get(i);

            if (f.getMatricula().equals(matricula) {
                listaFuncionarios.remove(i);
                System.out.println("\n" + f.toString() + "foi removido com sucesso");
                return;
            }
        }
        System.out.println(matricula + " não encontrada.");
    }
    
    public static List<Funcionario> getListaFuncionario() {
        return listaFuncionarios;
    }

}