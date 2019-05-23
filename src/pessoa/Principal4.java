package pessoa;
public class Principal4 {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        e.setSalarioBase(6000);
        e.setImposto(50);
        Operario o = new Operario();
        o.setValorProducao(100);
        o.setComissao(10);
        double salario = o.calcularSalario();
        System.out.println(salario);
    }
}
