package io.priyotech.github;

public interface PrivateMethodInInterface {

    default void checkConditionOne(Long n){
        commonDataCheck(n);
        System.out.println("method>>>checkConditionOne starts");
        System.out.println(n<200L?"Valid Value":"Invalid Value!");
        System.out.println("method>>>checkConditionOne completes\n");
    }

    default void checkConditionTwo(Long n){
        commonDataCheck(n);
        System.out.println("method>>>checkConditionTwo starts");
        System.out.println(n>100L?"Valid Value":"Invalid Value!");
        System.out.println("method>>>checkConditionTwo completes\n");
    }
    /**If we are not allowing end user to access this method we can mark this as private and common
     * functionality between more than one default method lies here */
    private void commonDataCheck(Long n){
        System.out.println("method>>>commonDataCheck");
        System.out.println(n != null && n >0L ?"Valid Long Value":"invalid Long value");
    }
}

class PrivateMethodInInterfaceImpl implements PrivateMethodInInterface{
    public static void main(String[] args) {
        PrivateMethodInInterfaceImpl instance=new PrivateMethodInInterfaceImpl();
        instance.checkConditionOne(120L);
        instance.checkConditionTwo(220L);
    }
}
