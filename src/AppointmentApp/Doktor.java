package AppointmentApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Doktor {
    //3.Adim
    private int id;
    private String name;
    private String department;
    private List<String> dates=new ArrayList<>();

    public Doktor(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
       //4.adim doktor objesi olusturuldugunda doktorun 7 gunluk takvimi hazir olsun
        LocalDate day=LocalDate.now();//sisteme girilen tarihi doner
        for (int i =0; i <3 ; i++) {//test edebilmek icin 3 dedim normalde 7
            day=day.plusDays(1);//dayi 1 gun sonra yaptik
            this.dates.add(day.toString());
        }
    }
//5. Adim getter setter yap
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }
}
