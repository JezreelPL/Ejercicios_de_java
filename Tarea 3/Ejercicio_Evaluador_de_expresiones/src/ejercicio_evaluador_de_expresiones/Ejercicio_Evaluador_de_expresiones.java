package ejercicio_evaluador_de_expresiones;
import java.util.Scanner;
public class Ejercicio_Evaluador_de_expresiones {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);    
        
     System.out.println("ESCRIBE UNA EXPRESION MATEMATICA ('Infija')");
        
     String expresion = teclado.nextLine();
        if (validarParentesis(expresion)) {
            System.out.println("Expresion equilibrada.");

            String postfija = convertirAPostfija(expresion);
            System.out.println("Postfija: " + postfija);

            double resultado = evaluarPostfija(postfija);
            System.out.println("Resultado Final: " + resultado);
        } else {
            System.out.println("Error: La expresion tiene parentesis, llaves o corchetes mal cerrados.");
        }
        

    }
    
    //Funcion para validar los [],{},()
    public static boolean validarParentesis(String expresion){
        Pila pila = new Pila(expresion.length());
        for(int i = 0; i< expresion.length(); i++){
            char c = expresion.charAt(i);
            if(c == '{' || c == '[' || c == '('){
              pila.push(c);
            }else if(c == '}' || c == ']' || c == ')'){
                if(pila.estaVacia()){
                    return false;
                }
                char apertura = pila.pop();
                if (c == ')' && apertura != '('){
                    return false;
                }
                if (c == ']' && apertura != '[') {
                    return false;
                }
                if (c == '}' && apertura != '{'){
                    return false;
                }
            }
        }
        return pila.estaVacia();
    }
    
    //Funcion para obtener el orden de las operaciones 
    public static int obtenerPrioridad(char operador) {
        if (operador == '+' || operador == '-'){
            return 1;
        }
        if (operador == '*' || operador == '/'){
            return 2;
        }
        if (operador == '^'){
            return 3;
        }
        return 0; 
    }
    //convertidor a postfijo 
    public static String convertirAPostfija(String infija) {
        String postfija = "";
        Pila pila = new Pila(infija.length());
        for (int i = 0; i < infija.length(); i++) {
            char c = infija.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                postfija += c;
            } 
            else if (c == '(' || c == '[' || c == '{') { 
                pila.push(c);
            } 
            else if (c == ')' || c == ']' || c == '}') {
                while (!pila.estaVacia() && 
                       pila.verTope() != '(' && 
                       pila.verTope() != '[' && 
                       pila.verTope() != '{') {
                    postfija += pila.pop();
                }
                pila.pop();
            } 
            else {
                while (!pila.estaVacia() && obtenerPrioridad(pila.verTope()) >= obtenerPrioridad(c)) {
                    postfija += pila.pop();
                }
                pila.push(c);
            }
        }   
        while (!pila.estaVacia()) {
            postfija += pila.pop();
        }
        return postfija;
    }
    
    //funcion para evaluar el postfijo
    public static double evaluarPostfija(String postfija) {
    PilaResultados pila = new PilaResultados(postfija.length());
    for (int i = 0; i < postfija.length(); i++) {
        char c = postfija.charAt(i);
        if (c >= '0' && c <= '9') {
            pila.push(Double.parseDouble(String.valueOf(c)));
        } 
        else if (c == '+' || c == '-' || c == '*' || c == '/') {
            double op2 = pila.pop(); 
            double op1 = pila.pop();
            double resultadoLocal = 0;

            switch (c) {
                case '+': 
                    resultadoLocal = op1 + op2; 
                    break;
                case '-': 
                    resultadoLocal = op1 - op2;
                    break;
                case '*': 
                    resultadoLocal = op1 * op2; 
                    break;
                case '/': 
                    if (op2 != 0){
                        resultadoLocal = op1 / op2;
                    }
                    break;
            }
            pila.push(resultadoLocal);
        }
    }
    return pila.pop();
}
        
}
    
