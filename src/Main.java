public class Main {
    public static void main(String[] args) {

        Filho filho1 = new Filho("Emanuel", 1);
        Responsavel responsavel1 = new Responsavel("João");


        // Teste 1 - dados do filho
        System.out.println(filho1.getnome());
        System.out.println(filho1.getNumeroDaConta());

        // Teste 2 - alterar número da conta
        filho1.setNumeroDaConta(2);
        System.out.println(filho1.getNumeroDaConta());

        // Teste 3 - solicitação válida
        filho1.solicitarCompra(150);
        System.out.println(filho1.getValorSolicitacao());
        System.out.println(filho1.getStatus());

        // Teste 4 - aprovação
        responsavel1.aprovarCompra(filho1);
        System.out.println(filho1.getStatus());

        // Teste 5 - tentar aprovar novamente
        responsavel1.aprovarCompra(filho1);

        // Teste 6 - tentar rejeitar uma compra já aprovada
        responsavel1.rejeitarCompra(filho1);

        // Teste 7 - nova solicitação com valor inválido
        filho1.solicitarCompra(-50);
    }
}