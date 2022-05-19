/* author: Jack Farah
 * description: Implementation of countSort with time complexity of O(n +k).
 */

public class Main {
    public static void main(String[] args) {

        int [] array = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countSort(array, 1,10);   //calling the countSort array

        for(int i = 0; i < array.length; i++){   //printing sorted array
            System.out.print(array[i] +", ");
        }
        System.out.print("\b\b");
    }

    /* type: method
     * return type: void
     * parameters: int [] array, int min, int max
     * description: implements countSort. first counts the common element into a newArray using, then storing those
     *              elements into the inputArray resulting in a sorted array
     */
    private static void countSort(int [] inputArray, int min, int max){

        int [] newArray = new int [(max-min)+1];

        for(int i =0; i < inputArray.length; i++){
            newArray[inputArray[i]-min]++;
        }

        int j =0;

        for(int i = min ; i<= max ; i++){
            while(newArray[i - min] > 0){
                inputArray[j++] = i;
                newArray[i-min]--;
            }
        }
    }
}
