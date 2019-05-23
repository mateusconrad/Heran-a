package pessoa;
public class Principal1 {
        public static void main(String[] args) {
            Pessoa p = new Pessoa();
            Fornecedor f = new Fornecedor();
            f.setValorCredito(100);
            f.setValorDivida(25);
            double saldo = f.obterSaldo();
            System.out.println(saldo);
    }
    
}
