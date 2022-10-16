//Suppose, in a company, here are some employee salaries in an array, [35000, 25000, 28000, 32500, 44000, 32800]. Find out the 3rd highest salary.
package Array_and_Function_problem_solution;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Assignment3 {
    public static void main(String[] args) {
        try {
            Integer salary[]={35000, 25000, 28000, 32500, 44000, 32800};
            Arrays.sort(salary,Collections.reverseOrder());
            System.out.println("The 3rd Highest Salary is: " +salary[2]);
        }
        catch (Exception e)
        {

        }
    }
}
