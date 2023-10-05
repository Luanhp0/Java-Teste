public class nome {
    public static void main(String[] args){
        String nome;
        int idade, valor1, valor2;
        double soma, sub, div, mul;
        nome = "Luan";
        valor1 = 10;
        valor2 = 5;
        idade = 22;

        soma = valor1 + valor2;
        sub = valor1 - valor2;
        div = valor1 / valor2;
        mul = valor1 * valor2;

        System.out.println("Boa noite :" +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Vamos fazer conta ::");
        System.out.println(valor1+"+"+valor2+"= "+soma);
        System.out.println(valor1+"-"+valor2+"= "+sub);
        System.out.println(valor1+"%"+valor2+"= "+div);
        System.out.println(valor1+"X"+valor2+"= "+mul);
    }
}

