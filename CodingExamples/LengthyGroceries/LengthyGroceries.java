package LengthyGroceries;


public class LengthyGroceries {
    public static int getNumAllergicItems(String[] groceryList) 
    {
        int numAllergicItems = 0; 

        for (String fruit : groceryList) {
            
            if (fruit.length() > 5)
            { 
                numAllergicItems ++; 
            }
        }

        return numAllergicItems;
    }

    public static void main(String[] args) 
    { 
        String[] groceryList = {"apple", "milk", "banana", "chocolate"};

        System.out.println(getNumAllergicItems(groceryList));
    }
}
