package pessoa;
public class Administrador extends Empregado {

    public double getAjuda() {
        return ajuda;
    }

    public void setAjuda(double ajuda) {
        this.ajuda = ajuda;
    }
    
    public double ajudaDeCusto(){
        double custo = this.ajuda;
        return custo;
    }
   
    
    protected double ajuda;
    
    @Override
    public double  calcularSalario(){
        double salario;
        imposto = imposto/100;
        salario = this.salarioBase - imposto;  
        return salario;
    }

    void setAjuda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
