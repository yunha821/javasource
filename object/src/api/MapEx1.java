package api;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {

        // <key 타입, value 타입>
        Map<String, String> map = new HashMap<>();

        // 추가 : put()
        map.put("myId", "1234");
        map.put("asdf", "1234");
        map.put("asdf", "1111");

        // 특정 key에 해당하는 value 가져오기
        System.out.println("myId value : " + map.get("myId"));
        System.out.println("myId 포함 여부 : " + map.containsKey("myId"));
        System.out.println("1111 포함 여부 : " + map.containsValue("1111"));

        // 전체 key만 가져오기 (중복 X)
        Set<String> set = map.keySet();

        // 전체 value 만 가져오기 (중복 O)
        Collection<String> values = map.values();
        System.out.println(values);

        // map 요소 접근
        // 방법1
        Set<Entry<String, String>> set2 = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set2.iterator();
        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 방법2
        // key만 Iterator로 변경
        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            String id = iterator2.next();
            String value = map.get(id);
            System.out.println(id + " : " + value);
        }

    }

}
