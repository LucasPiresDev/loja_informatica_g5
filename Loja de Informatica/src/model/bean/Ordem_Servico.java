
package model.bean;

import java.util.Date;

public class Ordem_Servico {
  private String descri_prod;
  private Date data;
  private Pessoa pessoa;

    public Ordem_Servico(String descri_prod, Date data, Pessoa pessoa) {
        this.descri_prod = descri_prod;
        this.data = data;
        this.pessoa = pessoa;
    }

  

    public String getDescri_prod() {
        return descri_prod;
    }

    public void setDescri_prod(String descri_prod) {
        this.descri_prod = descri_prod;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
  
}
