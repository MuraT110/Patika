public class Employer {
    String name;
    int salary;
    int workHours;
    int hireYear;


    public Employer(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        tax();
    }
    public double tax() {
        if (this.salary > 1000) {
            return this.salary*0.03;
        } else {
            return 0;

        }
    }
    public double bonus(){
        if (this.workHours>40){
            return (this.workHours-40)*30;
        }else{
            return 0;
        }

    }
    public double raiseSalary(){
        if (2021-hireYear>19){
            return this.salary*0.15;
        } else if (2021-this.hireYear>9&&2021-this.hireYear>10) {
            return this.salary*0.10;
        } else if (2021-this.hireYear>0&&2021-this.hireYear>10) {
            return this.salary*0.05;
        }else {
            return 0;
        }

    }
    public String toString(){
        double total12=salary-tax()+bonus()+raiseSalary();
        double total11=salary+bonus()-tax();
        System.out.println("ADI:" + this.name);
        System.out.println("MAAŞI:" + this.salary);
        System.out.println("ÇALIŞMA SAATİ:" + this.workHours);
        System.out.println("BAŞLANGIÇ YILI:" + this.hireYear);
        System.out.println("VERGİ:" + tax());
        System.out.println("BONUS:" + bonus());
        System.out.println("MAAŞ ARTIŞI:" + this.raiseSalary());
        System.out.println("VERGİ VE BONUSLAR İLE BİRLİKTE MAAŞ:" + total11);
        System.out.println("TOPLAM MAAŞ:" + total12);
        return null;

    }
}
