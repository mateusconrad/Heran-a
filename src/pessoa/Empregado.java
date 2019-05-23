
package pessoa;

public class Empregado extends Pessoa{

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto;
    
    public double  calcularSalario(){
       // double salario = (this.salarioBase - (this.imposto/100));
        double salario = 0;
        imposto = salario*(imposto/100);
        salario = this.salarioBase - imposto;
        return salario;
    }
}


