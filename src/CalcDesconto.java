public class CalcDesconto {
    String nome;
    String matricula;

    public void calcularDesconto(int idade){
        double precoBase = 100.0;
        double desconto = 0.0;

        if (idade < 18) {
            desconto = 0.2;
        } else if (idade >= 18 && idade <= 25){
            desconto = 0.1;
        }
        double valorFinal = precoBase - (precoBase * desconto);

        System.out.println("Idade do aluno: "+ idade + "anos");
        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        System.out.println("Valor final da mensalidade: R$" + valorFinal );
    }
    public static void main(String[] args){
        CalcDesconto aluno = new CalcDesconto();
        aluno.nome="Davyd kennyd";
        aluno.matricula = "20231038060028";

        int idade = 19;
        aluno.calcularDesconto(idade);
    }
}
