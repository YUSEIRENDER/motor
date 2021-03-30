public class MotorDemo 
{
    
    public static void main(String[] args) 
    {
        Motor m[] = new Motor[5];
        
        m[0] = new Motor("BMW",2.0,true);
        m[1] = new Motor("AUDI",2.0,true);
        m[2] = new Motor("FIAT",1.3,true);
        m[3] = new Motor("CITROEN",1.6,false);
        m[4] = new Motor("TOYOTA",2.0,false);
            
            for(Motor mot1:m)
            {
                
                if(mot1.equals(mot1))
                {
                    
                    mot1.mostrar();
                    
                }    
                
            }    
    }
    
}
