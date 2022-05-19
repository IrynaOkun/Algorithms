public class IntegerM {

    public String IntegerM (int m) {

        if (m % 3 == 0 && m % 5 == 0) {

            return "Good Number";
        }
        if (m % 3 == 0 && m % 5 != 0) {

            return "Bad Number";
        }
        if (m % 3 != 0 && m % 5 == 0) {

            return "Poor Number";

        } else {

            return "-1";
        }


    }
}


