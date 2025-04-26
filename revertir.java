public class revertir {
    static String invertir(String texto) {
        // n caso de estar vacio
        if (texto.length() <= 1) {
            return texto;
        }
        // Toma la ultima leta + llamada recursiva al resto
        return texto.charAt(texto.length() - 1) + invertir(texto.substring(0, texto.length() - 1));
    }

public static void main(String[] args) {
    System.out.println(invertir("hola"));
}
}
