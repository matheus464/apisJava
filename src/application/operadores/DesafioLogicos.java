package application.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        //trabalho na terça (V ou F)
        //trabalho na quinta (V ou F)   se os dois derem certo comprar tv de 50 polegadas no fds ou se um deles derem certo comprar tv de 32 polegadas

        //trabalho de terça deu certo!
        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv = trabalho1 && trabalho2;
        comprouTv = trabalho1 || trabalho2;
        comprouTv = trabalho1 && trabalho2;
        comprouTv = trabalho1 ^ trabalho2;
        comprouTv = !trabalho1 != trabalho2;




        System.out.println("comprou TV 32\"? " + comprouTv);
        System.out.println("comprou Tv 50\"? " + comprouTv);
        System.out.println("comprou Tv 50\"? " + comprouTv);
        System.out.println("comprou Tv 50\"? " + comprouTv);
        System.out.println("comprou Tv 50\"? " + comprouTv);



    }
}
