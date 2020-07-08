package exercises.technology;

import org.junit.Test;

import static org.junit.Assert.*;

public class Program{
    @Test
    public void isComputerNewTest(){
       Computer comp=new Computer("mac",2,2016);
        assertTrue(comp.isComputerNew());

    }
    @Test
    public void typeOfComputerWindowsTest(){
        Computer comp=new Computer("windows",2,2015);
        assertEquals("windows", comp.typeOfComputer());

    }
    @Test
    public void typeOfComputerTest(){
        Computer comp=new Computer("mac",2,2016);
        assertEquals("mac",comp.typeOfComputer());

    }

    @Test
    public void isLaptopOldTest(){
     Laptop lap=new Laptop("mac",2,2014,"black");
     assertFalse(lap.isLaptopOld());

    }


    @Test
    public void isLaptopColorChoosenTest(){

        Laptop lap=new Laptop("mac",2,2014,"grey");

        assertEquals("Choose",lap.colorOfLaptop());

    }

    @Test
    public void isHandyTest() {

        SmartPhone phone = new SmartPhone("mac", 2, 2019, 50);

        assertTrue(phone.isHandy());

    }
    }

