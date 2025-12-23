import java.util.Scanner;

import unit4.collectionsLib.Node;

class Birthday {
    private String name;
    private int day;

    public Birthday(String name, int day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
}

class AllBirthday {
    private Node<Birthday>[] months;

    public AllBirthday() {
        months = (Node<Birthday>[]) new Node[13];
    }

    public void addBirthday(String name, int month, int day) {
        Birthday birthday = new Birthday(name, day);
        Node<Birthday> newNode = new Node<>(birthday, null);
        Node<Birthday> p = months[month];

        // Empty list or insert before head
        if (p == null || p.getValue().getDay() > day) {
            newNode.setNext(p);
            months[month] = newNode;
            return;
        }

        // Otherwise, find correct position
        while (p.getNext() != null && p.getNext().getValue().getDay() <= day) {
            p = p.getNext();
        }
        newNode.setNext(p.getNext());
        p.setNext(newNode);
    }

    public void removeBirthday(String name, int month, int day) {
        Node<Birthday> p = months[month];

        // Empty list
        if (p == null) {
            return;
        }

        // Head is target
        if (p.getValue().getDay() == day &&
            p.getValue().getName().equals(name)) {
            months[month] = p.getNext();
            return;
        }
        
        // Otherwise, remove from middle or end
        while (p.getNext() != null) {
            Birthday next = p.getNext().getValue();
            if (next.getDay() == day &&
                next.getName().equals(name)) {
                p.setNext(p.getNext().getNext());
                return;
            }
            p = p.getNext();
        }
    }

    public int maxBirthdaysInMonth() {
        int max = 0;

        for (int i = 1; i <= months.length; i++) {
            int c = 0;
            Node<Birthday> p = months[i];

            while (p != null) {
                c++;
                p = p.getNext();
            }
            if (c > max) max = c;
        }

        return max;
    }
}

public class dP116E51 {
    public static Scanner reader = new Scanner(System.in);
    
    public static void construct(int students) {
        AllBirthday data = new AllBirthday();
        for (int i = 0; i < students; i++) {
            String name;
            int month, day;
            System.out.println("Enter name:");
            name = reader.next();
            System.out.println("Enter month of birthday:");
            month = reader.nextInt();
            System.out.println("Enter day of birthday:");
            day = reader.nextInt();
            
            data.addBirthday(name, month, day);
        }
        System.out.println("The largest number of birthdays in a month is " + data.maxBirthdaysInMonth());
    }
}
