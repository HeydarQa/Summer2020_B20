package day03_sequences_Variables;
/*
task:
        variables: salary, tax
                totalTax = salary * tax;
               salaryAfterTax =   salary - totalTax
               100000 ,     0.28;
                100000 * 0.28 = 28000;
                100000 - 28000 = 72000;

 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class SalaryCalculator {
    public static void main(String[] args) {
        int Salary = 10000;
        double Tax = 0.28;
        double TotalTax = Salary * Tax;
        double salaryAfterTax= Salary-TotalTax;
        System.out.println(TotalTax);
        System.out.println(salaryAfterTax);

    }

}




