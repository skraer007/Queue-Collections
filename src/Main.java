import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Person> deque = new ArrayDeque<>(generateClients());
        while (!deque.isEmpty()) {
            Person deletedClient = deque.poll();
            deletedClient.setTickets(1);
            System.out.println("Клиент " + deletedClient.getName() + " " + deletedClient.getSurname() +
                    " прокатился на аттракционе!\nОстаток билетов: " + deletedClient.getTickets());
            if (deletedClient.getTickets() > 0) {
                deque.offer(deletedClient);
            }
        }
    }

    public static List<Person> generateClients() {
        ArrayList<Person> clients = new ArrayList<>();
        Person person1 = new Person("Anya", "Ivanova", 1);
        Person person2 = new Person("Tanya", "Smirnova", 2);
        Person person3 = new Person("Danya", "Vavilov", 3);
        Person person4 = new Person("Petya", "Sorokin", 4);
        Person person5 = new Person("Katya", "Kirilova", 5);
        clients.add(person1);
        clients.add(person2);
        clients.add(person3);
        clients.add(person4);
        clients.add(person5);
        return clients;
    }
}