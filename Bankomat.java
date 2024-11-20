/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankomat;

/**
 *
 * @author Václav
 */
import java.util.*;
public class Bankomat {
static Scanner scanner = new Scanner(System.in);
   
    private static int zustatek;
  
    public static int ulozit(){
  
          int castka;
              System.out.println("Zvolte částku");
       castka =scanner.nextInt();
     zustatek += castka;
    
   return(zustatek);
        
        
    }
    public static void vypisZustatek(){
            System.out.println(zustatek);
        }

   
    public static int vyber(){
     int castka;
        System.out.println("Zvolte částku");
       castka =scanner.nextInt();
     zustatek -= castka;
    
   return(zustatek);
    
    }
  
   
   
   
           public static void main(String[] args) {
       int menu;
       System.out.println("Dobrý den vložte kartu");
       System.out.println("Dobrý den zadejte  pin");
       System.out.println("");
       Date date = new Date();
        int pin = scanner.nextInt();
                if(pin == 123){
               
               
                    System.out.println(date+"");
                
                
                
        do {
                System.out.println("Zvolte možnost"
                + "\n1 pro ulozit částku"
                + "\n2 pro vyběr "
                + "\n3 pro stav konta"
                + "\n4 pro konec");
                      menu = scanner.nextInt();
            switch(menu){
        
            case 1:
         
                ulozit();
                System.out.println(zustatek);
              
                break;
        
            case 2:
        
                 vyber();
                System.out.println(zustatek);
                 break;
            case 3:
                vypisZustatek(); 
                
                break;
            case 4:
                
                break;
            default:                System.out.println("Vyberte jinou možnost");   
                     }             
            System.out.println("zpět do menu ");
        }while(menu != 4);System.out.println(menu);        
                           
                
                }else{System.out.println("Nesprávné heslo");}
       
        System.out.println("Konec vyjmout kartu");
        
        }
        
         }
 
        
        
         
  
  
  
  
     

   
 

