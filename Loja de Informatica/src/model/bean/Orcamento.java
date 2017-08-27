
package model.bean;

import java.util.Date;

public class Orcamento {
   private float valorServico;
   private float valorPeca;
   private Ordem_Servico ordem_servico;
   private Date data;
   private AnaliseTecnica analisetecnica;

    public Orcamento(float valorServico, float valorPeca, Ordem_Servico ordem_servico, Date data, AnaliseTecnica analisetecnica) {
        this.valorServico = valorServico;
        this.valorPeca = valorPeca;
        this.ordem_servico = ordem_servico;
        this.data = data;
        this.analisetecnica = analisetecnica;
    }
   
   
}
