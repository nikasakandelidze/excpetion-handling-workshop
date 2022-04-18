package exceptionsWorkshop.level3.firstExample;

import java.util.List;

public class Storage {
    public List<String> queryUsernames(){
        throw new RuntimeException("Storage connectivity problem arised.");
    }
}
