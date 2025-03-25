
package com.mycompany.switchcase;

public class SwitchCase {

    public static void main(String[] args) 
    {
        
        int dia = 3;
        
        switch( dia )
        {
            case 1 :
                System.out.printf("Domingo");
            break;
                    
            case 2 :
                System.out.printf("Segunda");
            break;
                    
            case 3 :
                System.out.printf("Terça");
            break;
            
            default :
                System.out.println("Outro dia");
        }
        
        char letra = 'A';
        
        switch( letra )
        {
            case 'A' :
                System.out.printf("Esta é a letra A");
            break;
                    
            case 'B' :
                System.out.printf("Esta é a letra B");
            break;
                    
            case 'C' :
                System.out.printf("Esta é a letra C");
            break;
            
            default :
                System.out.println("Esta é outra letra");
        }
        
        String comida = "arroz";
        
        switch( comida )
        {
            case "fruta" :
                System.out.printf("saudavel");
            break;
                    
            case "doce" :
                System.out.printf("bom mas não em grandes quantidades");
            break;
                    
            case "arroz" :
                System.out.printf("simples mas saudavel");
            break;
            
            default :
                System.out.println("Esta é outra comida");
        } 
        
        int mes = 8;
        
        switch( mes )
        {
            case 12 :
                
            case 1 :            
            case 2 :
                System.out.printf("Verão");
            break;
            
            case 3 :
            case 4 :      
            case 5 :
                System.out.printf("Outono");
            break;
            
            case 6 :
            case 7 :
            case 8 :
                System.out.printf("Inverno");
            break;
            
            case 9 :
            case 10 :
            case 11 :
                System.out.printf("Primavera");
            
            default :
                System.out.println("Mes invalido");
        } 
    }
}
