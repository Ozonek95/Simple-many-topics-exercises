package numbertowordsparser;

public class NumberToWordParser {
    private static final String one = "one";
    private static final String two = "two";
    private static final String three = "three";
    private static final String four = "four";
    private static final String five = "five";
    private static final String six = "six";
    private static final String seven = "seven";
    private static final String eight = "eight";
    private static final String nine = "nine";
    private static final String  ten = "ten";
    private static final String twenty = "twenty";
    private static final String thirty = "thirty";
    private static final String fourty = "fourty";
    private static final String fifty = "fifty";
    private static final String sixty = "sixty";
    private static final String seventy = "seventy";
    private static final String eighty = "eighty";
    private static final String ninety = "ninety";



    public static void parseIntegerToString(int number) {
        String input = Integer.toString(number);
        StringBuilder result = new StringBuilder();
        if(input.length()>1){
            switch (input.charAt(0)){
                case '1':
                    result.append(ten);
                    break;
                case '2':
                    result.append(twenty);
                    break;
                case '3':
                    result.append(thirty);
                    break;
                case '4':
                    result.append(fourty);
                    break;
                case '5':
                    result.append(fifty);
                    break;
                case '6':
                    result.append(sixty);
                    break;
                case '7':
                    result.append(seventy);
                    break;
                case '8':
                    result.append(eighty);
                    break;
                case '9':
                    result.append(ninety);
                    break;
            }
            result.append(" ");
            switch (input.charAt(1)){
                case '1':
                    result.append(one);
                    break;
                case '2':
                    result.append(two);
                    break;
                case '3':
                    result.append(three);
                    break;
                case '4':
                    result.append(four);
                    break;
                case '5':
                    result.append(five);
                    break;
                case '6':
                    result.append(six);
                    break;
                case '7':
                    result.append(seven);
                    break;
                case '8':
                    result.append(eight);
                    break;
                case '9':
                    result.append(nine);
                    break;
            }

            System.out.println(result.toString());

        }

        else {
            switch (input.charAt(0)){
                case '1':
                    result.append(one);
                    break;
                case '2':
                    result.append(two);
                    break;
                case '3':
                    result.append(three);
                    break;
                case '4':
                    result.append(four);
                    break;
                case '5':
                    result.append(five);
                    break;
                case '6':
                    result.append(six);
                    break;
                case '7':
                    result.append(seven);
                    break;
                case '8':
                    result.append(eight);
                    break;
                case '9':
                    result.append(nine);
                    break;
            }
            System.out.println(result.toString());
        }
    }
}
