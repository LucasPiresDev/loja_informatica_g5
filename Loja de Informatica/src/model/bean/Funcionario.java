
package model.bean;

public class Funcionario extends Pessoa {
   private float salario;
   private String departamento;
   private String cargo;
   private String data_admissao;
   private Login login;

    public Funcionario(String cpf, String nome, String logradouro, int numero, String telefone, int id) {
        super(cpf, nome, logradouro, numero, telefone, id);
    }
   
}
