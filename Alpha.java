package programs;

import java.util.Scanner;

public class Alpha {
	 public static void main(String args[]) {
		 Scanner r=new Scanner(System.in);
		 System.out.println("Enter the value 1");
		 String ro=r.nextLine();
		 System.out.println("Enter the value 2");
		 String rs=r.nextLine();
		 int r1=ro.compareTo(rs);
		 int r2=rs.compareTo(ro);
		 System.out.println(r1);
		 System.out.println(r2);
		 if(r1<r2)
		   System.out.println(ro+" "+rs);
		 else
			 System.out.println(rs+" "+ro);
	 }
}
