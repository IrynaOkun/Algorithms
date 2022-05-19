public class IsPositiveNumber {

    public boolean IsPositiveNumber (int s) {
        boolean u = false;

        if (s < 0) {
            u = false;
        } else {
            u = true;
        }

        return u;
    }

}

// ternary operator
// public static boolean isPositiveNumber(int number) {
// return number >= 0 ? true: false;
//(return number >= 0)
// num1 >= num2 ? num1 : num2;
//}
//System.out.println(isPositiveNumber(8));


