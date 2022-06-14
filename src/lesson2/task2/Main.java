package lesson2.task2;

public class Main {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook("Windows 11", 32, true, true, 23.7f);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation("Window NT", 8, true, false, true);
        System.out.println(workstation);
    }
}
