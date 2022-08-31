package src;

public class Person1 {
    private String name;
    private String middleName;
    private String familyName;

    public Person1(String name, String middleName, String familyName){
        this .name = name;
        this .middleName = middleName;
        this . familyName = familyName;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this .name = name;
    }
    public String getMiddleName(){
        return middleName;
    }
    public void setMiddleName(String middleName){
        this .middleName = middleName;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}
