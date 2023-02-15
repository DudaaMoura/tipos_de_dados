public class EstruturaDeRepeticao {
        /*Primeiro exercício: Imprima os números de 150 a 300;
         * for(int i=150; i<300;i++){
            System.out.println(i);
        }
         */
        /*Segundo Exercício: Soma do 1 ao 1000;
         *  int soma = 0;

        for(int i=1; i<=1000; i++){
            soma = soma +i;
        }
        System.out.println(soma);
         */
        /*Terceiro Exercício: Multíplos de 3, entre 1 e 100;
         * for(int i=0;i<=100;i+=3){
            System.out.println(i);

        }
         */
    public static void main(String[] Dudis){

        int fat = 1;
        for(int i = 0; i <= 1; i--){
            if(i ==0){
                fat = 1;
                break;
            }else{
                fat = i * fat;
            }
        }

        System.out.println(fat);

    }
    
}
