/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigocesar;
import java.util.Scanner;
/**
 * @author Edgar Andres Krejci Bautista, Michael Leandro Cardenas
 * @version 1.0
 * @since codigoCesar v 1.0
 */
public class CodigoCesar {
    /**
     * variable global que almacena los caracteres leidos para codificar o decodificar la oracion
     */
    char frase[];
    /**
     * Variable encargada de almacenar la clave para cifrar o descifrar la oracion segun sea el caso 
     */
    int clave;
    /**
     * Variable encargada de recibir la peticion del usuario para determinar si se desea codificar o decodificar
     */
    byte desea;
    /**
     * Variable en donde se almacena la oracion a convertir segun sea el caso
     */
    String lectura;
    /**
     * Variable encargada de almacenar el valor numerico del caracter a codificar o decodificar 
     */
    int auxiliar;
    /**
    *Constructor que llama a los metodos menu,codificar y decodificar
    * @since codigoCesar v 1.0
    */
    public CodigoCesar(){
        menu();
        codificar();
        decodificar();
    }
    /**
    *Metodo que se encarga de preguntarle al usario que desea hacer si codificar o decodificar
    */
    private void menu(){
        System.out.println ("SI DESEA CODIFICAR UN MENSAJE DIGITE 1, EN CASO DE QUE DESEE DECODIFICARLO DIGITE 2");
        Scanner sc =new Scanner (System.in);
        desea=sc.nextByte();    
    }
    /**
    *Metodo que se encarga de leer y codificar la informacion deseada segun sea el caso
    */
    private void codificar(){
       
        if (desea==1){
            System.out.println("INGRESE LA ORACION A CODIFICAR");
            Scanner sc=new Scanner(System.in);
            lectura= sc.nextLine();
            lectura =lectura.toLowerCase();
            frase= lectura.toCharArray();
            System.out.println("INGRESE LA CLAVE");
            clave=sc.nextInt();
            for (int i=0;i<frase.length;i++){
               auxiliar=frase[i];
               auxiliar=auxiliar+clave%26;
               if (auxiliar>122){
                   auxiliar=auxiliar-122;
                   auxiliar=96+auxiliar;
               }
               pasarNumeroALerta(i);
            }
            System.out.println("SU CLAVE CODIFICADA ES");
            for (int i=0;i<frase.length;i++){
                System.out.print(frase[i]);
            }
        }
    }
    /**
     * Metodo que se encarga de leer y decodificar la frase deseada
     */
    private void decodificar(){
        if (desea==2){
            System.out.println("INGRESE LA ORACION A DECODIFICAR");
            Scanner sc= new Scanner(System.in);
            lectura= sc.nextLine();
            lectura=lectura.toLowerCase();
            frase=lectura.toCharArray();
            System.out.println("INGRESE LA CLAVE");
            clave= sc.nextInt();
            for (int i=0;i<frase.length;i++){
                auxiliar=frase[i];
                auxiliar=auxiliar-clave%26;
                if (auxiliar<97){
                    auxiliar=97-auxiliar;
                    auxiliar=123-auxiliar;
                }
                pasarNumeroALerta(i);
            }
            System.out.println("SU CLAVE DECODIFICADA ES");
            for (int i=0;i<frase.length;i++){
                System.out.print(frase[i]);
            }
        }
    }
    /**
     * Metodo que se encarga de convertir el valor numerico a su caracter ascii segun su valor numerico 
     * recibe como parametro la variable i por que se ejecuta dentro de un ciclo for para codificar o 
     * decodificar el arreglo frase
     * @param i 
     */
    private void pasarNumeroALerta(int i){
        switch (auxiliar){
                   case 97:
                       frase[i]='a';
                       break;
                   case 98:
                       frase[i]='b';
                       break;
                   case 99:
                       frase[i]='c';
                       break;
                   case 100:
                       frase[i]='d';
                       break;
                   case 101:
                       frase[i]='e';
                       break;
                   case 102:
                       frase[i]='f';
                       break;
                   case 103:
                       frase[i]='g';
                       break;
                   case 104:
                       frase[i]='h';
                       break;
                   case 105:
                       frase[i]='i';
                       break;
                   case 106:
                       frase[i]='j';
                       break;
                   case 107:
                       frase[i]='k';
                       break;
                   case 108:
                       frase[i]='l';
                       break;
                   case 109:
                       frase[i]='m';
                       break;
                   case 110:
                       frase[i]='n';
                       break;
                   case 111:
                       frase[i]='o';
                       break;
                   case 112:
                       frase[i]='p';
                       break;
                   case 113:
                       frase[i]='q';
                       break;
                   case 114:
                       frase[i]='r';
                       break;
                   case 115:
                       frase[i]='s';
                       break;
                   case 116:
                       frase[i]='t';
                       break;
                   case 117:
                       frase[i]='u';
                       break;
                   case 118:
                       frase[i]='v';
                       break;
                   case 119:
                       frase[i]='w';
                       break;
                   case 120:
                       frase[i]='x';
                       break;
                   case 121:
                       frase[i]='y';
                       break;
                   case 122:
                       frase[i]='z';
                       break;
               }
    }
    /**
     * En el metodo principal se crea un objeto que realiza las instrucciones en el construcctor
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CodigoCesar codigoCesar= new CodigoCesar();   
    }
}
