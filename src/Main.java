import person.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Person> queue = new ArrayDeque<>(generateClients());
        System.out.println(queue); // проверим очередь

        while(true) {
            if (queue.isEmpty()) {
                System.out.println("Очередь пуста, аттракцион отдыхает");
                break;
            } else {
                Person currentClient = queue.pollFirst();
                System.out.println(currentClient.getNameSurname() + " прокатился на аттракционе");
                currentClient.spendTicket();
                if (currentClient.haveTicket()) {
                    queue.offerLast(currentClient);
                }
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> filledQueue = new ArrayList<>();
        Person anna = new Person("Anna", "Brown", 3);
        Person alex = new Person("Alex", "Palex", 5);
        Person maria = new Person("Maria", "Volkova", 2);
        Person natasha = new Person("Natasha", "Popova", 6);
        Person gleb = new Person("Gleb", "Freeman", 4);
        filledQueue.add(anna);
        filledQueue.add(alex);
        filledQueue.add(maria);
        filledQueue.add(natasha);
        filledQueue.add(gleb);

        return filledQueue;
    }
}
