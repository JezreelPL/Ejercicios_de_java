package ejercicio1;
public class Tareas {
    String oracion;

       public void convertir(String oracion){
         String nuevaOracion="";
         for(int i = 0; i < oracion.length(); i++){
          char c = oracion.charAt(i);
          if(c >= 'a' && c<= 'z'){
              c= (char) (c-32);
          }
          nuevaOracion += c;
        }
        System.out.println("La oracion en mayusculas es: " + nuevaOracion);  
      }
       
       
      public void contarPalabras(String oracion){
          int contador = 0;
          boolean palabra = false;
          
          if(oracion == null || oracion.trim().isEmpty()){
              System.out.println("No hay ninguna palabra");
          }else{
              for(int i=0; i < oracion.length(); i++){
                  if(oracion.charAt(i) != ' '){
                      if(!palabra){
                      contador++;
                      palabra = true;
                      }
                      }else{
                          palabra = false;
                      } 
              }
              System.out.println("El total de palabras es: " + contador);         
          }
      }
      
      public void oracionIvertida(String oracion){
          String nuevaOracion= "";
          for(int i = oracion.length()-1; i>=0; i--){
              char c = oracion.charAt(i);
              nuevaOracion += c;
          }
          System.out.println("oracion original: " + oracion);
          System.out.println("oracion invertida: " + nuevaOracion);
      }
      
      public void contarVocales(String oracion){
          int contador = 0;
          for(int i = 0; i< oracion.length(); i++ ){
              char c = oracion.charAt(i);
              if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                  contador++;
              }
          }
          System.out.println("el numero de vocales de la oracion es de:  " + contador);
      }
      
}
