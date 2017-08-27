
package model.bean;

import java.util.Date;

public class EstoqueProduto implements Iestoque {
  private Produto produto;
  private int id;
  private Date dataEntrega;

    public EstoqueProduto(Produto produto, int id, Date dataEntrega) {
        this.produto = produto;
        this.id = id;
        this.dataEntrega = dataEntrega;
    }

  
    @Override
    public void TotalEstoque() {
    }
}
