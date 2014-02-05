/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datediffer;

import java.util.ArrayList;

/**
 *
 * @author HASNEN
 */
public class DateDiffer {
    
    public double Calc(MyDate date1,MyDate date2)
    { double value=0;
    int j=0,i=0;
        double array1[]={1,2,3,4,5,6,7,8,9,10,11,12};
        double array2[]={31,28,31,30,31,30,31,31,30,31,30,31};
        double d1=date1.dd;
        double d2=date2.dd;
        int m1=date1.mm;
        int m2=date2.mm;
        double y1=date1.yyyy;
        double y2=date2.yyyy;
     
        //nothing are equal
        if(y1!=y2 && m1!=m2 && d1!=d2)
        {double value1=0,value2=0;
            int start=m1;
        int end=m2;
        double ydifference=0;
         d1=array2[start]-d1;
            for(i=start;i<array2.length;i++)
            {  
                value1+=array2[i];
            }
            value1+=d1;
            
            ydifference=y2-y1;
            ydifference=365*ydifference;
            for(i=0;i<end;i++)
            {
                value2=d2+array2[i];
            }
            if(ydifference==1)
            {
            value=value2+value1;
            }
            else
            {
              value=value2+value1+ydifference;  
            }
        }
            //days are different
            else if(y1==y2 && m1==m2)
        {
           value+=d2-d1;
        }
        //months and days are different
        else if(y1==y2)
        {int end=m2;
         int start=m1;
            for(i=start;i<end;i++)
            {
                value+=array2[i];
            }
            for(i=start;i<end;i++)
            {
                value+=d2;
            }
        }
        //year is different
        else if(d1==d2 && m1==m2)
        {
            double ydifference=y2-y1;
            value+=365*ydifference;
        }
        //year and days are different
        else if(m1==m2)
        {
            double ydifference=y2-y1;
            value+=d2-d1 +(365*ydifference);
        }
        
        
        return value;
    }
}
