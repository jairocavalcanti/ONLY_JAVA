package ENCAPSULAMENTO.Exercicio8;

public class Principal {
    public static void main(String[] args) {
        BancoDeDados ban = new BancoDeDados();

        ban.adicionarusuario("1203", "jairo", 120);
        ban.depositarcreditos("1203", 100);
        ban.sacarcreditos("1203", 20);

        ban.ConsultarCreditos("1203");

    }
}
