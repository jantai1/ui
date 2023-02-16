package leetCode;

public class ReverseString {

    static void reverseString(char[] s, int n)
    {
        char[] dest_array = new char[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            dest_array[j - 1] = s[i];
            j = j - 1;
        }

        System.out.println("Reversed array: ");
        for (int k = 0; k < n; k++) {
            System.out.print(dest_array[k] + " ");
        }
    }

    public static void main(String[] args)
    {
        char[] s = {'H','E','L','L','O'};
        System.out.println("Original array: ");
        for (int k = 0; k <s.length; k++) {
            System.out.print(s[k] + " ");
        }
        System.out.println();
        reverseString(s, s.length);
    }
}
