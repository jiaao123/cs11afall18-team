public class BingoDemo{
  public static void main (String[]args){
	int Continue=1;
	  int[][] board=new int[5][5];
	while (Continue==1){
    	board[][]=bingoBoard();
  	//play the game
  	System.out.println("* * *       *****     	*         	*         	*********        	*********             	");
  	System.out.println("*   	*      	*       	* *       	*       	*                	*          	*	");
  	System.out.println("*     	*    	*       	*   *     	*      	*                	*              	*       	");
  	System.out.println("*    	*     	*        	*  	 *     	*      	*                	*             	*    	");
  	System.out.println("* *	*       	*       	*    	* 	  *      	*                	*             	*    	");
  	System.out.println("*    	*     	*       	*       *   *      	*    	******* 	  *             	*   	");
  	System.out.println("*      	*   	*       	*       	* *      	*         	*    	*             	*   	");
  	System.out.println("*     	*    	*       	*         	*       	*       	*     	*         	*");
  	System.out.println("* * *      	*****     	*         	*         	**********       	*********         	");
  	System.out.println("Do you want to play Bingo again?");
System.out.println("If so, please enter 1");
  	Continue=TextIO.getlnInt();
	}
	if(Continue!=1){
  	System.out.println("quit the game");
	}
    }
  }
}



  public static int[][] bingoBoard(){
    int[][] Board = new int[5][5];
    java.util.Random rand = new java.util.Random();
    for(int i = 0; i < Board.length; i++) {
      for(int a=0; a< Board.length;a++){
        Board[i][a] = rand.nextInt(50);      
      }
    }
  }


public static final int bingo = 1;
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
}//end of the class
