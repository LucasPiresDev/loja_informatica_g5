
package model.bean;
import java.util.Date;

public class Estoque_Cliente implements Iestoque{
    private Date data_saida;
    private Ordem_Servico ordem_servico;

    public Estoque_Cliente(Date data_saida, Ordem_Servico ordem_servico) {
        this.data_saida = data_saida;
        this.ordem_servico = ordem_servico;
    }


    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    @Override
    public void TotalEstoque() {
    }
    
}
