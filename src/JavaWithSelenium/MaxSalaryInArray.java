package JavaWithSelenium;

public class MaxSalaryInArray {
    public static void main(String[] args) {
        int [] salaries = {100, 200, 899, 390, 862, 927, 2083};

        int max= salaries[0];

        for (int i = 1; i < salaries.length ; i++) {

            if(salaries[i]> max){
                max=salaries[i];
            }

        }

        System.out.println("Max salary is--->" + max);
    }
}
