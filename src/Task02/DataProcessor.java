package Task02;

public abstract class DataProcessor {

    public void readData(){
        System.out.println("Reading Data.....");
    }
    public void saveData(){
        System.out.println("Saving Data.....");
    }
    public void execute(){
        readData();
        processData();
        saveData();


    }
    public  abstract void processData();
}
