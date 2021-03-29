import java.util.Scanner;

public class MotorDemo 
{
    
    public static void main(String[] args) 
    {
        Scanner entre =  new Scanner(System.in);
        
        Motor Motvetor[] = new Motor[5];      
        
        for(int i = 0; i < Motvetor.length; i++)
        {
            
            String nome;
            double pontencia;
            boolean ligado;
            
            System.out.println("Digite o modelo do motor:");
            nome = entre.nextLine();
            
            System.out.println("Digite a potencia do motor:");
            pontencia = entre.nextDouble();
            
            System.out.println("Digite o estado atual do motor:");
            ligado = entre.nextBoolean();
            
            Motvetor[i] = new Motor(nome, pontencia, ligado);
            
        }
        
        for(int i = 0; i < Motvetor.length; i++)
        {
            
            if(Motvetor[i] = Produto(ligado));
            {
                
                
                
            }
            
            
        }
        
    }
    
}
