public class Filho {

    private String nome;
    private int numeroDaConta;
    private double valorSolicitacao;
    private StatusCompra status;

    public Filho(String nome, int numeroDaConta) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.status = StatusCompra.PENDENTE;
    }
    public String getnome(){
            return nome;
    }
    public int getNumeroDaConta(){
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }
    public void solicitarCompra(double valor) {
        if(valor <= 0) {
            System.out.println("valor indisponivel");
        } else {
            valorSolicitacao = valor;
            System.out.println("Solicitação de compra no valor de R$ " + valor + " realizada.");
        }
    }
    public double getValorSolicitacao() {
        return valorSolicitacao;
    }
    public void alterarStatus(StatusCompra status) {
        this.status = status;
    }
    public StatusCompra getStatus() {
        return status;
    }
}