import java.util.Random;
import java.util.Scanner;

public class BingoGame{
  public static int[] location=new int[25];
  public static int count=0;


  public static void main(String[] args){
    int number=1;
    int start=1;
    Scanner sc = new Scanner(System.in);
    while (start!=0)
    System.out.println("What is the range of the bingo board?");
    int range=sc.nextInt();

    int[] board=boardGenerator(range);
    while (number!=0){
     System.out.println("Enter a number or enter 0 to quit");
     number = TextIO.getlnInt();
      test(number,board);
      printBoard(board);
      boolean operator=check();
      if(operator){
        System.out.printf("%n Bingo %n");
        printBingo();
        number=0;
      }
    }//end of while

  }//end of main
public static void test(int number,int[] board){
   for(int i=0;i<board.length;i++){
     if(number==board[i]){
       location[i]=100;
     }
   }
}//end of test

public static boolean check(){
  if(location[0]==100&&location[5]==100&&location[10]==100&&location[15]==100&&location[20]==100){
      return true;
    }else if(location[1]==100&&location[6]==100&&location[11]==100&&location[16]==100&&location[21]==100){
      return true;
    }else if(location[2]==100&&location[7]==100&&location[12]==100&&location[17]==100&&location[22]==100){
      return true;
    }else if(location[3]==100&&location[8]==100&&location[13]==100&&location[18]==100&&location[23]==100){
      return true;
    }else if(location[4]==100&&location[9]==100&&location[14]==100&&location[19]==100&&location[24]==100){
      return true;
    }else if(location[0]==100&&location[1]==100&&location[2]==100&&location[3]==100&&location[4]==100){
      return true;
    }else if(location[5]==100&&location[6]==100&&location[7]==100&&location[8]==100&&location[9]==100){
      return true;
    }else if(location[10]==100&&location[11]==100&&location[12]==100&&location[13]==100&&location[14]==100){
      return true;
    }else if(location[15]==100&&location[16]==100&&location[17]==100&&location[18]==100&&location[19]==100){
      return true;
    }else if(location[20]==100&&location[21]==100&&location[22]==100&&location[23]==100&&location[24]==100){
      return true;
    }else if(location[0]==100&&location[6]==100&&location[12]==100&&location[18]==100&&location[24]==100){
      return true;
    }else if(location[4]==100&&location[8]==100&&location[12]==100&&location[16]==100&&location[20]==100){
      return true;
    }else{
      return false;
    }

}//end of check

public static void printBoard(int[] board){
  System.out.println();
for(int i=0;i<5;i++){
  for(int a=0;a<5;a++){
    if(location[a+i*5]==100){
      System.out.printf("%4d",board[a+i*5]);
    }
    else{
      System.out.print("   *");
    }
  }
  System.out.println();
}
}//end of printBoard

public static int[] boardGenerator(int range){
  Random rand = new Random();
  int[] board=new int[25];
  for(int i=0;i<25;i++){
    int temp1=(rand.nextInt(range));
    board[i]=temp1+1;
  }
  return board;
}//end of board Generator;

public static void printBingo(){
  System.out.println("*   *            *****         *             *             *********            *********                 ");
  System.out.println("*       *          *           * *           *           *                    *           *    ");
  System.out.println("*         *        *           *   *         *          *                    *             *           ");
  System.out.println("*        *         *           *     *       *          *                    *             *        ");
  System.out.println("* *    *           *           *       *     *          *                    *             *        ");
  System.out.println("*        *         *           *         *   *          *        *****       *             *       ");
  System.out.println("*          *       *           *           * *          *            *       *             *       ");
  System.out.println("*         *        *           *             *           *           *        *           *");
  System.out.println("*     *          *****         *             *             **********           *********             ");
  }
}
//end of class
