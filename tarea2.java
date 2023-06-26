import java.util.Random;

public class tarea1 {
    public static void main(String[] args) {
      String[] ruleta ={"jaider","jose","juan"};
      Random random = new Random();
        int random1 = random.nextInt(ruleta.length);



        System.out.println("el ganador es "+ruleta[random1]);

    }

    }




