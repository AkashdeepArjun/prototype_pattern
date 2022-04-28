package home;

import java.util.List;

import javax.xml.crypto.Data;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException{

        GoogleApi api =new GoogleApi();
        api.loadData();
        
        MyUtils.log("ORIGNAL DATA","");

        MyUtils.printStrings(api.getPoplularPlaces());


        GoogleApi api2=(GoogleApi)api.clone();
        GoogleApi api3=(GoogleApi)api.clone();
        api.updateData();
        
        MyUtils.log("DATA AFTER UPDATE IN ORIGNAL API", "");
        MyUtils.printStrings(api.getPoplularPlaces());
        
        MyUtils.log("API 2 LIST","");
        MyUtils.printStrings(api2.getPoplularPlaces());

        MyUtils.log("API 3 LIST","");

        MyUtils.printStrings(api3.getPoplularPlaces());


    }
    


    
}
