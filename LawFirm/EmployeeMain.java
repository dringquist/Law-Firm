
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeMain 
{
    public static void main(String args[]){
       System.out.print("Employee: ");
         Employee edna = new Employee();
         System.out.print(edna.getHours() + ", ");
         System.out.printf("$%.2f, ", edna.getSalary());
         System.out.print(edna.getVacationDays() + ", ");
         System.out.println(edna.getVacationForm());

         System.out.print("Secretary: ");
         Secretary stan = new Secretary();
         System.out.print(stan.getHours() + ", ");
         System.out.printf("$%.2f, ", stan.getSalary());
         System.out.print(stan.getVacationDays() + ", ");
         System.out.println(stan.getVacationForm());
         stan.takeDictation("hello"); 
         
         System.out.print("Lawyer: ");
         Lawyer leia = new Lawyer();
         System.out.print(leia.getHours() + ", ");
         System.out.printf("$%.2f, ", leia.getSalary());
         System.out.print(leia.getVacationDays() + ", ");
         System.out.println(leia.getVacationForm());
         leia.sue();

         System.out.print("Legal Secretary: ");
         LegalSecretary lucy = new LegalSecretary();
         System.out.print(lucy.getHours() + ", ");
         System.out.printf("$%.2f, ", lucy.getSalary());
         System.out.print(lucy.getVacationDays() + ", ");
         System.out.println(lucy.getVacationForm());
         lucy.takeDictation("neato");
         lucy.fileLegalBriefs();
    }
    
}