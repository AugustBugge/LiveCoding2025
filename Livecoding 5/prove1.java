import java.util.*;

class prove1{
    
    // Opgave 1
    static boolean calculate(int number) {
        if(number == 10) {
            return true;
        } else{
            return false;
        }
    }


    static void test0() {
        System.out.println(calculate(10));
        System.out.println(calculate(5));
    }

    static boolean calculate(int number, int winner, int joker) {    
        if (number == winner) {
            return true;
        } else if (number == joker) {
            return true;
        } else {
            return false;
        }
    }

    static void test1() {
        System.out.println(calculate(4,8,16));
        System.out.println(calculate(8,8,16));
        System.out.println(calculate(16,8,16));
    }
    
    //Opgave 2
    static int getWinnerAmount(List<Integer> numbers, int winner, int joker) {
        int count = 0;
        for(int number :numbers) {
            if (calculate(number, winner, joker) == true) {
                count++;
            }
        }
        return count;
    }

    static void test2() {
        //10, 5, 60, 7, 25, 10
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(60);
        list.add(7);
        list.add(25);
        list.add(10);
        
        //int number = getWinnerAmount(list, 10, 25);
        System.out.println(getWinnerAmount(list, 10, 25));
    }
    
    
    //Opgave 3
    static Map<String, Integer> getMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sebastian", 5);
        map.put("Claus", 10);
        return map;
    }

    static void test3() {
        Map<String, Integer> map = getMap();
        System.out.println(map.get("Sebastian"));
        System.out.println(map.get("Claus"));
    }
    
    
    //Opgave 4
    static void print(Map<String, Integer> contestants, int winner, int joker) {
        System.out.println("Lotteri resultater:");
        for(String name :contestants.keySet()) {
            if(calculate(contestants.get(name), winner, joker) == true) {
                System.out.println("- " + name + " vandt!");
            } else {
                System.out.println("- " + name + " tabte!");
            }
        }
    }

    static void test4() {
        Map<String, Integer> map = getMap();
        print(map, 2, 5);
    }
}
