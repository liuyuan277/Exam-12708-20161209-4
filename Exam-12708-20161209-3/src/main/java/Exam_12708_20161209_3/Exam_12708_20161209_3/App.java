package Exam_12708_20161209_3.Exam_12708_20161209_3;
/**
 * 2016-07-16
 */
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
    	
    	int  year;
    	int month;
    	int days;
    	int day=0;
    	int d=0;
    	boolean flag=false;
    	
    	do{
    		System.out.println("请输入日期：");
        	Scanner s=new Scanner(System.in);
        	String date=s.next();

        	year=Integer.parseInt(date.substring(0, 4));
        	month=Integer.parseInt(date.substring(5,7));
        	days=Integer.parseInt(date.substring(8,10));
        	//System.out.println(year+","+month+","+days);
        	
        	if (month <=0 ||month >12|| days<=0 ||days >31) {
				System.out.println("Input Error");
				flag=true;
			}
    	}while(flag);
    	
    for (int i = 0; i < month; i++) {
		switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:{
				day =31;
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:{
				day=30;
				break;
			}

			case 2:{
				if ((year%100!=0&&year%4==0)||(year%100==0&&year%400==0)) {
					day=29;
				}else{
					day=28;
				}
			}
			default:
				break;
			}
			d+=day;
		}
    System.out.println("你输入的日期为当年的第"+(d+days)+"天");
  }
}