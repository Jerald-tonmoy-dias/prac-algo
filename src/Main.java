import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(25);
//        System.out.println(list.indexOf(258));
        System.out.println(list.contains(250));
    }
}