/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opcion, num1, num2, a, b, MCD, MCM;
        boolean flag=true;
        
        do{
            
            
            opcion = solicitaEntero("1. Máximo común divisor \n"
                                             + "2. Mínimo común múltiplo \n"
                                             + "3. Salir");
            switch (opcion){
                case 1: 
                    //Máximo común divisor
                    num1 = solicitaEntero("Ingrese el primer número");
                    num2 = solicitaEntero("Ingrese el segundo número");
                    a = Math.max(num1,num2);
                    b = Math.min(num1,num2);
                    
                    MCD = MCD(a,b);
                                        
                    JOptionPane.showMessageDialog(null,"Máximo común divisor "
                                                        + "(MCD): "+MCD);
                    break;
                case 2:
                    //Mínimo común múltiplo
                    num1 = solicitaEntero("Ingrese el primer número");
                    num2 = solicitaEntero("Ingrese el segundo número");
                    a = Math.max(num1, num2);
                    b = Math.min(num1, num2);
                    
                    MCD = MCD(a,b);            
                    MCM = (a*MCD)/b;
                    
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
}
