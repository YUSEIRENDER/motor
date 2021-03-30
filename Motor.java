public class Motor 
{
    
    String nome;
    double potencia;
    boolean ligado;            
    
    public Motor(String nome, double pontencia, boolean ligado) {
        this.nome = nome;
        this.potencia = pontencia;
        this.ligado = ligado;
        ligado=false;
    }
    
    public String getNome()
    {
        
        return nome;
        
    }
    
    public void setNome(String nome)
    {
        
        this.nome = nome;
        
    }
    
    public double getPotencia()
    {
        
        return potencia;
        
    }        
    
    public void setPotencia(double pontencia)
    {
        
        this.potencia = potencia;
        
    }
    
    public boolean getLigado()
    {
        
        return ligado;
        
    }
    
    public boolean setLigado(boolean ligado)
    {
        
        return this.ligado = ligado;
        
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
        
        System.out.println("|O modelo do motor é: " +nome+ "| a potencia do motor é: " +potencia+ "| e o estado do motor é: " +ligado);
        
    }        
}
