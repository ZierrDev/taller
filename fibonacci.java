public class fibonacci {
    public static int secuencia(int n){
         //fib(0) = 0, fib(1) = 1
         if (n == 0) return 0;
         if (n == 1) return 1;
         // Llamada recursiva, (la secuencia esta formada por la suma de los numeros anteriores)
         return secuencia(n-1) + secuencia(n - 2);

    }
public static void main(String[] args) {
    System.out.println(secuencia(6));
}
}
