import java.util.*;
public class EBill
{
 public static void main(String agsf[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter 0 for domestic,enter 1 for commercial");
  int z=s.nextInt();
  System.out.println("enter previous month units");
  int x=s.nextInt();
  System.out.println("enter current month units");
  int y=s.nextInt();
  int unit=y-x;
  if(z==0){
    if(unit<=100){
    double bill =unit*1;
    System.out.println(bill);
    }
    else if(unit>=101 && unit<=200){
     unit=unit-100;
     double bill=unit*2.50+100;
     System.out.println(bill);
    }
    else if(unit>=201 && unit<=500){
   unit=unit-200;
   double bill=unit*4+100+197.5;
   System.out.println(bill);
   }
   else {
   unit=unit-500;
   double bill=unit*6+100+197.5+2000;
   System.out.println(bill);
  }
 }
 if(z==1){
    if(unit<=100){
    double bill =unit*2;
    System.out.println(bill);
    }
    else if(unit>=101 && unit<=200){
     unit=unit-100;
     double bill=unit*4.50+200;
     System.out.println(bill);
    }
    else if(unit>=201 && unit<=500){
   unit=unit-200;
   double bill=unit*6+200+900;
   System.out.println(bill);
   }
   else {
   unit=unit-500;
   double bill=unit*7+200+900+3000;
   System.out.println(bill);
  }
 }
}
}
