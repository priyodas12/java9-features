package io.priyotech.github;

import java.sql.Array;
import java.util.*;

/**of() will return actual immutable methods*/
public class DifferenceInStaticMethods {
    public static void main(String[] args) {
        /**Java-8 Approach*/
        List<String> sampleList=Arrays.asList("a","b","c",null);
        List<String> unModifiableList1= Collections.unmodifiableList(sampleList);

        /**Java-9 Enhancement in List*/
        List<String> unModifiableList2=List.of("a","b","c");/**cannot add null here*/
        System.out.println(unModifiableList1);//[a, b, c]
        System.out.println(unModifiableList2);
        sampleList.set(1,"d");
        //unModifiableList2.set(1,"x");//UnsupportedOperationException
        System.out.println(unModifiableList1);//[a, d, c]
        System.out.println(unModifiableList2);

        /**Java-8 in Set*/
        Set<String> strSet=new HashSet<>();
        strSet.addAll(Arrays.asList("12","13","14","12"));
        System.out.printf("strSet : %s ,",strSet);
        Set<String> unmodifiableSet=Collections.unmodifiableSet(strSet);
        System.out.printf("unmodifiableSet : %s",unmodifiableSet);

    }
}
