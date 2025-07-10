//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FindADuplicate {
    public static void main(String[] args) {
        int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    // Check if the duplicate element is already in res
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}