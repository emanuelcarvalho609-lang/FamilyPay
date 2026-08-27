public class Responsavel {
    private String nome;

    public Responsavel(String nome) {
        this.nome = nome;
    }


    public void aprovarCompra(Filho filho){
        if (filho.getStatus() == StatusCompra.PENDENTE) {
        filho.alterarStatus(StatusCompra.APROVADA);

        System.out.println("Compra de R$ " + filho.getValorSolicitacao()
                + " do filho " + filho.getnome() + " foi aprovada.");
        }else {
            System.out.println("A compra não está pendente.");
        }
    }




    public void rejeitarCompra(Filho filho) {
        if (filho.getStatus() == StatusCompra.PENDENTE) {
            filho.alterarStatus(StatusCompra.REJEITADA);

            System.out.println("Compra de R$ " + filho.getValorSolicitacao()
                    + " do filho " + filho.getnome() + " foi rejeitada.");
        }else {
            System.out.println("A compra não está pendente.");
        }
    }

}