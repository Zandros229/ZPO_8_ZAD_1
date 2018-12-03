import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> temp=new ArrayList<Integer>();
        temp.add(4);
        temp.add(10);
        temp.add(3);
        temp.add(7);
        temp.add(4);
        temp.add(1);
        temp.add(6);
        temp.add(2);
        Method methods[] = AlgorithmSearch.class.getDeclaredMethods();
        try {
            for (Method m : methods) {
                if (m.getName().contains("scan")) {
                    m.invoke(m.getDeclaringClass().newInstance(),temp);
                    System.out.println(" ");
                }
            }
        }catch (Exception e)
        {
            System.out.println("cos sie popsulo");
        }


    }
}

