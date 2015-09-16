import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		new Test().mapOperation();
		
		
	}
	
	private void mapOperation(){
		Map map = new HashMap();
		map.put("1cc", "abhi");
		map.put("a1a", "sunik");
		map.put("b6b", "ajay");
		map.put(1, "ajay");
		map.put(null, null);

		System.out.println(map);
		
		Set set = map.keySet();
		Iterator itr = set.iterator();
		Object temp;
		
		System.out.println("============== key set iteration =============");
		try{
			while(itr.hasNext()){
				temp = (String) itr.next();
				System.out.println(String.valueOf(temp));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println("============== Entry set iteration =============");
		
		Map.Entry tempEntry;
		Set entry =  map.entrySet();
		itr = entry.iterator();
		while(itr.hasNext()){
			tempEntry = (Map.Entry)itr.next();
			System.out.println(tempEntry.getKey());
			System.out.println(tempEntry.getValue());
		}
		
		System.out.println("============= contains check ===================");
		
		System.out.println("does "+map+ " contains key : null >>  "+ map.containsKey(null));
		System.out.println("does "+map+ " contains value : null >>  "+ map.containsValue("ajay") +"It present at ");
		
		
		NavigableMap<Integer,Integer>  tm = new TreeMap<Integer,Integer>();
		tm.put(1, 11);
		tm.put(2, 22);
		tm.put(3, 33);
		tm.put(4, 44);
		
		System.out.println("actual map");
		System.out.println(tm);
		
		System.out.println("tm.ceilingEntry(1)  ::");
		System.out.println(tm.ceilingEntry(1));
		
		System.out.println("tm.floorEntry(3)");
		System.out.println(tm.floorEntry(3));
		
		System.out.printf("%5s: %s%n",String.valueOf(tm.ceilingKey(2)));
		
	
		System.out.println("tm.values()");
		//System.out.println(tm.values());
		
		
		
		List<String> list = new ArrayList<String>();
		list.add(new String("B"));
		list.add(new String("A"));
		list.add(new String("C"));
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.subList(1,2));
		
	}
	
	private void setOperation(){
		Set<String> set =  new TreeSet<String>();
		set.add("e");
		set.add("a");
		//set.add(10);
		set.add("d");
		set.add("b");
		set.add("c");
		//set.add(1);
		System.out.println(set);
		
		HashMap hm = new HashMap();
		
		hm.put(new StringBuffer("sunil"), "hello");
		hm.put(new StringBuffer("sunil"), "bye");
		
		System.out.println(hm);
	}

}
