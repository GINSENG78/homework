package HomeworkArreyHashes;

import java.util.*;

public class ArrayHashes {

//    public String getDay(int day){
//
//        ArrayList<String> buttons = new ArrayList<>();
//
//        buttons.add ("Sunday");
//        buttons.add ("Monday");
//        buttons.add ("Tuesday");
//        buttons.add ("Wednesday");
//        buttons.add ("Thursday");
//        buttons.add ("Friday");
//        buttons.add ("Saturday");
//
//        return buttons.get(day-1);

    //  }

    //    public String getToyByld(int id) {
//        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//
//        hashMap.put(12, "Bat Mobile");
//        hashMap.put(45, "Light Siber");
//        hashMap.put(6, "Wonder Woman");
//        hashMap.put(201, "Hello Kitty");
//        hashMap.put(56, "Junior QA Analyst Toy");
//
//
//        if (hashMap.get(id) == null) {
//            return ("No such Toy");
//        } else {
//            return hashMap.get(id);
//        }
//   }
    public void arrayListName() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");

//        Collections.sort(names);
//        System.out.println(names);

        ArrayList<String> list = new ArrayList<>();
        Collections.sort(list);

       ArrayList<String> result = new ArrayList<>();
        for(String name:names) {
            if(!list.contains(name))
            {result.add(name);
            }
        }
        System.out.println(result);


    }
}

