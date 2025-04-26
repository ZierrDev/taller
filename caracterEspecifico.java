public class caracterEspecifico {
    public static int buscarCaracter(char caracter, String texto){
        //Verifica si la cadena esta vacia
        if (texto.isEmpty()) {
            return 0;
        }
        
        //Contador y llamada recursiva
        int suma;
        
        if (texto.charAt(0) == caracter) {
            suma = 1;
        } else {
            suma = 0;
        }
        return suma + buscarCaracter(caracter, texto.substring(1));

    }
public static void main(String[] args) {
    System.out.println(buscarCaracter('o', "programacion"));

    
}
}
