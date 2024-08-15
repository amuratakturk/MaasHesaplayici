/*
Sınıfın Nitelikleri
name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı

Sınıfın Metotları
Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
 */

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        if (salary > 0.0){
            this.salary = salary;
        }else {
            System.out.println("Hatalı maaş girişi, lütfen 0'dan büyük değer giriniz.");
        }
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax;
        if (this.salary < 1000.0){
            return tax = 0.0;
        }else {
            return tax = salary * 0.03;
        }
    }

    public double bonus(){
        double bonus_fee;
        if(this.workHours > 40){
            bonus_fee = (this.workHours - 40) * 30;
        }else {
            bonus_fee = 0.0;
        }
        return bonus_fee;
    }

    public double raiseSalary(){
        int currentYear = 2021;
        double totalRaise;
        if (currentYear - this.hireYear < 10){
            totalRaise = this.salary * 0.05;
        } else if (currentYear - this.hireYear > 9 && currentYear - this.hireYear < 20){
            totalRaise = this.salary * 0.10;
        } else {
            totalRaise = this.salary * 0.15;
        }
        return totalRaise;
    }

    public void printInfo(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("İşe Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Maaş Artışı: " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslarla Birlikte Maaşı: " + (this.bonus() + this.salary - this.tax()));
        System.out.println("Toplam Maaş: " + (this.salary + this.raiseSalary()));
    }
}