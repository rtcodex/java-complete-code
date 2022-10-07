//program 14

public class continuebreak{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.println(i);
          }

          System.out.println("Above is Break\nBelow is Continue");

          for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
          }
          
    }
}