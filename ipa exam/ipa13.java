import java.util.*;

public class ipa13 {
    public static void main(String[] args) {
        // HashSet<Character> set = new HashSet<>();
        // StringBuilder result = new StringBuilder();
        // TreeMap <Character,Integer> map= new TreeMap();
        LinkedHashMap <Character,Integer> map= new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
            {
            // char currentChar = s.charAt(i);
            // if (!set.contains(currentChar))
            // if (currentChar!='a'&& currentChar!='e' && currentChar!='i'&& currentChar!='o'&& currentChar!='u' && currentChar!='A' && currentChar !='E' && currentChar!='I'&& currentChar!='O'&& currentChar!='U') {
            //     result.append(currentChar);
                // set.add(currentChar); 
                map.put(s.charAt(i),map.get(s.charAt(i))+1);

        }
        else{
            map.put(s.charAt(i),1);
        }
    }
        
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getKey()!=' ')
            {
            System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
        
    
    // System.out.println(result.toString());
}
}
