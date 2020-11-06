import java.util.*;

class Graph {


    public static void main(String [] args)  {

        int [][] distance_between_cities = new int [6][6];

        Map<Integer , City > cities = new HashMap<>();
        cities.put(1,   new City(1, "Oklahoma"));
        cities.put(2,   new City(2, "Norman"));
        cities.put(3,   new City(3, "Dallas"));
        cities.put(4,   new City(4, "Tulsa"));
        cities.put(5,   new City(5, "StillWater"));

        List<Road> roads = new ArrayList<Road>( Arrays.asList(
                new Road( 1, 1, 2,  60),
                new Road( 2, 1, 4, 90),
                new Road( 3, 4, 5, 25),
                new Road( 4, 5, 2, 120),
                new Road( 2, 2, 3, 260)
        ));


        for(int i = 0; i < roads.size(); i++)  {

            Road r =  roads.get(i);
            distance_between_cities[r.startCityId][r.endCityId] = r.distance;
        }

        for(int i = 1; i < distance_between_cities.length; i++) {
            for(int j = 1; j <distance_between_cities.length; j++ ) {
                if( distance_between_cities[i][j] != 0){
                    System.out.println( "Distance Between " + cities.get(i).getName() + " and  " + cities.get(j).getName() + " is  " +  distance_between_cities[i][j] + " ");
                }
            }
        }


    }
}



class City {

   private  int Id;
   private  String name;

    public City(int Id, String name){
        this.Id = Id;
        this.name = name;
    }


    public String getName(){
        return this.name;
    }

}

class Road {

    int  roadId;
    int startCityId ;
    int endCityId;
    int distance;



    public Road(int roadId,int startCityId,  int endCityId, int distance) {
        this.roadId = roadId;
        this.distance = distance;
        this.startCityId = startCityId;
        this.endCityId = endCityId;
    }
}
