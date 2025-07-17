import java.util.*;


class Hash{ // HashMap
 

    public static void main(String args[]){


        // creation

        HashMap<String, Integer> map = new HashMap<>();


        // Inserting
        map.put("India", 120);
        map.put("Us", 30);
        map.put("china", 150);

        System.out.println(map);

        map.put("china", 180);
        System.out.println(map);

        map.put("India", 200);
        System.out.println(map);

        map.put("Us", 50);
        System.out.println(map);



        // searching

        if(map.containsKey("India")){
            System.out.println(" key is present int the map");
        }else{

            System.out.println(" key is Not present in the map");
        }



        // get functions is basically searching the value
        
        System.out.println(map.get("India"));
        System.out.println(map.get("china"));

        Iteraction (1)

        for(Map.Entry<String, Integer> e: map.entrySet()){

            System.out.println(e.getKey());

           System.out.println(e.getValue());



           
          

          Interaction (1)

          for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
          }

          for(Map.Entry<String, Integer> e : map.entrySet()){
           // System.out.println(e.getKey());
            System.out.println(e.getValue());
          }


          for(String Key : map.keySet()){
            System.out.println(key + " " + map.get(key));
          }

                          

        remove
        map.remove("china");
        System.out.println(map);

        map.put("china", 120);
        System.out.println(map);

              // searching
        if(map.containsKey("India")){
            System.out.println(" the key is present in the map");
        }else{
            System.out.println(" the Key is Not present in the in the map");
        }

        Iteration (1);

       for( Map.Entry<String, Integer> e : map.entrySet()){
           System.out.println(e.getKey());
        }


        for(Map.Entry<String, Integer> e : map.entrySet()){
           System.out.println(e.getKey());
          System.out.println(e.getValue());
        }


        iteraction (2)

        for(Map.Entry <String, Integer> e : map.entrySet()){
            System.out.println(e.getValue());
        }
       }
    }





