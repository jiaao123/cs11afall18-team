public class BingoDemo{
public static int[] rows = new int[25];
public static int[] columns= new int[25];
public static final int bingo = 1;
  public static void main (String[]args){
        int operator=0
	int number=10;
	int count = 0;
	//play the game
	while (number!=0){
    	int[][] board=bingoBoard();
	System.out.println("Enter a number or enter 0 to quit");
  	number = TextIO.getlnInt();
        int[] location=test(board,number);
        rows[count]= location[0];
        columns[count]= location[1];
        count++;
        System.out.println("Enter a number or enter 0 to quit");
      	}
	if(number==1){
  	System.out.println("Check bingo");
	}
      operator = checkRows(rows);
      if(operator==1){
      	print();
      }
      operator = checkColumns(columns);
      if(operator==1){
	 print();
      }
      operator = checkDiagnoal(rows,columns);
      if(operator==1){
         print();
      }
}//end of main;


  public static int[][] bingoBoard(){
    int[][] Board = new int[5][5];
    java.util.Random rand = new java.util.Random();
    for(int i = 0; i < Board.length; i++) {
      for(int a=0; a< Board.length;a++){
        Board[i][a] = rand.nextInt(25);
      }
    }return Board;
  }//end of bingoBoard



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

  }//end of printSquare



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
      if (num == board[i][j]){
        location[0] = i;
        location[1] = j;
      }else{
      }
    }
  }
  return location;
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

}//end of the class
