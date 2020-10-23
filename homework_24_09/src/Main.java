import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> status = new HashMap<Integer, String>();
//        // это словарь
        status.put(1, "Germany");
        status.put(2, "bebebe");

        String first = status.get(1);
        System.out.println(first);

        Set<Integer> keys = status.keySet();
        Collection<String> values = status.values();

        status.replace(1, "NEW");
        status.remove(2);

        for(Map.Entry<Integer,String> items: status.entrySet()) {
            System.out.printf("Ключ: %d, Значение: %s", items.getKey(), items.getValue());
        }

        Map<Integer, Person> personMap = new HashMap<Integer, Person>();

        personMap.put(1, new Person("Tom"));
        personMap.put(1, new Person("Jerry"));

        for(Map.Entry<Integer, Person> person: personMap.entrySet()) {
            System.out.printf("Ключ: %d, Имя: %s", person.getKey(), person.getValue().getName());
        }

        getLetttersMap("звшоамщрфваширжшао1342834");
    }


        public static void getLetttersMap(String s){
            HashMap<Character, Integer> lettersMap = new HashMap<>();

            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                lettersMap.compute(ch, (k,v)->v==null?1:v+1);
            }
            ArrayList<Map.Entry<Character, Integer>> listToSort = new ArrayList<>(lettersMap.entrySet());
            listToSort.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));

            for(Map.Entry<Character, Integer> entri: listToSort){
                System.out.println(entri.getKey() + " " + entri.getValue());
            }
        }

        public static <K, V> Map<V, HashSet<K>> revertedMap(HashMap<? extends K, ? extends V> mapToRevert){
            HashMap<V, HashSet<K>> mapFinal = new HashMap<>();
            Set<K> keys = (Set<K>) mapToRevert.keySet();

            for (K key: keys){
                V value = mapToRevert.get(key);
                mapFinal.compute(value, (v,k) ->{
                    if(k == null)
                        k = new HashSet<>();
                    k.add(key);
                    return k;
                });
            }
            return mapFinal;
        }
}

