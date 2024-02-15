package homework;

public interface Persister {

    public default String getName(String name) {
        return name;
    }

    default void save(String name){
        System.out.println("Save user: " + name);
    }

    default void report(String name){
        System.out.println("Report for user: " + name);
    }

}