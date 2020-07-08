package exercises.technology;

public class Computer extends AbstractEntity{
    private String operatingSystem;
    private int version;
    private int yearOfMake;

  public  Computer(String operatingSystem,int version,int yearOfMake){
      this.operatingSystem=operatingSystem;
      this.version=version;
      this.yearOfMake=yearOfMake;
  }

  public boolean isComputerNew(){

      if(yearOfMake>=2015){
          return true;
      }else{
          return false;
      }
   }
   public String typeOfComputer(){
      if(operatingSystem=="mac"){
          return "mac";
      }else{
          return "windows";
      }
   }

}
