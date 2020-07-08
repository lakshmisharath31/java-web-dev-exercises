package exercises.technology;

public class Laptop extends Computer{
   // private  int operatingSystem ;
    private String color;
    private int version;
    private int yearOfMake;

    public Laptop(String operatingSystem, int version, int yearOfMake,String color) {
        super(operatingSystem, version, yearOfMake);
        this.color=color;
       this.version=version;
       this.yearOfMake=yearOfMake;
    }





    public String colorOfLaptop(){
        if(color == "grey"){
            return "Choose";

        }else{
            return "Not of prefer";
        }
    }
    public boolean isLaptopOld(){

        if(yearOfMake<2014)
        {
            return true;
        }else{
            return false;
        }
    }
}
