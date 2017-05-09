/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiadaexamenp;
import javax.swing.JOptionPane;
/**
 *
 * @author normaledezma
 */
public class EstudiadaExamenP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, num1, num2, a, b, MCD, MCM;
        boolean flag=true;
        int []arreglo= new int[2];
        do{
            
            
            opcion = solicitaEntero("1. Máximo común divisor \n"
                                             + "2. Mínimo común múltiplo \n"
                                             + "3. Salir");
            switch (opcion){
                case 1: 
                    //Máximo común divisor
                  arreglo= solicitardatos();
                 
                    MCD = MCD(arreglo[0],arreglo[1]);
                                        
                    JOptionPane.showMessageDialog(null,"Máximo común divisor "
                                                        + "(MCD): "+MCD);
                    break;
                case 2:
                    //Mínimo común múltiplo
                  
                   arreglo= solicitardatos();
                    MCD = MCD(arreglo[0],arreglo[1]);            
                    MCM = (arreglo[0]*arreglo[1])/MCD;
                    
                    JOptionPane.showMessageDialog(null,"Mínimo común múltiplo "
                                                        + "(MCM): "+MCM);        
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Adiós!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
    public static int solicitaEntero(String mensaje){
        String dato;
        int numero=0;
        boolean flag;
        do{
            try{
                dato = JOptionPane.showInputDialog(null,mensaje);
                numero = Integer.parseInt(dato);
                flag = false;
            } catch (Exception ex){
                flag = true;
            }
        } while (flag);
        
        return numero;
    }
    public static int MCD(int a, int b){
        int MCD;
        do{
            MCD=b;
            b=a%b;
            a=MCD;
        } while (b!=0);
                
        return MCD;
    }
    public static int [ ] solicitardatos (){
	int [ ] arreglo = new int [2];
        int a,b;
	int  num1 = solicitaEntero("Ingrese el primer número");
        int  num2 = solicitaEntero("Ingrese el segundo número");
	 a = Math.max(num1,num2);
         b = Math.min(num1,num2);

arreglo[0]=a;
arreglo [1]=b;

return arreglo;


}
}
