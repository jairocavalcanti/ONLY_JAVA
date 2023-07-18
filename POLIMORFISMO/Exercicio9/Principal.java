package POLIMORFISMO.Exercicio9;

public class Principal {
    public static void main(String[] args) {
       
        //Instanciação da classe mãe com os atributos únicos dela
        Jogos jog = new Jogos("Game name", 0.0);

        System.out.println("Nome do jogo:  " + jog.getNome());
        System.out.println("Classificacao do jogo:  " + jog.getClassificacao());

        System.out.println("----------------------------------------------------------");

        //Instanciaçao de classe que se extende á classe mãe
        //Atributos padrão da classe mãe estão definidos no connstrutor da classe 'reddeadredemption2'
        //Apenas os atributos da classe que se extende a classe mãe precisarão ser instanciados pois os padroes já estao definidos
        Jogos game = new Reddeadredemption2(100.00, 50.00);

        System.out.println("Nome do jogo:  " + game.getNome());
        System.out.println("classificaçao do game:  " + game.getClassificacao());
        System.out.println("Preco do game:  " + game.aumentarpreco());

        System.out.println("----------------------------------------------------------");

        //Estrutura abaixo segue a mesma linha de lógica da estrutura de cima
        Jogos game2 = new Fallguys(50.00, 25.00);
        System.out.println("Nome do jogo:  " + game2.getNome());
        System.out.println("Classificação do jogo:  " + game2.getClassificacao());
        System.out.println("Preco do game:  " + game2.aumentarpreco());


    }
}
