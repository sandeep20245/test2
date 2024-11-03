// Class to define the FeeStructure
class FeeStructure {
    private double tuitionFee;
    private double labFee;
    private double libraryFee;
    private double sportsFee;
    private double miscFee;

    // Constructor
    public FeeStructure(double tuitionFee, double labFee, double libraryFee, double sportsFee, double miscFee) {
        this.tuitionFee = tuitionFee;
        this.labFee = labFee;
        this.libraryFee = libraryFee;
        this.sportsFee = sportsFee;
        this.miscFee = miscFee;
    }

    // Method to calculate the total fee
    public double calculateTotalFee() {
        return tuitionFee + labFee + libraryFee + sportsFee + miscFee;
    }

    // Getters
    public double getTuitionFee() { return tuitionFee; }
    public double getLabFee() { return labFee; }
    public double getLibraryFee() { return libraryFee; }
    public double getSportsFee() { return sportsFee; }
    public double getMiscFee() { return miscFee; }
}

// Class to define the Student
class Student {
    private String name;
    private FeeStructure feeStructure;
    private double scholarshipDiscount;

    // Constructor
    public Student(String name, FeeStructure feeStructure, double scholarshipDiscount) {
        this.name = name;
        this.feeStructure = feeStructure;
        this.scholarshipDiscount = scholarshipDiscount;
    }

    // Method to calculate the final payable fee after applying the scholarship discount
    public double calculatePayableFee() {
        double totalFee = feeStructure.calculateTotalFee();
        double discountAmount = (scholarshipDiscount / 100) * totalFee;
        return totalFee - discountAmount;
    }

    // Method to display fee details
    public void displayFeeDetails() {
        System.out.println("Fee details for " + name + ":");
        System.out.println("Tuition Fee: $" + feeStructure.getTuitionFee());
        System.out.println("Lab Fee: $" + feeStructure.getLabFee());
        System.out.println("Library Fee: $" + feeStructure.getLibraryFee());
        System.out.println("Sports Fee: $" + feeStructure.getSportsFee());
        System.out.println("Miscellaneous Fee: $" + feeStructure.getMiscFee());
        System.out.println("Scholarship Discount: " + scholarshipDiscount + "%");
        System.out.println("Total Payable Fee: $" + calculatePayableFee());
        System.out.println("-------------------------------");
    }
}

// Main class to test the implementation
public class FeeManagementSystem {
    public static void main(String[] args) {
        // Create a standard fee structure
        FeeStructure standardFeeStructure = new FeeStructure(5000, 300, 100, 150, 50);

        // Create student objects with or without scholarships
        Student student1 = new Student("Alice Johnson", standardFeeStructure, 10);
        Student student2 = new Student("Bob Smith", standardFeeStructure, 0);

        // Display fee details for each student
        student1.displayFeeDetails();
        student2.displayFeeDetails();
    }
}
