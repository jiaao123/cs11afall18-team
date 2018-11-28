public class Bingo4{
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
