package pessoa;


public class  Operario extends Empregado {

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
   
    protected double valorProducao; //valor monetário dos artigos efetivamente produzidos pelo operário
    protected double comissao;      //porcentagem do valorProducao que será adicionado ao vencimento base do operário
    
    public double calcularComissao(){
    comissao = valorProducao/0.15;
    return comissao;
    }
    
    @Override
    public double  calcularSalario(){
        double salario;
        imposto = imposto/100;
        salario = this.salarioBase - imposto;  
        salario =+ comissao;
        return salario;
    }

    
}
