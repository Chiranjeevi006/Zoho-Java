import java.util.Scanner;
class MedicalRecord  {
    int recordId;
    String patientName;
    String dateOfVisit;
    String diagnosis;
    void inputRecordDetails( Scanner scan){
        System.out.println("Enter the RecordId: ");
        recordId=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the PatientName: ");
        patientName=scan.nextLine();
        System.out.println("Enter the DateOfVisit: ");
        dateOfVisit=scan.nextLine();
        System.out.println("Enter Diagnosis: ");
        diagnosis=scan.nextLine();
    }
    void displayRecord(){
        System.out.println("PatientName: "+patientName+"\nRecordId: "+recordId+"\nDateOfVisit: "+dateOfVisit+"\nDiagnosis: "+diagnosis);
    }
}
class inPatientRecord extends MedicalRecord{
    int RoomNumber;
    int numberOfDaysAdmitted;
    double roomCharge;
    void inputRecordDetails( Scanner scan){
        System.out.println("Enter the Details of inpatient:\n");
        super.inputRecordDetails(scan);
        //scan.nextLine();
        System.out.println("Enter the RoomNumber: ");
        RoomNumber=scan.nextInt();
        System.out.println("Enter the NumberOfDaysAddmited: ");
        numberOfDaysAdmitted=scan.nextInt();
        System.out.println("Enter the RoomCharge Per day: ");
        roomCharge=scan.nextInt();
    }
    double calculateTotalCharges(){
        return numberOfDaysAdmitted*roomCharge;
    }
    void displayRecord(){
        System.out.println("----Inpatient Record----");
        super.displayRecord();
        System.out.println("RoomNumber: "+RoomNumber);
        System.out.println("NumberOfDays Addmited: "+numberOfDaysAdmitted);
        System.out.println("Room charge per day: "+roomCharge);
        System.out.println("Total charge: "+calculateTotalCharges());
    }
}
class OutPatientRecord extends MedicalRecord{
    String doctorName;
    int consultationFee;
    void inputRecordDetails(Scanner scan){
       
        
        System.out.println("Enter the Details of Outpatient: \n");
        super.inputRecordDetails(scan);
        //scan.nextLine();
        System.out.println("Enter the Doctor name: ");
        doctorName=scan.nextLine();
        System.out.println("Enter the consulationFees: ");
        consultationFee=scan.nextInt();
    }
    void displayRecord(){
        System.out.println("----Outpatient Record----");
        super.displayRecord();
        System.out.println("DoctorNAme: "+doctorName);
        System.out.println("Consulation fees: "+consultationFee);
    }
}
public class D5One {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter record type:");
        System.out.println("1.Inpatient record:");
        System.out.println("2.Out patient Record:");
        int a=scan.nextInt();
        switch (a){
            case 1:
                inPatientRecord n1=new inPatientRecord();
                n1.inputRecordDetails(scan);
                n1.displayRecord();
                break;
            case 2:
            OutPatientRecord n2=new OutPatientRecord();
                n2.inputRecordDetails(scan);
                n2.displayRecord();
                break;
        }
    }
}
