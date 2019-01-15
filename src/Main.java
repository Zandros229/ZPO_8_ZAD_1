import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Main {
    public static void plik(ArrayList<String> args) throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("kol.txt");
        for (String s:args
             ) {
            zapis.println(s);
        }
        zapis.close();
    }
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
        Method methods[] = java.util.LinkedList.class.getDeclaredMethods();
        try {
            for (Method m : methods) {
                m.getReturnType();
                if (m.getName().contains("scan")) {
                    m.invoke(m.getDeclaringClass().newInstance(),temp);
                    System.out.println(" ");
                }
            }
        }catch (Exception e)
        {
            System.out.println("cos sie popsulo");
        }
        ArrayList<Method> list=new ArrayList<Method>();
        try {
            for (Method m : methods) {
               list.add(m);
            }
        }catch (Exception e)
        {
            System.out.println("cos sie popsulo");
        }
        Comparator<Method> methodComparator=Comparator.comparing(Method::getReturnType, Comparator.comparing(Class::getName)).thenComparing(Method::getParameterCount);
        list.sort(methodComparator);
        ArrayList<String> zapis=new ArrayList<String>();
        try {
            for (Method m : list) {
                System.out.println(m.getReturnType().getName() + " " + m.getName() + " " + m.getParameterCount());
                zapis.add(m.getReturnType().getName() + " " + m.getName() + " " + m.getParameterCount());
            }
            plik(zapis);
        }catch( FileNotFoundException e){
            e.printStackTrace();
        }


    }
}

