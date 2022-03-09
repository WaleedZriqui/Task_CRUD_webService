import com.sun.net.httpserver.HttpServer;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;

import java.io.IOException;
import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


public class CRUD {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:9994/");
        server.start();

        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9994/CRUD");
        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
    }
}
