
package model.bean;

public class Produto {
 private int id;
 private String descricao;
 private int quantidade;
 private float valor;

    public Produto(int id, String descricao, int quantidade, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }
 
}
