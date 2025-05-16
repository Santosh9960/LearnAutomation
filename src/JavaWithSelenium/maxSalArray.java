package JavaWithSelenium;

public class maxSalArray {
    public static void main(String[] args) {

        int [] salaries ={18129, 8732, 87923, 7832, 9023, 8721123};

        int max= salaries[0];

        for (int i = 1; i < salaries.length ; i++) {
            if (salaries[i] > max){
                max= salaries[i];
            }
            }
            System.out.println("The max salary in salaries is-->" + max);
        }

    }
