// import java.util.*;


// class Hash{ // HashMap
 

//     public static void main(String args[]){


//         // creation

//         HashMap<String, Integer> map = new HashMap<>();


//         // Inserting
//         map.put("India", 120);
//         map.put("Us", 30);
//         map.put("china", 150);

//         System.out.println(map);

//         map.put("china", 180);
//         System.out.println(map);

//         map.put("India", 200);
//         System.out.println(map);

//         map.put("Us", 50);
//         System.out.println(map);



//         // searching

//         if(map.containsKey("India")){
//             System.out.println(" key is present int the map");
//         }else{

//             System.out.println(" key is Not present in the map");
//         }



//         // get functions is basically searching the value
//         System.out.println(map.get("Us"));
//         System.out.println(map.get("India"));
//         System.out.println(map.get("china"));

        //Iteraction (1)

        // for(Map.Entry<String, Integer> e: map.entrySet()){

        //     System.out.println(e.getKey());

           // System.out.println(e.getValue());



           // Iteraction (1)

        //   for(int i=0; i<n; i++){ // regular Method
          //  System.out.prinln(arr[i] + " ");
          // }
          // System.out.println();


          // Iteraction 

         // for(Map.Entry<String, Integer> e: map.entrySet()){
           // System.out.println(e.getKey());
         // }

          //for(String key : map.keySet()){
            //System.out.println(key + " " + map.get(key));
          //}


          //Interaction (1)

        //   for(Map.Entry<String, Integer> e: map.entrySet()){
        //     System.out.println(e.getKey());
        //   }

          // for(Map.Entry<String, Integer> e : map.entrySet()){
          //  // System.out.println(e.getKey());
          //   System.out.println(e.getValue());
          // }


        //   for(String Key : map.keySet()){
        //     System.out.println(key + " " + map.get(key));
        //   }

                          

        // remove
        // map.remove("china");
        // System.out.println(map);

        // map.put("china", 120);
        // System.out.println(map);

        //       // searching
        // if(map.containsKey("India")){
        //     System.out.println(" the key is present in the map");
        // }else{
        //     System.out.println(" the Key is Not present in the in the map");
        // }

        // Iteration (1);

       // for( Map.Entry<String, Integer> e : map.entrySet()){
         //   System.out.println(e.getKey());
        //}


        //for(Map.Entry<String, Integer> e : map.entrySet()){
           // System.out.println(e.getKey());
          // System.out.println(e.getValue());
        //}


        // iteraction (2)

        // for(Map.Entry <String, Integer> e : map.entrySet()){
        //     System.out.println(e.getValue());
        // }
       // }
    //}



  //   import java.util.*;

  //   class Hash{

  //     public static void main(String args[]){

  //       HashSet<Integer> set = new HashSet<>();

  //       // add
  //       set.add(1);
  //       set.add(2);
  //       set.add(3);
  //       set.add(4);
  //       set.add(11);

        
  //       System.out.println(set);

  //       // size
  //       System.out.println(set.size());

  //       // search

  //     if(set.contains(10)){
  //       System.out.println(" yes ");
  //     }else{
  //       System.out.println(" No ");
  //     }


  //     if(!set.contains(11)){
  //       System.out.println("absent");
  //     }


  //     // delete
  //     set.remove(22);
  //     System.out.println(set);

  //     // print all the element
  //     System.out.println(set);

  //     // printall the element 

  //     System.out.println(set);

      


  //      // Iteractor
       
  //     set.add(0);
  //     Iterator<Integer> it = set.iterator();
  //     while(it.hasNext()){
  //       System.out.println(it.next() + " ");
  //     }


  //   }
  // }


  //import java.util.*;


  // basically tha  hashMap and HashSet is the is the unorder HashMap and HashSet is the unorder Map 

  // class Hash{

  //   public static void main(String args[]){
  //     HashSet<Integer> set = new HashSet<>();

  //     // add
  //     set.add(1);
  //     set.add(2);
  //     set.add(3);
  //     set.add(4);
  //     set.add(5);

  //     System.out.println(set);


  //     // size
  //     System.out.println(set.size());

  //     // search
  //     if(set.contains(6)){
  //       System.out.println("key exist ");

  //     }else{

  //       System.out.println(" key is Not exist ");
  //     }

  //     // delete
  //     set.remove(1);
  //     System.out.println(set);

  //     // delete
  //     set.remove(2);
  //     System.out.println(set);

  //     set.add(1);
  //     System.out.println(set);


    

      // if(!set.contains(2)){
      //   System.out.println(" absent ");
      // }


      // // print all the element 
      // System.out.println(set);
      // System.out.println(set);

      

      // Iterator

      // set.add(0);
      // Iterator <Integer> it = set.iterator();
      // while(it.hasNext()){
      //   System.out.print(it.next() + " ");
      // }




     

      // iterator

      // set.add(8);
      // Iterator <Integer> it = set.iterator();
      // while(it.hasNext()){
      //   System.out.println(it.next() + " ");
      // }




      // // is Empty()
      // if(!set.isEmpty()){
      //   System.out.println(" set is  Not Empty ");
      // }

     // }
 // }

  // import java.util.*;

  // class Hash{

  //   public static void main(String args[]){ //  hashMap ma add karva ma put ave and set ma add ave 

  //     HashMap< String,Integer> map = new HashMap<>();
  //     //HashMap<Integer, String> map = new HashMap<>();
  //     //HashMap<String, Integer> map = new HashMap<>();

  //     // add

  //     map.put("India", 120);
  //     map.put("Indonesia", 40);
  //     map.put("Russia", 200);
  //     map.put("Canada", 100);
  //     map.put("Singapore", 120);

  //     System.out.println(map);


  //     // search

  //     if(map.containsKey("Singapore")){

  //       System.out.println(" yes ");
  //     }else{
  //       System.out.println(" Not ");
  //     }

  //     if(map.containsKey("Russia")){
  //       System.out.println(" yes ");
  //     }else{
  //       System.out.println("Not");
  //     }

  //  // get the value and the
  //     System.out.println(map.get("India"));
  //     System.out.println(map.get("Indonesia"));
  

  //     // removeing
  //     map.remove("Singapore");
  //     System.out.println(map);

  

  //     // iteration

  //     ///for(Map.Entry<String, Integer> e: map.entrySet()){
  //       //System.out.print(e.getKey());
  //       //System.out.print(e.getValue());
  //     //}


    
  //   }
  // }





  










    





