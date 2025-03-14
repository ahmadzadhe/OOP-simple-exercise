import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Person person = new Person("mamad mahdi",20);
        Scanner scanner = new Scanner(System.in);
        person.setName(scanner.nextLine());
        person.setAge(scanner.nextInt());
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
