public class Main {
    public static void main(String[] args) {
        Employee isci1 = new Employee("İsmail", 450, 50, 2009);
        Employee isci2 = new Employee("Ömer", 500, 40, 2010);
        Employee isci3 = new Employee("Müşteri", 1000, 60, 2011);

        System.out.println(isci1.toString());
        System.out.println(isci2.toString());
        System.out.println(isci3.toString());
    }
}
