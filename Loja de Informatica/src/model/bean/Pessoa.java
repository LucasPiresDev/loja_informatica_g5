
package model.bean;

public class Pessoa {
   private String cpf;
   private String nome;
   private String logradouro;
   private int numero;
   private String telefone;
   private int id;

    public Pessoa(String cpf, String nome, String logradouro, int numero, String telefone, int id) {
        this.cpf = cpf;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.telefone = telefone;
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
