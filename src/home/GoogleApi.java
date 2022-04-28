package home;

import java.util.ArrayList;
import java.util.List;

public class GoogleApi implements Cloneable{

    private List<String> popular_places;

    public GoogleApi(){
        popular_places=new ArrayList<String>();
        MyUtils.log("GOOGLE API LOG", "simple constructor called");
    }

    public GoogleApi(List<String> list){
        this.popular_places=list;
        MyUtils.log("GOOGLE API LOG", "second constructor called");

    }

    public void loadData(){
        popular_places.add("niku park");
        popular_places.add("uncle zacks fast food");
        popular_places.add("yummy fast food");
        popular_places.add("leofort hotel");
        popular_places.add("residency hotel");
        
    }
    public void updateData(){
        this.popular_places.remove(0);
    }

    public List<String> getPoplularPlaces(){
        return this.popular_places;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> places=new ArrayList<String>();
        for(String place:this.popular_places){
            places.add(place);
        }
        return new GoogleApi(places);
    }

}