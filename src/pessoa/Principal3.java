package pessoa;
public class Principal3 {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        e.setSalarioBase(10000);
        e.setImposto(50);
        Administrador a = new Administrador();
        a.setAjuda(2000);
        double salario = a.calcularSalario();
        System.out.println(salario);
    }
    
}
