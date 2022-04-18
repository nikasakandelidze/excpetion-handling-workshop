package exceptionsWorkshop.level3.firstExample;

import java.util.List;

public class Storage {
    /*
        Imitates faulty transaction over the network to the storage server
     */
    public List<String> queryUsernames() {
        System.out.println("Querying usernames from the database over the faulty network");
        throw new RuntimeException("Storage connectivity problem arised.");

    }
}
