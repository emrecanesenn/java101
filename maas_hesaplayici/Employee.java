public class Employee {
    String name;
    double salary;
    double raiseSalary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        raiseSalary();
        bonus();
        tax();
    }

    public void raiseSalary() {
        int thisYear = 2021;
        int workYear = thisYear - hireYear;
        if(workYear < 10) {
            this.raiseSalary = this.salary * 0.05;
            this.salary *= 1.05;
        }
        else if(workYear < 20) {
            this.raiseSalary = this.salary * 0.10;
            this.salary *= 1.10;
        }
        else{
            this.raiseSalary = this.salary * 0.15;
            this.salary *= 1.15;
        }
    }

    public void bonus() {
        if(workHours > 40) {
            this.bonus = (workHours - 40) * 30;
            this.salary += this.bonus;
        }
        else{
            this.bonus = 0;
        }
    }

    public void tax(){
        if(salary > 1000) {
            this.tax = salary * 0.03;
            this.salary -= this.tax;
        }
        else{
            this.tax = 0;
        }
    }


    @Override
    public String toString() {
        return
               "------------------------------------\n" +
               "Adı: " + name + "\n" +
               "Maaşı: " + salary + "\n" +
               "Çalışma Saati: " + workHours + "\n" +
               "Başlangıç Yılı: " + hireYear + "\n" +
               "Maaş Artışı: " + raiseSalary + "\n" +
               "Vergi: " + tax + "\n" +
               "Bonus: " + bonus + "\n" +
               "Vergisiz ve bonussuz maaş: " + (salary + tax - bonus) + "\n" +
               "Maaş: " + salary + "\n" +
               "------------------------------------";
}

}
