package Holly;
import java.util.ArrayList;
public class Pascal{
public static void main(String [] args){

ArrayList<Integer> L1 = new ArrayList<Integer>();
L1.add(1);
System.out.println(L1);
int rows = 0;
for(int i= 1;i <= rows;i++){

ArrayList<Integer> thisRow= new ArrayList<Integer>();
thisRow.add(L1.get(0)); 
for(int j= 1;j < i;j++){

thisRow.add(L1.get(j - 1) + L1.get(j));
}
thisRow.add(L1.get(0)); 
L1= thisRow;
System.out.println(thisRow);
}
}
}
