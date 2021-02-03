package test;

public class Student4 {
	
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student4()
	{
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	public void setStudentName(String name)
	{
		studentName = name;
	}
	
	public static int getSerialNum()
	{
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum)
	{
		Student4.serialNum = serialNum; //static 변수이기 떄문에 앞에다가 클래스 이름을 씀
	}
}