// subArry sum equal to the K
// import java.util.*;

//  class Hash{

//   public static void main(String args[]){

//     int arr [] = {10, 2, -2, -20, 10};
//     int k = -10;

//     HashMap<Integer, Integer> map = new HashMap<>();

//     map.put(0, 1);

//      int ans = 0;
//      int sum = 0;


//     for(int j=0; j<arr.length; j++){
//       sum += arr[j];

//       if(map.containsKey(sum-k)){
//         ans += map.get(sum-k);
//       }

//       if(map.containsKey(sum)){

//         map.put(sum, map.get(sum) + 1);

//       }else{
    
//         map.put(sum, 1);
//       }
//     }
//     System.out.println(ans);
//   }
//  }



// //1
// import java.util.*;

// class Hash{

//   public static void majorityElement(int nums[]){

//     int n = nums.length;

//     HashMap<Integer, Integer> map = new HashMap<>();


//     for(int i=0; i<n; i++){

//       if(map.containsKey(nums[i])){ // if the key exist nums[i] exist in the map frquency + 1 and no exist then frquency is 1

//         map.put(nums[i], map.get(nums[i]) + 1); // frquncy + 1

//       }else{

//         map.put(nums[i], 1);
//       }

//       for(int key : map.keySet()){

//         if(map.get(key) > n/3){
//           System.out.println(key);
//         }
//       }
//     }
//   }



//   public static void main(String args[]){

//     int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//     majorityElement(nums);
//   }
// }




// //2 union of two Arrays
// import java.util.*;

// class Hash{

//   public static int union(int arr1[], int arr2[]){

//     HashSet<Integer> set = new HashSet<>();

//     int n1 = arr1.length;
//     int n2 = arr2.length;

//       for(int i=0; i<n1; i++){
//         set.add(arr1[i]); // arr1 na Element ne set ma add karo set element ne unique banavse je repeted hoy nahi
//       }

//       for(int j=0; j<n2; j++){
//         set.add(arr2[j]); // arr2 na elemnt ne set ma add karo  set ma add karta set tene unique banse do not repeted Element
//       }

//     //  for(int element : set){
//     //    System.out.print(element + " "); // in  this code print to all union Element
//     //   }

//       return set.size(); // return karo set1 and set2 na Element ne unique size
//   }

//   public static void main(String args[]){

//     int arr1[] = {7, 3, 9};
//   int   arr2[] = {6, 3, 9, 2, 9, 4};

  
//     System.out.println(union(arr1, arr2));
  
//   }
// }


// 3 intersection of two Arrays

//   import java.util.*;

//   class Hash{


//     public static int intersection(int arr1[], int arr2[]){

//       HashSet<Integer> set = new HashSet<>();

