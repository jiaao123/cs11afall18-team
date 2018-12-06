import java.util.Random;
import java.util.Scanner;

public class BingoGame{
  public static int[] location=new int[25];
  public static int count=0;
  public static void main(String[] args){
    boolean keepGoing=true;

    while(keepGoing){
    emptyLocation();
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the range of the bingo board(Enter a positive integer)?");
    int range=sc.nextInt();
    int[] board=boardGenerator(range);
    int number=1;

    while (number!=0){
     Scanner sc2=new Scanner(System.in);
     System.out.println("Enter a number or enter 0 to quit");
     number = sc2.nextInt();
     if(number>0){
     test(number,board);
     printBoard(board);
     boolean operator=check();
     if(operator){
        System.out.printf("%n Bingo %n");
        printBingo();
        number=0;
        }
      }
    }//end of game
  Scanner sc1=new Scanner(System.in);
  System.out.println("Wanna play another round? true or false");
  keepGoing = sc1.nextBoolean();
  }//end of the recursive loop
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

public static void emptyLocation(){
  for(int i=0;i<location.length;i++){
    location[i]=0;
  }
}//end of emptyLocation

}
//end of class
