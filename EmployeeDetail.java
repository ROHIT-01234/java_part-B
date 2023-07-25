import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int[] EmpId={1001,1002,1003,1004,1005,1006,1007};
		String[] EmpName={"Abc","Opqr","Ghi","Wxyz","Jklmn","Stuv","Def"};
		String[] JoinDate={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
		char[] DesigCode={'e','c','k','r','m','e','c'};
		String[] Department={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		double[] Basic={20000,30000,10000,12000,50000,23000,29000};
		double[] HRA={8000,12000,8000,6000,20000,9000,12000};
		double[] IT={3000,9000,1000,2000,20000,4400,10000};
		char[] DesignationCode={'e','c','k','r','m'};
		String[] Designation={"Engineer","Consultant","Clerk","Receptionist","Manager"};
		double[] DA={20000,32000,12000,15000,40000};

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Valid Employee ID: ");
        int id = scanner.nextInt();

        int flag = 0;

        for (int i = 0; i < EmpId.length; i++) {
            if (EmpId[i] == id) {
                flag = 1;
                System.out.println("Emp Id.:"+EmpId[i]);
                System.out.println("Emp Name :"+EmpName[i]);
                System.out.println("Department :"+Department[i]);
        
                for (int j = 0; j < DA.length; j++) {
                   // double basic = da[j] / 2;
                   // double hra = da[j] / 4;
                   // double it = da[j] / 10;
                   if(DesigCode[i]==DesignationCode[j])
                   {
                    double sum = Basic[i] + HRA[i] + DA[j] - IT[i];
                    System.out.println("Designation :"+DA[j]);
                    System.out.println("DA :"+sum);
                   }
                }
            }
        }

        if (flag == 0)
            System.out.println("There is no employee with EmpId: " + id);

        scanner.close();
    }
}
