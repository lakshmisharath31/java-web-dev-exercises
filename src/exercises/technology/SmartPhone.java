package exercises.technology;

public class SmartPhone extends Computer{
    private int weight;
    public SmartPhone(String operatingSystem, int version, int yearOfMake,int weight) {
        super(operatingSystem, version, yearOfMake);

    }

    public boolean isHandy(){
        if(weight<50)
        {
            return true;
        }else{
            return false;
        }

    }
}
