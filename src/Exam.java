
public class Exam {
     int id;
    String name;
    double monthlyIncome;
    int creditScore;
    double existingLoans;
    String loanStatus;

    public Application(int id, String name, double monthlyIncome, int creditScore, double existingLoans) {
        this.id = id;
        this.name = name;
        this.monthlyIncome = monthlyIncome;
        this.creditScore = creditScore;
        this.existingLoans = existingLoans;
        this.loanStatus = determineLoanStatus();
}
  
   public String toString() {
        repturn String.format("%d  %s  %.2f         %d         %.2f      %s",
                id, name, monthlyIncome, creditScore, existingLoans, loanStatus);
   }
} 
     public class LoanApplicationProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Applications: ");
        int numApplications = scanner.nextInt();
        scanner.nextLine();  

        Application[] applications = new Application[numApplications];

        for (int i = 0; i < numApplications; i++) {
            System.out.println("\nEnter details of application " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  
sume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Monthly Income: ");
            double monthlyIncome = scanner.nextDouble();

            System.out.print("Credit Score: ");
            int creditScore = scanner.nextInt();

            System.out.print("Existing Loans: ");
            double existingLoans = scanner.nextDouble();
            scanner.nextLine();  

            applications[i] = new Application(id, name, monthlyIncome, creditScore, existingLoans);
        }

        System.out.println("\nID Name Monthly Income Credit Score Existing Loans Loan Status");
        for (Application app : applications) {
            System.out.println(app);
        }

        scanner.close();
    }
}

