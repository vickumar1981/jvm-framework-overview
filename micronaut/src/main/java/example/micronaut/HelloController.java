package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import example.micronaut.model.*;

@Controller("/hello")
public class HelloController {
    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public HelloWorldResponse index() {
        return new HelloWorldResponse("Hello World");
    }
}
