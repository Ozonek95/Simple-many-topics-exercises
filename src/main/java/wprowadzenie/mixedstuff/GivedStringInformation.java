package wprowadzenie.mixedstuff;

public class GivedStringInformation {
    String myData;
    public GivedStringInformation(String builder){
        this.myData=builder;
    }

    public void giveInformation(){
        int numberOfCharacters=0;
        String[] values = myData.split("\\s+");
        int shortestWord = values[0].length();
        int longesWord = values[0].length();
        System.out.println("Ilość słów: <"+values.length+">");
        System.out.println("Ilość wprowadzonych znaków wraz ze spacją:<"+myData.length()+">");
        for(String s:values){
            int wordLength = s.length();
            if(s.charAt(s.length()-1)=='.'||s.charAt(s.length()-1)==','){
                wordLength--;
            }
            if(wordLength>longesWord){
                longesWord=s.length();
            }
            else if(wordLength<shortestWord){
                shortestWord=s.length();
            }
            numberOfCharacters+=s.length();
        }
        System.out.println("Ilość wprowadzonych znaków bez spacji: <"+numberOfCharacters+">");
        double avargeWordLength = numberOfCharacters/values.length;
        System.out.println("Srednia długość słowa: <"+avargeWordLength+">");
        System.out.println("Najkrótsze słowo miało: "+shortestWord+" znaków.");
        System.out.println("Najdłuższe słowo miało: "+longesWord+" znaków.");
    }



}
