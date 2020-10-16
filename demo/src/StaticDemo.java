import java.util.HashMap;
import java.util.Map;

public class StaticDemo {
    private  static Person person=new Person();


    public static void main(String[] args) {
        Map<Person,String> map=new HashMap<>();
        map.put(person,"sss");


    }
}

class Person{
    {
        long start = System.currentTimeMillis();

        //todo

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    void f1()
}
