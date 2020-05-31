import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

//Jedna metoda na interfejs, inaczej nie będziemy mogli użyć lambdy

public class Main {
    public static void main(String[] args){

        List<String> names= new ArrayList<>();

        names.add("Arek");
        names.add("Beataaa");
        names.add("Zuk");
        names.add("Fidasaska");

        //STRUMIEN
        names.stream()
                .filter(new Predicate<String>() {       //Predicate to interfejs funkcyjny z metodą test
                    @Override                           //przyjmującą obiekt i zwraca boolean
                    public boolean test(String s) {
                        return s.endsWith("k");
                    }
                }
                );

        System.out.println(names);

        //Filtrowanie (delete to show other names)
        names = filter(names, (input, input2) -> input.endsWith("a"));

//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());  //sortowanie po długości imion
//            }
//        });

        names.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));  //sortowanie po długości imion

//        names.sort(Comparator.comparingInt(String::length));

        System.out.println("Filtrowanie:         " + names);


        //DODAWANIE DRUGIEJ WARTOSCI DO NAME
        List<String> modifiedNames = new ArrayList<>();
        Random random = new Random();
        for (String name : names) {
            String modifiedName = name + " " + random.nextInt(11);
            modifiedNames.add(modifiedName);
        }

        System.out.println("Pierwsze modified:   " + modifiedNames);


        //DRUGI SPOSÓB
        List<String> modifiedNames2 = new ArrayList<>();
        for (String name : names) {
            String modifiedName2 = modify(name, s -> name + " " + random.nextInt(222));
            modifiedNames2.add(modifiedName2);
        }

        System.out.println("Drugie modified:     " + modifiedNames2);
    }

    //metoda przyjmująca stringa, zwracająca stringa
    private static String modify(String s, Modifier modifier){
        return modifier.modify(s);
    }


    //Filtrowanie
    private static List<String> filter(List<String> input, Filter filter){
        List<String> resultList = new ArrayList<>();
        for (String name : input) {
            if(filter.filter(name, "COS TAM DRUGI PARAMETR")) {
                resultList.add(name);
            }
        }
        return resultList;
    }


}
