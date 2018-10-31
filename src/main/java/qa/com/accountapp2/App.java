package qa.com.accountapp2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException
    {
        System.out.println( "Hello World!" );
        
        Account acc = new Account("Mozi","sdfgbjsbhfi","456462");
        AccountService service = new AccountService();
        service.addAccount(acc);
        System.out.println(service.viewMap());
  System.out.println( service.ConvertOjSON(service.viewMap()));
        

        
    }
    }