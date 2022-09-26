import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    List<String> list=new ArrayList<>();

    public HalloJavamitForEach(List<String> list){
        this.list=list;
        
        printList(list);
    }



    public void printList(List<String> stringList){
        for (String s:stringList) {
            System.out.println(s);
        }
    }
}
