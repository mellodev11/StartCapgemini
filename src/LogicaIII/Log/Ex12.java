package LogicaIII.Log;


//O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
//dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
//do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
//45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
//mesmo;
public class Ex12 {
    public static void main(String[] args) {

    double custoFabrica, percentual, impostos ,som;
    percentual = 0.28;
    impostos = 0.45;
    custoFabrica =10000;
    double custoComImpostos = custoFabrica + (custoFabrica*impostos);
    double custoFinal = custoComImpostos + (custoComImpostos*percentual);

        System.out.println("O custo final ao consumidor é: R$ " + custoFinal);

    }
}
