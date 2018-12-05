public class BingoDemo{
public static int[] rows = new int[50];
public static int[] columns= new int[50];
public static final int bingo = 1;

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
    int[] point=test(board,number);
    addPosToArray(point);
    }
    checkEverything(rows,columns);
    System.out.println(java.util.Arrays.toString(board));
    if(countNumber==0&&number==0){
    System.out.println("Game closed");
  }
}//end of main;
public static void addPosToArray(int[] point){
  int temp1;
  int temp2;
  int count=0;
  if(point[0]>0&&point[1]>0){
  for(int i=0;i<point.length/2;i++){
    temp1=point[2*i];
    rows[count]=temp1;
    temp2=point[2*i+1];
    columns[count]=temp2;
    count++;
  }
  for(int a=0;a<count;a++){
  System.out.println("("+rows[a]+","+columns[a]+") ");
}

}
}

public static void checkEverything(int[] rows,int[] columns){
  int operator=0;
  operator = checkRows(rows);
  if(operator==1){
    print();
  }//check rows
  else{
	operator = checkColumns(columns);
	  if(operator==1){
	    print();
	  }//check columns
	  else{
        operator = checkDiagonal(rows,columns);
        if(operator==1){
          print();
	      }
        else{
	      System.out.println("No bingo,goodbye");
	      }
      }
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



public static int[] test(int[] board,int number){
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
    int[] point1=locationToPoint(location,counter);
    int[] point=newArray(point1,counter);
    return point;
  }
  else{
      int[] noMatch={0,0};
      return noMatch;
    }
}//end of test

public static int[] locationToPoint(int[] location,int counter){
  int point1[]=new int[50];

  for(int a=0;a<=counter;a++){
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
    point1[2*a]=row;
    point1[2*a+1]=column;
  }
  return point1;
}//end of locationToPoint


 public static int[] newArray(int[] point1,int counter){
   int[] point=new int[counter*2];
   int temp3=0;
   for(int b=0;b<counter*2;b++){
     temp3=point1[b];
     point[b]=temp3;
   }
   return point;
 }//end of newArray
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
