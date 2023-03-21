import java.util.Random;

class Q3{

  public static void main(String[] args) {
        Random rand = new Random();
       //ESTAGIO I
      int d1 = rand.nextInt(5) + 1;
      int d2 = rand.nextInt(5) + 1;
      int ponto = d1 + d2;
      System.out.println("Ponto: " +ponto);
      if(ponto == 7 || ponto == 11){
        System.out.println("Parabens, voce venceu !!!");
        System.exit(1);
      }
      if(ponto == 2 || ponto == 3 || ponto == 12){
        System.out.println("Infelizmente voce perdeu !!!");
       System.exit(1);
      }
       System.out.println("INICIANDO ESTAGIO 2");
      //ESTAGIO II
      int jogadas = 1;
      while(true){
        d1 = rand.nextInt(5) + 1;
        d2 = rand.nextInt(5) + 1;
         System.out.println("JOGADA "+jogadas +":");
         System.out.println("DADO 1: "+d1 +"\n" + "DADO 2: "+d2);
         jogadas++;
         
        if( (d1 + d2) == ponto){
          System.out.println("Parabens, voce venceu !!!");
          System.exit(1);
        }
        if( (d1 + d2) == 7){
          System.out.println("Infelizmente voce perdeu !!!");
          System.exit(1);
        }
      }   
   }
}  