package pack;

public class TimeTest {

	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println(time1);
		
		Time time2=new Time(55550000);
		System.out.println(time2.setTime(time2.elapseTime));
		
		Time time3 = new Time(5, 23, 55);
		System.out.println(time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
	}

}
