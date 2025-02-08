import javax.swing.JOptionPane;
class first{
        public static void main(String[] args){
            String annual_interest = JOptionPane.showInputDialog("Enter yearly interest rate: ");

            double AnnualInterest= Double.parseDouble(annual_interest);
            double monthlyInterest = AnnualInterest / 1200;

            String numberOfYear = JOptionPane.showInputDialog("Enter number of years as an integer: ");
            int NumberOfYear = Integer.parseInt(numberOfYear);

            String loan= JOptionPane.showInputDialog("Enter loan amount: ");
            double loanAmount= Double.parseDouble(loan);

            double monthlyPayment = loanAmount*monthlyInterest/(1-1/Math.pow(1+ monthlyInterest, NumberOfYear * 12));
            double totalPayment= monthlyPayment * NumberOfYear * 12;

            monthlyPayment = (int)(monthlyPayment*100)/100.0;

            totalPayment = (int)(totalPayment *100)/100.0;

            String output="The monthly Payment is " + monthlyPayment +"\n The total Payemnt is "+ totalPayment; JOptionPane.showMessageDialog(null,output);
        }
    }