//       int n1 = arr1.length;
//       int n2 = arr2.length;

// int count = 0;
//       for(int i=0; i<n1; i++){
//         set.add(arr1[i]);
//       }


//       for(int j=0; j<n2; j++){
//         if(set.contains(arr2[j])){
//           System.out.print(arr2[j]);
//           count++;
//           set.remove(arr2[j]); // remove the element not intersection again and again
//         }
//       }

//       return count;
//     }


//     public static void main(String args[]){

//       int arr1 [] = {7, 3, 9};
//       int arr2 [] = {6, 3, 9, 2, 9, 4};
   
//       System.out.println(intersection(arr1, arr2));
//     }
//   }


   // find the Itinerary frome tickets





//    import java.util.*;

// class Hash{

//     public static String getstart(HashMap<String, String> tick){


//         HashMap<String, String> revmap = new HashMap<>();

//         for(String key : tick.keySet()){ // key is present one by one and keyset in all present key 
//             revmap.put(tick.get(key), key);  // reverse map give the value as key and key as value

//         }

//         for(String key : tick.keySet()){
//             if(!revmap.containsKey(key)){
//                 return key; // if the key is not present the revmap key set then return then return that key
//             }
//         }
//         return null;
//     }

//     public static void main(String args[]){

//         HashMap<String, String> tickets = new HashMap<>();

//         tickets.put("Chennai", "Bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa", "Chennai");
//         tickets.put("Delhi", "Goa");

//         String start = getstart(tickets);

//         while(tickets.containsKey(start)){ // find the start till the tickets contains the start key

//             System.out.print(start + "-->"); // when the start is present in the tickets then print start
//             start = tickets.get(start); // when the start is meet quickly print the start the next

//                }
//                System.out.print(start);
//             }
//          }



 // 5 subArray  sum equal to the K

//  import java.util.*;

//  class Hash{

//   public static void main(String args[]){

//     int arr[] = {1, 2, 3};
//         int n = arr.length;
//     int k = 3;

//     HashMap<Integer, Integer> map = new HashMap<>();

//     map.put(0, 1); // because the key = 0 and value = 1 is the means o times key value is present the map one time
    
    
//     int sum = 0;

//    int ans = 0;

//     for(int j =0; j<n; j++){

//       sum += arr[j];
    

//     if(map.containsKey(sum - k)){
//       ans  += map.get(sum - k);
//     }

//     if(map.containsKey(sum)){

//       map.put(sum, map.get(sum) + 1); // if the map exist the sum  + 1 karo 

//     }else{ // map not exist sum the map.put the 1
//       map.put(sum , 1);

//     }

//   }
//   System.out.println(ans);
//   }
// }




//   import java.util.*;

//   class Hash{

//     public static int  intersection(int arr1[], int arr2[]){

// int count = 0;
//       HashSet<Integer> set = new HashSet<>();


//       for(int j=0; j<arr2.length; j++){
//         set.add(arr2[j]);
//       }


//       for(int i=0; i<arr1.length; i++){

//         if(set.contains(arr1[i])){
//           count++;
//           System.out.println(arr1[i]);
//           set.remove(arr1[i]);
//         }
//       }
//       return count;


//     }


//     public static void main(String args[]){

//       int arr1[] = {2, 15, 11, 5, 20, 10, 25   };
//       int arr2 []= {5, 10, 15, 20, 25, 20, 25};

//       System.out.println(intersection(arr1, arr2));
//     }
//   }


  





// import java.util.*;

// class Hash{

//   public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

//   public static void printcomb(String str, int idx, String comb){

//     if(idx == str.length()){
//       System.out.println(comb);
//       return;
//     }

//     char currchar = str.charAt(idx);
//     String mapping = keypad[currchar - '0'];

//     for(int i=0; i<mapping.length(); i++){

//       printcomb(str, idx + 1, comb + mapping.charAt(i));
//     }
//   }

//   public static void main(String args[]){

//     String str = "23";
//     printcomb(str, 0, " ");
//   }
// }



// public class Solution {
//     public int solve(ListNode A, int B) {
        
        
//     ListNode curr = A;
//     int length = 0;
    
    
//     while(curr != null){
        
//         curr = curr.next;
//         length++;
//     }
    
    
//     // find the middle 
    
//     int mid = length/2;
    
//     //target
    
//     int target = mid-B;
    
    
//     if(target < 0){
//         return -1;
//     }
    
//     curr = A; // the loop is started the curr variable A till the end
    
    
//     for(int i=0; i<target; i++){ //loop run the till the target 
//         curr = curr.next; // update the curr    
//     }
//     return curr.val;

//     }
// }  




