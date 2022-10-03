//currency
package packex;
public class CurrencyDEY{
  public double dolToRup(double dol){
    return dol*68;
  }
  public double ruptoDol(double rupee){
    return rupee/68;
    }
  public double eurotoRup(double euro){
    return euro*81;
    }
  public double ruptoEuro(double rupee){
    return rupee/81;
    }
  public double yentoRup(double yen){
    return yen*0.59;
    }
  public double ruptoYen(double rupee){
    return rupee/0.59;
    }
 }

//distance

package packdis; 
public class Distance{
  public int metertoKm(int meter){
    return meter*100;
    }
  public double kmtoMeter(double km){
    return km/1000;
    }
  public double miletoKm(double miles){
    return miles*1.609;
    }
  public double kmtoMile(double km){
    return km/1.609;
    }
}

//time

package packtime; 
public class Time{
  public int hourstoMts(int hours){
    return hours*60;
    }
  public double mtstoHour(double mts){
    return mts/60;
    }
  public int hourtoSec(int hours){
    return hours*3600;
    }
  public double sectoHour(double sec){
    return sec/3600;
    }
  public int mtstoSec(int mts){
    return mts*60;
    }
  public double sectoMts(double sec){
    return sec/60;
    } 
}

//main 

import packex.*; 
import packdis.*;
import packtime.*;
public class Static{
  public static void main(String []args){
   CurrencyDEY c=new CurrencyDEY();
   Distance d=new Distance();
   Time t=new Time();
    System.out.println(c.eurotoRup(55.7));
    System.out.println(d.kmtoMile(55));
    System.out.println(t.hourtoSec(5));
   }
  }









