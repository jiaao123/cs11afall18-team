public class BingoDemo{
public static int[] rows = new int[25];
public static int[] columns= new int[25];
public static final int bingo = 1;
  public static void main (String[]args){
	int Continue=1;
	  int[][] board=new int[5][5];
	while (Continue==1){
    	board[][]=bingoBoard();
  	//play the game
	System.out.println("Enter a number or enter 0 to quit");
  	int number=0;
  	int count = 0;
  	number = TextIO.getlnInt();
  	while (number!=0){
        	int[] location=test(board,number);
        	row[count]= location[0];
        	column[count]= location[1];
        	count++;
        	System.out.println("Enter a number or enter 0 to quit");
        	number = TextIO.getlnInt();
      	}
      System.out.println("*   *            *****         *             *             *********            *********                 ");
      System.out.println("*       *          *           * *           *           *                    *           *    ");
      System.out.println("*         *        *           *   *         *          *                    *             *           ");
      System.out.println("*        *         *           *     *       *          *                    *             *        ");
      System.out.println("* *    *           *           *       *     *          *                    *             *        ");
      System.out.println("*        *         *           *         *   *          *        *****       *             *       ");
      System.out.println("*          *       *           *           * *          *            *       *             *       ");
      System.out.println("*         *        *           *             *           *           *        *           *");
      System.out.println("*     *          *****         *             *             **********           *********             ");
      System.out.println("Do you want to play Bingo again?");
System.out.println("If so, please enter 1");
  	Continue=TextIO.getlnInt();
	}
	if(Continue!=1){
  	System.out.println("quit the game");
	}
    }
  }


  public static int[][] bingoBoard(){
    int[][] Board = new int[5][5];
    java.util.Random rand = new java.util.Random();
    for(int i = 0; i < Board.length; i++) {
      for(int a=0; a< Board.length;a++){
        Board[i][a] = rand.nextInt(25);
      }
    }return Board;
  }
}



public static void printSquare(){

      System.out.print("     ");
      for (int i=0;i<=5;i++){
        System.out.printf("-----");//first line
      }
        System.out.println();

      for (int j=1;j<=5;j++){
        System.out.printf("%6s","|");

          for (int i=1;i<=5;i++){
            System.out.print(j+"/"+i+"  |");
          }

          System.out.println();
          System.out.print("     ");

          for (int i=0;i<=5;i++){
          System.out.printf("-----");
          }
          System.out.println();

      }
      System.out.println();

  }


public static void main(String[] args){
  int[] rows = {1,2,3,4,5};
  int[] columns={1,1,1,1,1};
  int a = checkColumns(columns);
  System.out.println(a);

}


public static int checkRows(int[] rows){
    for(int rowNumber=0;rowNumber<5;rowNumber++){
      int counter =0;
      for(int i=0;i<rows.length;i++){
        if(rows[i]==rowNumber){
          counter++;
      }
    }
      if(counter==5){
        return bingo;
     }
    }
  return 0;
}

public static int checkColumns(int[] columns){
    for(int columnNumber=0;columnNumber<5;columnNumber++){
      int counter =0;
      for(int i=0;i<columns.length;i++){
        if(columns[i]==columnNumber){
          counter++;
       }
     }
    if(counter==5){
      return bingo;
    }
  }
 return 0;
}

public static int checkDiagonal(int[] rows,int[] columns){
  int counter1=0;
  int counter2=0;
    for(int i=0;i<5;i++){
      if(rows[i]==columns[i]){
        counter1++;
      }
      if(rows[i]==(6-columns[i])){
        counter2++;
      }
    }
    if(counter1==5||counter2==5){
    return bingo;
   }
  else{
    return 0;
  }
}
public static int[] test(int[][] board,int number){
  int[] location = new int[2];
  int num = TextIO.getlnInt();
  for (int i=0; i<5; i++){
    for (int j=0; j<5; j++){
      if (num == Board[i][j]){
        location[0] = i;
        location[1] = j;
      }else{
      }
    }
  }
  return location;
}

public static int[][] bingoBoard(){
    int[][] board = new int[5][5];
    java.util.Random rand = new java.util.Random();
    for(int i = 0; i < board.length; i++) {
      for(int a=0; a< board.length;a++){
        board[i][a] = rand.nextInt(25);
      }
    }
  return board;
}
}//end of the class
































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
     //System.out.println(store[i]);

      }
    }
    return loc;
  }


  public static int[] bingoBoard(){
   int[] Board = {21,1,10,17,9,18,22,13,15,3,5,12,25,11,6,2,19,7,16,4,24,14,20,23,8};
    //  java.util.Random rand = new java.util.Random();
    //  for(int i = 0;i < Board.length; i++) {
    // Board[i] =rand.nextInt(25);
    return Board;
    }
  //}//end of bingoBoard





  public static void rows(int[] store){
    if(store[0]==100&&store[5]==100&&store[10]==100&&store[15]==100&&store[20]==100){
      System.out.println("Bingo!");
    }if(store[1]==100&&store[6]==100&&store[11]==100&&store[16]==100&&store[21]==100){
      System.out.println("Bingo!");
    }if(store[2]==100&&store[7]==100&&store[12]==100&&store[17]==100&&store[22]==100){
      System.out.println("Bingo!");
    }if(store[3]==100&&store[8]==100&&store[13]==100&&store[18]==100&&store[23]==100){
      System.out.println("Bingo!");
    }if(store[4]==100&&store[9]==100&&store[14]==100&&store[19]==100&&store[24]==100){
      System.out.println("Bingo!");
    }if(store[0]==100&&store[1]==100&&store[2]==100&&store[3]==100&&store[4]==100){
      System.out.println("Bingo!");
    }if(store[5]==100&&store[6]==100&&store[7]==100&&store[8]==100&&store[9]==100){
      System.out.println("Bingo!");
    }if(store[10]==100&&store[11]==100&&store[12]==100&&store[13]==100&&store[14]==100){
      System.out.println("Bingo!");
    }if(store[15]==100&&store[16]==100&&store[17]==100&&store[18]==100&&store[19]==100){
      System.out.println("Bingo!");
    }if(store[20]==100&&store[21]==100&&store[22]==100&&store[23]==100&&store[24]==100){
      System.out.println("Bingo!");
    }if(store[0]==100&&store[6]==100&&store[12]==100&&store[18]==100&&store[24]==100){
      System.out.println("Bingo!");
    }if(store[4]==100&&store[8]==100&&store[12]==100&&store[16]==100&&store[20]==100){
      System.out.println("Bingo!");
    }
//end of rows;
  }
}//end of the class

