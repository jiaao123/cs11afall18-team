import java.util.Scanner;
public class BingoDemo{
  public static void main (String[]args){
    Scanner console = new Scanner(System.in);


    int[] board=bingoBoard();
    int number=1;
    int[] store=new int[25];
    while (number!=0){
    System.out.println("Enter a number or enter 0 to quit");
    number = console.nextInt();
      int location=test(board,store, number);
      store[location]=100;
      rows(store);
    }

  }

  public static int test(int[] board,int[] store,int number){
    int loc=0;
    for(int i=0;i<board.length;i++){
      if(number==board[i]){
      loc=i;
      int column=(loc+1)%5;
      if(column==0){
        column=5;
      }
      System.out.printf("(%d, %d)%n",((i)/5)+1,column);
     //System.out.println(store[i]);

      }
    }
    return loc;
  }




  public static int[] bingoBoard(){
    int[] Board = new int[25];
    java.util.Random rand = new java.util.Random();
    for(int i = 0;i < Board.length; i++) {
      Board[i] =rand.nextInt(25);
      }return Board;
  }//end of bingoBoard


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


  public static void rows(int[] store){
    if(store[0]==100&&store[5]==100&&store[10]==100&&store[15]==100&&store[20]==100){
      printBingo();
    }if(store[1]==100&&store[6]==100&&store[11]==100&&store[16]==100&&store[21]==100){
      printBingo();
    }if(store[2]==100&&store[7]==100&&store[12]==100&&store[17]==100&&store[22]==100){
      printBingo();
    }if(store[3]==100&&store[8]==100&&store[13]==100&&store[18]==100&&store[23]==100){
      printBingo();
    }if(store[4]==100&&store[9]==100&&store[14]==100&&store[19]==100&&store[24]==100){
      printBingo();
    }if(store[0]==100&&store[1]==100&&store[2]==100&&store[3]==100&&store[4]==100){
      printBingo();
    }if(store[5]==100&&store[6]==100&&store[7]==100&&store[8]==100&&store[9]==100){
      printBingo();
    }if(store[10]==100&&store[11]==100&&store[12]==100&&store[13]==100&&store[14]==100){
      printBingo();
    }if(store[15]==100&&store[16]==100&&store[17]==100&&store[18]==100&&store[19]==100){
      printBingo();
    }if(store[20]==100&&store[21]==100&&store[22]==100&&store[23]==100&&store[24]==100){
      printBingo();
    }if(store[0]==100&&store[6]==100&&store[12]==100&&store[18]==100&&store[24]==100){
      printBingo();
    }if(store[4]==100&&store[8]==100&&store[12]==100&&store[16]==100&&store[20]==100){
      printBingo();
    }
  }//end of rows;

}//end of the class
