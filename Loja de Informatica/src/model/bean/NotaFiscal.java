
package model.bean;

import java.util.Date;

public class NotaFiscal{
  private int numero;
  private Date data;
  private VendaProduto compra;

    public NotaFiscal(int numero, Date data, VendaProduto compra) {
        this.numero = numero;
        this.data = data;
        this.compra = compra;
    }
  
  
}
