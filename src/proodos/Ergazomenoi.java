/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos;

/**
 *
 * @author User
 */
public class Ergazomenoi {
    String er_id;
    String fn;
    String ln;
    String afm;
    String addr;
    String amka;
    String salary;
    String days_off;
    String sick_days;
    String unpaid;
    
     public Ergazomenoi(String er_id, String fn,String ln,String afm, String addr,String amka,String salary,
             String days_off,String sick_days,String unpaid) {
        this.er_id = er_id;
        this.fn = fn;
        this.ln = ln;
        this.afm = afm;
        this.addr = addr;
        this.amka = amka;
        this.salary = salary;
        this.days_off = days_off;
        this.sick_days = sick_days;
        this.unpaid = unpaid;
    }
        public String toString()
{
    return er_id + " "+fn+" "+ln+ " "+afm+" "+addr + " "+amka+" "+salary + " "+days_off+" "+sick_days + " "+unpaid;
}

}
    

