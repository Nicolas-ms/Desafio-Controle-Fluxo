import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int num1 = sc.nextInt(); 
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();
        System.out.println();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());;
            
        }
        sc.close();
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{   
        if(num1 >= num2){
            throw new ParametrosInvalidosException();
        } 
        int contando = num2 - num1;
        for(int i = 1; i <= contando; i++){
            System.out.println("Imprimindo " + i);
        }        
    
    }
    
    
    
}
