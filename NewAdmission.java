import java.io.*;

public class NewAdmission

+

{
	public static void main(String args[]) throws IOException
	{
	    System.out.println("Greeting!!");	
        System.out.println("Welcome to CVR college of Engineering!!");	
        System.out.println("Please update your NewAdmission details for the below requested:");
		System.out.print("what is your Name  :");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String name = br.readLine();
        System.out.println("");
		System.out.print("what is your Address  :");
		BufferedReader br1 = new BufferedReader( new InputStreamReader(System.in));
		String address = br1.readLine();
        System.out.println("");
		System.out.print("what is your Contact Number  :");
		BufferedReader br2 = new BufferedReader( new InputStreamReader(System.in));
		String contactnumber = br2.readLine();
		System.out.println("");
		System.out.print("what is your Btech ID number  :");
		BufferedReader br3 = new BufferedReader( new InputStreamReader(System.in));
		String btechidnumber = br3.readLine();
        System.out.println("");
		System.out.print("Btech cmm percentage  :");
		BufferedReader br4 = new BufferedReader( new InputStreamReader(System.in));
		String btechcmmpercentage = br4.readLine();
		System.out.println("");
		System.out.print("Branch name  :");
		BufferedReader br5 = new BufferedReader( new InputStreamReader(System.in));
		String branchname= br5.readLine();
		System.out.println("");
		System.out.print("New branch covert to speclization stream  :");
		BufferedReader br6 = new BufferedReader( new InputStreamReader(System.in));
		String newbranchconverttospecializationstream = br6.readLine();
	    System.out.println("");
		System.out.print("what is your Btech college name  :");
		BufferedReader br7 = new BufferedReader( new InputStreamReader(System.in));
		String btechcollegename = br7.readLine();
		System.out.println("");
		System.out.print("douments  : ");
		BufferedReader br8 = new BufferedReader( new InputStreamReader(System.in));
		String documents = br8.readLine();
		System.out.println("");
		System.out.print("Academic type  :");
		BufferedReader br9 = new BufferedReader( new InputStreamReader(System.in));
		String academictype = br9.readLine();
		System.out.println("");
		System.out.print("payement mode  :");
		BufferedReader br10 = new BufferedReader( new InputStreamReader(System.in));
		String payementmode = br10.readLine();
		System.out.println("Semseter fee  :");
		BufferedReader br11 = new BufferedReader( new InputStreamReader(System.in));
		String semseterfee   = br11.readLine();
		System.out.println("");
		System.out.print("Tuition fee  :");
		BufferedReader br12 = new BufferedReader( new InputStreamReader(System.in));
		String tuitionfee = br12.readLine();
		System.out.println("");
		System.out.print("Library fee  :");
		BufferedReader br13 = new BufferedReader( new InputStreamReader(System.in));
		String libraryfee = br13.readLine();
		System.out.println("");
		System.out.print("Transport fee  :");
		BufferedReader br14 = new BufferedReader( new InputStreamReader(System.in));
		String transportfee = br14.readLine();
		System.out.println("");
		System.out.print("College code  :");
		BufferedReader br15 = new BufferedReader( new InputStreamReader(System.in));
		String collegecode = br15.readLine();
		System.out.println("");
		System.out.print("Cafeteria menu  :");
		BufferedReader br16 = new BufferedReader( new InputStreamReader(System.in));
		String cafeteriamenu = br16.readLine();
		System.out.println("");
		
		
		System.out.println("");
	    System.out.println("Your Application Details Updated in the system as below :");
		System.out.println(name);
		System.out.println(address);
		System.out.println(contactnumber);
		System.out.println(btechidnumber);
		System.out.println(btechcmmpercentage);
		System.out.println(branchname);
		System.out.println(newbranchconverttospecializationstream);
		System.out.println(btechcollegename);
		System.out.println(documents);
		System.out.println(academictype);
		System.out.println(payementmode);
		System.out.println(semseterfee);
		System.out.println(tuitionfee);
		System.out.println(libraryfee);
		System.out.println(transportfee);
		System.out.println(collegecode);
		System.out.println(cafeteriamenu);
		
System.out.println("Welcome Autonomous Insititue!!");
}
}
