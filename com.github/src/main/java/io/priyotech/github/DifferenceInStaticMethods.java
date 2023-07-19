package io.priyotech.github;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**of() will return actual immutable methods*/
public class DifferenceInStaticMethods {
    public static void main(String[] args) {
        List<String> sampleList=Arrays.asList("a","b","c",null);
        List<String> unModifiableList1= Collections.unmodifiableList(sampleList);
        List<String> unModifiableList2=List.of("a","b","c");/**cannot add null here*/
        System.out.println(unModifiableList1);//[a, b, c]
        System.out.println(unModifiableList2);
        sampleList.set(1,"d");
        unModifiableList2.set(1,"x");//UnsupportedOperationException
        System.out.println(unModifiableList1);//[a, d, c]
        System.out.println(unModifiableList2);
    }
}
