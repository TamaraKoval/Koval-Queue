package person;

public class Person {
    private String name;
    private String surname;
    private int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public int spendTicket() {
        return tickets -= 1;
    }

    public boolean haveTicket() {
        return tickets > 0;
    }

    @Override
    public String toString() {
        return name + " " + surname + ": " + tickets;
    }

    public String getNameSurname() {
        return name + " " + surname;
    }

    public int getTickets() {
        return tickets;
    }
}
