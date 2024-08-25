


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Array numbers = new Array(3);
     numbers.insert(3);
     numbers.insert(5);
     numbers.insert(1);
     numbers.insert(66);
     numbers.insert(44);
     numbers.insert(87);
        numbers.print();
        System.out.println("before-----");
     numbers.removeAt(2);
        System.out.println("after-------");
     numbers.print();
    }
}