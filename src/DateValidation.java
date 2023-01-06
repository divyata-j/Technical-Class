import java.util.*;
public class DateValidation {

public static void main(String[] args) {
// TODO Auto-generated method stub
String sdate=new java.util.Scanner(System.in).nextLine();
StringTokenizer st=new StringTokenizer(sdate,"/-.");
int dd=Integer.parseInt(st.nextToken());
int mm=Integer.parseInt(st.nextToken());
int yy=Integer.parseInt(st.nextToken());
boolean valid=true;
if(dd>31||dd<1||mm>12||mm<1)
valid=false;
else
{
switch(mm)
{
case 4: case 6: case 9: case 11:
if(dd>30)
valid=false;
break;
case 2:
//every 4th yr is a leap yr,every century isn't a leap year,evry 4th century is a leap yr
//number divisible by 400 and 4 is a leap yr and number not div by 100 is a leap yr
if((yy%400==0)||(yy%4==0 && yy%100!=0))
{
if(dd>29)
valid=false;
}
else if(dd>28)
valid=false;
}
}
System.out.println(valid?"valid":"invalid");
}

}