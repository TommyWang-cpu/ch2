public class Example1{
	
	public static void main (String[] args){
		
		//Practice
		String name;
		int age = 16;
		name = "Tommy";
		
		//Ex 2.2
		int day = 14;
		String month;
		month = "September";
		int year = 2026;
		
		//Ex 2.3
		int hour = 1;
		int minute = 33;
		
		
		//Practice
		System.out.println("My name is" + " " + name + " " + "and I am" + " " + age);
		System.out.println(7/2);
		System.out.println(7.0/2);
		System.out.println(7%2);
		
		//Ex 2.2
		System.out.println("Today is" + " " + day + ", " + month + ", " + year);
		
		//Ex 2.3
		System.out.println("Current time is:");
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.print(":");
		System.out.println("Seconds since midnight" + " " + hour * 60 * 60 + minute * 60);
		
		
	}

}
