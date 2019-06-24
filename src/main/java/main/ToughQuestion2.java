package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	cal.calculateCalories(bread);
                        	System.out.println(cal.returnCalories());
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	cal.calculateCalories(bread, jam);
                        	System.out.println(cal.returnCalories());
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	cal.calculateCalories(bread, jam, butter);
                        	System.out.println(cal.returnCalories());
                        	break;
                        }
                        System.out.printf("%.3f",cal.calculateEnergy());
                        System.out.println(" kJ of energy generated from "+cal.returnCalories()+" calories");
            }
}
class Calories {
            int caloriesOfBreadSlice = 74;
            int caloriesForJam = 26;
            int caloriesForButter = 102;
            double caloriesInEnergy;
            double calculatedCalories = 0;
            int calculateCalories(int bread) {
                //you have to overload this function for three parameters refer the question
                	calculatedCalories = bread*caloriesOfBreadSlice;
                	return bread*caloriesOfBreadSlice;
                }
            int calculateCalories(int bread , int jam)
            {
               calculatedCalories = (bread*caloriesOfBreadSlice)+(jam*caloriesForJam);
               return (bread*caloriesOfBreadSlice) + (jam*caloriesForJam);
            }
            int calculateCalories(int bread,int jam,int butter)
            {
               calculatedCalories = (bread*caloriesOfBreadSlice) + (jam*caloriesForJam) + (butter*caloriesForButter);
               return (bread*caloriesOfBreadSlice) + (jam*caloriesForJam) + (butter*caloriesForButter);
            }
            double returnCalories()
            {
            	return calculatedCalories;
            }
           double calculateEnergy()
            {
            	caloriesInEnergy = 4.1868 * calculatedCalories;
            	return caloriesInEnergy;
            }
            }