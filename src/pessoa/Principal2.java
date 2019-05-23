package pessoa;
public class Principal2 {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        e.setSalarioBase(100);
        e.setImposto(50);
        double salario = e.calcularSalario();
        System.out.println(salario);
    }
    
}
