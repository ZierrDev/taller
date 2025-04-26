public class App {

    public static void imprimirDescendt(int n){
        if(n < 1){ //Limte para evitar bucle infinito
            return;
        }
        System.out.println(n);
        imprimirDescendt(n-1);//Impresion en decenso


    }
    
    public static void main(String[] args) throws Exception {
    imprimirDescendt(100);
    }

}
