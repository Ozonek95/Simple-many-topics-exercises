package exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputConsumer {
    public List<Integer> inputConsumer(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        String input ="";
        while (true){
            input = scanner.nextLine();
            if(input.equals("c")){
                break;
            }
            result.add(Integer.parseInt(input));
        }
        return result;
    }
}
