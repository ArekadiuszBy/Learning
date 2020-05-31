public interface Filter {

    //Przyjmuje string, zwraca boolean
    boolean filter(String input, String input2);
    //Jeśli dodalibyśmy drugą metode, to wyrażenia lambda nie będzie można zastosotwać,
    //Bo program nie domyśli się przy wywołaniu o którą metodę nam chodzi
}
