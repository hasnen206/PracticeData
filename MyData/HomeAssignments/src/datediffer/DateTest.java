/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datediffer;

/**
 *
 * @author HASNEN
 */
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyDate date1=new MyDate(19,1,1960);
       MyDate date2=new MyDate(19,1,1961);
       DateDiffer diff=new DateDiffer();
       double ans=diff.Calc(date1, date2);
       System.out.println("Ans is: "+ans);
    }
}
