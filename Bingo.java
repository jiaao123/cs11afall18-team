public class BingoDemo{
public static int[] rows = new int[50];
public static int[] columns= new int[50];
public static int count=0;

  public static void main (String[]args){
	int number=1;
  int countNumber=0;
  int range=0;
	//play the game
  System.out.println("Enter the range of the board");
  range=TextIO.getlnInt();
  int[] board=bingoBoard(range);

	while (number!=0){
	  System.out.println("Enter a number or enter 0 to quit");
  	number = TextIO.getlnInt();
    countNumber++;
    if(number!=0){
    test(board,number);
    checkEverything(rows,columns);
     }
    }

    System.out.println("The board is "+java.util.Arrays.toString(board));
    if(countNumber==0&&number==0){
    System.out.println("Game closed");
  }

}//end of main;

public static void checkEverything(int[] rows,int[] columns){
  int operator1=0;
  int operator2=0;
  int operator3=0;
  operator1 = checkRows(rows);
  operator2 = checkColumns(columns);
  operator3 = checkDiagonal(rows,columns);


  if(operator1==1||operator2==1||operator3==1){
    print();
  }
  else{
    System.out.println("no bingo");
  }

}

  public static int[] bingoBoard(int range){
    int temp=0;
    int[] Board = new int[25];
    java.util.Random rand = new java.util.Random();
    for(int i=0;i<Board.length;i++){
      temp=(rand.nextInt(range));
      Board[i]=temp+1;
    }
    return Board;
  }//end of bingoBoard

public static int checkRows(int[] rows){
    int counter0=0;
    for(int rowNumber=1;rowNumber<6;rowNumber++){
      int counter =0;
      for(int i=0;i<rows.length;i++){
        if(rows[i]==rowNumber){
          counter++;
          if(counter==5){
            counter0++;
      }
     }
     }
    }
  if(counter0>0){
    return 1;
  }
  else{
    return 0;
  }
}

public static int checkColumns(int[] columns){
    int counter0 =0;
    for(int columnNumber=1;columnNumber<6;columnNumber++){
    int counter=0;
      for(int i=0;i<columns.length;i++){
        if(columns[i]==columnNumber){
          counter++;
          if(counter==5){
            counter0++;
         }
       }
     }
    }
    if(counter0>0){
      return 1;
  }
  else{
 return 0;
}
}

public static int checkDiagonal(int[] rows,int[] columns){
  int counter1=0;
  int counter2=0;
    for(int i=1;i<6;i++){
      if(rows[i]==columns[i]){
        counter1++;
      }
      if(rows[i]==(6-columns[i])){
        counter2++;
      }
    }
    if(counter1==5||counter2==5){
    return 1;
   }
  else{
    return 0;
  }
}



public static void test(int[] board,int number){
  int location[]=new int[25];
  int counter=0;
  for(int i=0;i<board.length;i++){
    if(number==board[i]){
      int temp4=i;
      location[counter]=temp4;
      counter++;
    }
  }
  if(counter>0){
    locationToPoint(location,counter);
  }
  else{
    System.out.println("no match");
    }
}//end of test

public static void locationToPoint(int[] location,int counter){

  int a=0;
  while(a<counter){
    int lo=location[a];
    int row=0;
    int column=0;
    if(0<=lo&&lo<=4){
      row=1;column=lo+1;
    }
    else if(5<=lo&&lo<=9){
      row=2;column=lo-5+1;
    }
    else if(10<=lo&&lo<=14){
      row=3;column=lo-10+1;
    }
    else if(15<=lo&&lo<=19){
      row=4;column=lo-15+1;
    }
    else{
      row=5;column=lo-20+1;
    }
    rows[count]=row;
    columns[count]=column;
    count++;
    System.out.println("("+row+","+column+")");
    a++;
  }

}//end of locationToPoint

  public static void print(){
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
}//end of the class
