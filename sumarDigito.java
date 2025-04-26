public class sumarDigito {
    static int sumarDigitos(int numero) {
        //cuando solo queda 1 dígito
        if (numero < 10) {
            return numero;
        }
        //sumar el último dígito y llamada recursiva sin ese dígito
        return (numero % 10) + sumarDigitos(numero / 10);
    }   
     public static void main(String[] args) {
        int entrada = 1234;
        System.out.println(sumarDigitos(entrada));
    }
}
