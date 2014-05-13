import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
private static final Map<Character,Object> map = new HashMap<Character, Object>();
static{
	map.put('A', '2');
	map.put('B', '2');
	map.put('C', '2');
	map.put('D', '3');
	map.put('E', '3');
	map.put('F', '3');
	map.put('G', '4');
	map.put('H', '4');
	map.put('I', '4');
	map.put('J', '5');
	map.put('K', '5');
	map.put('L', '5');
	map.put('M', '6');
	map.put('N', '6');
	map.put('O', '6');
	map.put('P', '7');
	map.put('R', '7');
	map.put('S', '7');
	map.put('T', '8');
	map.put('U', '8');
	map.put('V', '8');
	map.put('W', '9');
	map.put('X', '9');
	map.put('Y', '9');
	map.put('0', '0');
	map.put('1', '1');
	map.put('2', '2');
	map.put('3', '3');
	map.put('4', '4');
	map.put('5', '5');
	map.put('6', '6');
	map.put('7', '7');
	map.put('8', '8');
	map.put('9', '9');
	map.put('-', "");
}
private static final Map<String,Integer> resultMap = new HashMap<String, Integer>();
public static void main(String args[]) throws Exception {
Scanner scanner = new Scanner(System.in);
StringBuilder sb = new StringBuilder();
List<String> list = new LinkedList<String>();
int lines = scanner.nextInt();
for (int j = 0; j < lines; j++) {//while (scanner.hasNext()) {
String line = scanner.next();
sb.setLength(0);
for (int i = 0; i < line.length(); i++) {
	sb.append(map.get(line.charAt(i)));
}
sb.insert(3, '-');
String r = sb.toString();
Integer v = resultMap.get(r);
if(v==null){
	list.add(r);
	resultMap.put(r, 1);
}else{
	resultMap.put(r, ++v);
}
}
Collections.sort(list);
for(String key : list){
	Integer v = resultMap.get(key);
	if(v>1){
		System.out.println(key+ " " +resultMap.get(key));
	}
}
if(list.size() ==lines){
	System.out.println("No duplicates.");
}
}}
