package exceptionsWorkshop.level3.firstExample;

import java.util.List;

public class Service {
    /*
    Service has a dependency on storage as described in the diagram
     */
    private final Storage storage;

    public Service(Storage storage){
        this.storage = storage;
    }

    /*
        API of our service, that clients use directly.
     */
    public List<String> getAllUsernames(){
        try{
            return storage.queryUsernames();
        }catch (Exception e){
            System.out.printf("Caught connectivity exception, with trace: %s%n", e);
            /* What to return here?
             Potential results:
                - null: not a good idea to return null. generally speaking. error prone
                - [], Empty list: This is also not a very clear result, since it also might be
                   a reasonable value in a normal flow of execution, specifically when database is empty
                - Rethrow a custom exception, might be a potential solution if we want to notify user of API
                    about the problem that happened. This is also a good idea since database implementation
                    details aren't leaked to the user of service and thus we avoid a leaky abstraction.
            */
            throw new OurServiceException("Couldn't fetch usernames");
        }
    }

    /*
        Define new type of service exception which will be public ( known to the clients of your api )
        This way you'll have one additional channel of communication with the clients ( apart from normal flow return values )
        Using which you can tell user that something unexpected/exceptional happened under the hood.
     */
    public static class OurServiceException extends RuntimeException{
        public OurServiceException(String message) {
            super(message);
        }
    }
}
