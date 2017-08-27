
package model.bean;

import java.util.List;

public class HistoricoPagamento {
  private int id;
  private List <Pagamento> h_compra;

    public HistoricoPagamento(int id, List<Pagamento> h_compra) {
        this.id = id;
        this.h_compra = h_compra;
    }
  
}
