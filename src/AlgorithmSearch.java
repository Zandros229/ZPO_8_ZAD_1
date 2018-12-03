import java.util.ArrayList;
import java.util.List;

public class AlgorithmSearch {




    public void scan1(ArrayList<Integer> list){
        List<Integer> maxes = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size()-1; i++)
        {
            if(list.get(i) > max)
            {
                max = list.get(i);
                maxes.add(max);
            }
        }
        for (int a:maxes
        ) {
            System.out.print(a+" ");
        }
    }
    public void scan2(ArrayList<Integer> list){
        List<Integer> maxes = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = list.size()-1; i >= 0; i--)
        {
            if(list.get(i) > max)
            {
                max = list.get(i);
                maxes.add(max);
            }
        }
        for (int a:maxes
        ) {
            System.out.print(a+" ");
        }
    }
    public void scan3(ArrayList<Integer> list) throws Exception{
        if(list.size() < 2)
            throw new Exception("Array must contain more than 1 element");

        List<Integer> maxes = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size()-1; i+=2)
        {
            if(list.get(i)> max)
            {
                max = list.get(i);
                maxes.add(max);
            }
        }

        for(int i = 1; i < list.size()-1; i+=2)
        {
            if(list.get(i) > max)
            {
                max = list.get(i);
                maxes.add(max);
            }
        }
        for (int a:maxes
             ) {
            System.out.print(a+" ");
        }
    }
}
