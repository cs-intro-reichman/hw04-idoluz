public class ArrayOps {
    public static void main(String[] args) {
        int array1 [] = {2, 3, 3, 7, };
        int array [] = {1, 3, -4, 4, 5, 4, 5};
        System.out.println(secondMaxValue(array1));
       
        
    }
    
    public static int findMissingInt (int [] array) {
        int biggest = 0;
        int missingNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array [i];
            }    
        }
        int requiredSum = biggest * (biggest + 1) / 2; 
       for (int i = 0; i < array.length; i++){
        requiredSum -= array[i];
       }
       missingNum = requiredSum;
       
       
        if (missingNum == 0) {
            return 0;
        }

        return missingNum;
       
    }

    public static int secondMaxValue(int [] array) {
        int largest =Math.max(array[0], array[1]);
        int secondLargest = Math.max(array[0], array[1]);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];

            }
        }
        return secondLargest;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
       boolean contains = false;
       for (int i = 0; i < array1.length; i++) {
        for (int j = 0; j < array2.length; j++) {
            if (array1[i] == array2[j]) {
                contains = true;
            } 
        }
        if (contains == false) {
            return false;
        } 
        contains = false;
       }
       for (int j = 0; j < array2.length; j++) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[j]) {
                contains = true;
            } 
        }
        if (contains == false) {
            return false;
        } 
        contains = false;
       }
        return true;
    }
 
    public static boolean isSorted(int [] array) {
        boolean increasing = false;
        boolean decreasing = false;
        int test1 = array[0]; 
        // first we check if the array is increasing
        for (int i = 1; i < array.length; i++) { 
            if (test1 <= array[i]) {
                test1 = array[i];  
            } else {
                break;
            }
        }
        if (test1 == array[array.length - 1]) {
            increasing = true;
        }
        // now we check if it is decreasing
        int test2 = array[0];
        for (int i = 1; i < array.length; i++) { 
            if (test2 >= array[i]) {
                test2 = array[i];  
            } else {
                break;
            }
        }
        if (test2 == array[array.length - 1]) {
            decreasing = true;
        }
        // we want a "true" result if the array is increasing OR decreasing
        return (increasing || decreasing);
    }

}

