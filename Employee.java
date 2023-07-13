public class Employee {
    //nitelikler
    //variable
    String name;
    double salary;
    int workHours;
    int hireYear;

    //kurucu metot
    //constructor
    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //uygulanan vergiyi hesaplıyoruz
    //calculate the applied tax
    double tax(){
        double tax;
        if (this.salary < 1000){
            return tax = 0.0;
        }else
            return tax = (0.03 * this.salary);
    }

    //bonusları hesaplıyoruz
    //calculate bonnuses
    double bonus(){
        double extraWorkHours, bonus;
        if(this.workHours > 40){
            extraWorkHours = workHours - 40;
            return bonus = extraWorkHours * 30;
        }
        return bonus = 0;
    }

    //Çalışma yılına göre zam hesaplıyoruz
    //calcıulate the raise according to the working year
    double raiseSalary(){
        double raise = 0;
        if (2021 - this.hireYear < 10) {
            return raise = 0.05 * this.salary;
        }else if((2021 - this.hireYear < 9) && (2021 - this.hireYear > 20)){
            return raise = 0.1 * this.salary;
        }else if(2021 - this.hireYear > 19){
            return raise = 0.15 * this.salary;
        }else
            return raise = 0 * this.salary;
    }

    //Maaşı bonus ve vergi ile hesaplıyoruz
    //salary with bonuses and taxes
    double taxBonusSalary(){
        double totalSalary;
        return totalSalary = this.salary - tax() + bonus();
    }

    //zam artışından sonra maaş
    //increased salary
    double totalSalary(){
        return this.salary + raiseSalary();
    }


    public String toString(){
        return  "Name : " + this.name + "\nSalary : " + this.salary +
                "\nWork Hours : " + this.workHours + "\nStarting Year : " + this.hireYear +
                "\nTax : " + this.tax() + "\nBonus : " + this.bonus() +
                "\nSalary Increase : " + raiseSalary() +
                "\nSalary Along With Taxes and Bouses : " + taxBonusSalary() +
                "\nTotal Salary : " + this.totalSalary();

    }
}



