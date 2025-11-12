package Task01.entity;

public class Person {

    private String name;
    private String idCard;


    public Person(String name,String idCard){

        this.name=name;
        this.idCard=idCard;

    }
    protected String getName(){
        return name;

    }
    protected String getIdCard(){
        return idCard;
}
//Display
public void display(){
    System.out.println(" Name: "+name+"\n idCard: " +idCard);


    }
}
