package JavaWithSelenium;

public class maxAndMinSalary {
    public static void main(String[] args) {
        int [] salary ={1000, 39, 91, 823, 83, 829, 8932};

        int max=salary[0];
        int min=salary[0];

        for (int i = 1; i < salary.length ; i++) {

            if(salary [i] > max){
                max=salary[i];
            }
            if(salary[i]<min){
                min=salary[i];
            }

        }
        System.out.println("max salary is -->" + max);
        System.out.println("min salary is -->" + min);
    }
}
