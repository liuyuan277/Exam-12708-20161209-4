package Exam_12708_20161209_4.Exam_12708_20161209_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	HashMap<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
    	for (int i = 0; i < 50; i++) {
    		Random r=new Random();
			int t=r.nextInt(100);
			list.add(t);
		}
    	System.out.println("随机生成50个小于100的数，分别是：");
    	for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");
		}
    	
//    	for (int i = 0; i < list.size(); i++) {
//    		map.put(list.get(i)/10,list.get(i));
//		}
//    	Set set=map.keySet();
//    	Iterator<Integer> iter=set.iterator();
//    	while (iter.hasNext()) {
//    		int key =(Integer) iter.next();
//    		int value=map.get(key);
//    		System.out.println(key+":"+value);
//		}
    	Iterator i=map.entrySet().iterator();
    	while (i.hasNext()) {
			Map.Entry<Integer,Integer> e = (Entry<Integer, Integer>) i.next();
			int key= e.getKey();
			int value=e.getValue();
			System.out.println(key+":"+value);
		}
    	
    }
}
