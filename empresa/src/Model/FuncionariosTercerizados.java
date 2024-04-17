package Model;

public final class FuncionariosTercerizados extends Funcionarios {

    protected double valorAdicional;

    public FuncionariosTercerizados() {

        super();
        this.valorAdicional = 0;
    }
    public FuncionariosTercerizados(String nome, int horasTrabalhadas, double valorHora, double valorAdicional) {
        super(nome, horasTrabalhadas, valorHora);
        this.valorAdicional = valorAdicional;
    }


    @Override
    public double Pagamentos() {

        double valor =  super.Pagamentos();

        valor += this.valorAdicional * 1.10 ;
        return valor;
    }
}
