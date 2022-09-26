import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {
    List<String> list;
    public HalloJavamitForEach(List<String> list){
        this.list=list;

        printList(list);

        list.forEach((String s)-> System.out.println(s));

        Consumer<String> consumer=(String s) -> System.out.println(s);

        list.forEach(System.out::print);

    }



    public void printList(List<String> stringList){
        for (String s:stringList) {
            System.out.println(s);
        }
    }
}
