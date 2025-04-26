public class Palindromo {

    public static boolean esPalindromo(String palabra) {
        //si la longitud es 0 o 1 es palíndromo
        if (palabra.length() <= 1) {
            return true;
        }
        // Comparar primera y última letra
        if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) {
            return false;
        }
        //sin la primera y última letra
        return esPalindromo(palabra.substring(1, palabra.length() - 1));
    }

    public static void main(String[] args) {
        String entrada = "reconocer";
        System.out.println(esPalindromo(entrada)); 
    }
}