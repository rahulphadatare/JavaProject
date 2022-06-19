package interface_1;

public class A_Student implements Admission,A_Collage {

	public void uniform()
	{
		System.out.println("uniform is compulsory");
	}
	public void idCard()
	{
		System.out.println("id card is compulsory");
	}
	public void transport()
	{
		System.out.println("transport is not compulsory");
	}
	public void MarkSheet10th()
	{
		System.out.println("10th mark sheet: yes");
	}
	public void MarkSheet12th()
	{
		System.out.println("12th mark sheet: yes");
	}
	public void incomeCertificate()
	{
		System.out.println("income certificte: yes");
	}
	public void nationality()
	{
		System.out.println("nationality certificate: yes");
	}
	public void adhar()
	{
		System.out.println("Adhar card: yes");
	}
}
