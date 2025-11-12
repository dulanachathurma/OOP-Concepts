package Task02;

public class Main {
    public static void main(String[] args) {
        DataProcessor csvProcessor= new CsvDataProcessor();
        DataProcessor jsonProcessor= new CsvDataProcessor();

        System.out.println("CSV Processsor Execution");
        csvProcessor.execute();
        System.out.println("JSON Processsor Execution");
        jsonProcessor.execute();
    }
}
