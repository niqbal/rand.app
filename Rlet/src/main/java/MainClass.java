import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Created by IntelliJ IDEA.
 * User: niqbal
 * Date: 6/6/11
 * Time: 1:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainClass extends ServerResource {


   public static void main(String[] args) throws Exception {
      // Create the HTTP server and listen on port 8182
      new Server(Protocol.HTTP, 8182, MainClass.class).start();
   }

   @Get
   public String toString() {
      return "hello, world";
   }

}
