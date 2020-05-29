public class PruebaCola {
    public static void main(String args[]){
        int num=0;
        ColaNumEntero cl=new ColaNumEntero(3);
        try{
         cl.encolar(1);
        num=cl.sacar();
        System.out.println(num);
        num=cl.sacar();
        System.out.println(num);
         
        }catch( ExcepcionColaLlena err){
            System.out.println(err.getMessage()); 
        }catch(ExcepcionColaVacia err){
            System.out.println(err.getMessage());
        }
    }
}
