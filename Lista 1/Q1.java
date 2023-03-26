public class Q1 {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        int c = 15;
        
        System.out.println("====== Questão 2 do slide 57 =====");
        int resultado1 = a + b * c; // Multiplicação tem precedência sobre soma
        System.out.println("Resultado 1: " + resultado1); // Resultado deve ser 155
        
        int resultado2 = (a + b) * c; // Parênteses têm precedência sobre os demais operadores
        System.out.println("Resultado 2: " + resultado2); // Resultado deve ser 225
        
        int resultado3 = b % a + c / a; // Módulo tem precedência sobre divisão, que tem precedência sobre soma
        System.out.println("Resultado 3: " + resultado3); // Resultado deve ser 3
        
        int resultado4 = (b % a) + (c / a); // Parênteses garantem a ordem correta de avaliação
        System.out.println("Resultado 4: " + resultado4); // Resultado deve ser 3
        
        boolean resultado5 = a == b || c > b && c < a; // && tem precedência sobre ||
        System.out.println("Resultado 5: " + resultado5); // Resultado deve ser false
        
        boolean resultado6 = (a == b || c > b) && c < a; // Parênteses garantem a ordem correta de avaliação
        System.out.println("Resultado 6: " + resultado6); // Resultado deve ser false

        
        System.out.println("\n====== Questão 3 do slide 57 =====");
        int maior = (a > b) ? a : b; // Se a > b, retorna a, caso contrário, retorna b
        System.out.println("O maior número é: " + maior); // Resultado deve ser 10
        
        int menor = (a < b) ? a : b; // Se a < b, retorna a, caso contrário, retorna b
        System.out.println("O menor número é: " + menor); // Resultado deve ser 5
        
        String mensagem = (a > b) ? "A é maior que B" : "B é maior que A"; // Se a > b, retorna a primeira mensagem, caso contrário, retorna a segunda
        System.out.println(mensagem); // Resultado deve ser "B é maior que A"
        
        boolean condicao = (a == b) ? true : false; // Se a igual a b, retorna true, caso contrário, retorna false (mas a própria expressão já é uma condição, então não faz muito sentido usá-la)
        System.out.println("A igual a B? " + condicao); // Resultado deve ser "A igual a B? false"
    }

}
