package j13_genCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// ** HashMap 의 순차처리 ( Iterator , Entry ) 
// 1) 키와 값 같이 읽어 순차처리
// 2) 키와 값을 따로 읽어 순차처리

//*** 해싱과 해시함수 => 정석 651p
//해싱 => 해시 함수를 이용해서 데이터를 해시 테이블에 저장하고
//     검색하는 기법

//*** Map ( Key, Value )
//=> HashMap (Key 값의 중복을 허용하지 않고, 순서 유지를 보장받지 못한다.) 
//=> TreeMap (Key 값의 중복을 허용하지 않고, 키값으로 오름차순 정렬이 된다.)
//=> LinkedHashMap (Key 값의 중복을 허용하지 않고, 입력순서 유지를 보장받는다.)

//*** HashMap : Key, Value 정보 지정
//=> key 는 유일, Value 는 중복 허용 
//=> null 값 허용 map.put(null, null) 또는 map.get(null) 가능
public class Ex10_HashMapIterator {

   public static void main(String[] args) {
      // <이름, 점수>
      HashMap<String,Integer> hm= new HashMap<String,Integer>();
      hm.put("구준표", 80);
      hm.put("홍길동", 90);
      hm.put("금잔디", 70);
      hm.put("유지오", 50);
      hm.put("구영표", 60);
      
      // 1) 키와 값 같이 읽어 순차처리 
      // => HashMap -> Set : entrySet()  
      //    키와 값 을 같이 읽어  하나의 데이터(entry) 로 Set에 저장
      
      // ***
      // <?> => 모든 자료형 을 의미 , 내부적으로는 Object
      // <? super 객체형 > => 명시된 객체형의 상위 객체
      // <? extends 객체형 > => 명시된 객체형과 객체형을 상속한 하위 객체
      
      Set<?> set = hm.entrySet();
      System.out.println("Set entrySet():"+set);
      // => Set : Iterator 적용 가능
      Iterator<?> it = set.iterator();
      while (it.hasNext()) { // hasNext() : 확인
         //System.out.println("while : "+it.next()); // next() : data 읽어옴
         // Key 와 Value 를 구별하고 싶은 경우
         // => Entry 를 Key 와 Value 로 구별
         Map.Entry<?,?> e= (Map.Entry<?,?>)it.next();
         // 인스턴스 e 를 통해 key 와 value get 가능
         System.out.println("Key:"+e.getKey()+" , value:"+e.getValue());
      } // while
      
      // 2) 키와 값을 따로 읽어 순차처리
      // => HashMap -> Set : keySet()
      // 2.1) key값 가져오기
      set = hm.keySet();
      System.out.println("Set keySet():"+set);
       
      // 2.2) value값 가져오기
      Collection<Integer> values=hm.values(); // Map 의 value 들을 return 하는 메서드 
      // Collection -> Iterator : 순차처리 위해 
      it = values.iterator();
      //it = hm.values().iterator();
      // 합계, 평균계산 하기
      int sum=0;
      while (it.hasNext()) {
//         Integer i = (Integer)it.next();
//         sum+= i.intValue()  ;  // Integer -> int : 생략가능
         sum+=(Integer)it.next();
      }
      System.out.println("합계:"+sum);
      System.out.println("평균:"+(float)(sum/hm.size()));
      System.out.println("최고점:"+ Collections.max(values));
      System.out.println("최저점:"+ Collections.min(values));
       
   } // main
} // class

// Map 인터페이스는 내부에 내부인터페이스 Entry를 가지고 있고, 
// Object key, Object value는 Entry 인터페이스에 선언되어 있음.
// 그러므로 Map의 key와 value는 각각의 Object 이며 Map.Entry타입으로 저장됨. 
// 그래서 Map의 key와 value에 접근 할때는
// => 먼저 Map의 인스턴스에서 entrySet으로 키와 value를 둘다 가져온다. 
// => entrySet은 Set타입이므로 Set타입 인스턴스에 저장
// => Set타입으로 가져온 인스턴스에서 iterator()메소드 호출해서 iterator가져옴
// => 얻어온 iterator에서 hasNext메소드를 호출하여 HashMap 내부 요소에 접근.
// => HashMap의 각 key와 value값은 결국 Map.Entry 타입의 배열에 들어있으므로    
//      HashMap에서 각 key와 value값에 접근하기위해서는  
//      Map.Entry 타입 인스턴스에 iterator의 next()메소드로 key와 value값 가져온다.