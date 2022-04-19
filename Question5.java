import java.util.HashMap;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int[] list = new int[count];
    for(int i = 0 ; i < count; i ++){
      int number = in.nextInt();
      list[i] = number;
    }

    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    int max_count = 1;
    int max = 0;
    for(int i = 0 ; i < count ; i ++){
      if(hm.get(list[i]) != null){
        int val = hm.get(list[i]);
        val++;
        hm.put(list[i],val);

        if(val > max){
          max_count = val;
          max = list[i];

        }
      }
      else{
        hm.put(list[i],1);

      }
    }
    System.out.println(max);
    in.close();
  }
}
