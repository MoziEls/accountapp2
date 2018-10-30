package qa.com.accountapp2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Account acc = new Account("Mozi","ELSAYED",45646);
        AccountService service = new AccountService();
        service.addAccount(acc);
        System.out.println(service.viewMap());
        
        
    }
}
