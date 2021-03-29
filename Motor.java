public class Motor 
{
    
    String nome;
    double pontencia;
    boolean ligado;

    public Motor(String nome, double pontencia, boolean ligado) {
        this.nome = nome;
        this.pontencia = pontencia;
        this.ligado = ligado;
        
        ligado=false;
    }
    
    
    public boolean Ligar()
    {
        
        return this.ligado = true;
        
    }
    
    public boolean Desligar()
    {
        
        return this.ligado=false;
        
    }
    
    public void mostrar()
    {
        
        System.out.println("|O modelo do motor é: " +nome+ "| a potencia do motor é: " +pontencia+ "| e o estado do motor é: " +ligado);
        
    }        
}
