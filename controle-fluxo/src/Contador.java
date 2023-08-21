import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        int parametroUm;
        int parametroDois;

        System.out.println("Digite o primeiro numero:");
        parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo numero:");
        parametroDois = terminal.nextInt();

        try {
            
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }


    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		
        for(int i = 1; i <= contagem; i++){
            System.out.println("Numero: " + i);
        }
	}
    
}
