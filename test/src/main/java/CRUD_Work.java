import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("CRUD")
public class CRUD_Work {
    PersonList list = new PersonList();

    @GET
    @Path("allPersons")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Person> getAll() {
        return list.getAllPersons();
    }

    @GET
    @Path("person/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("id") int id) {
        return list.getPersonUsingID(id);
    }

    @POST
    @Path("addNew")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void addPerson(Person person) {
        list.postPerson(person);
    }

    @PUT
    @Path("update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void updatePerson(Person person) {
        list.updatePerson(person);
    }

    @DELETE
    @Path("delete/{id}")
    public void deletePerson(@PathParam("id") int id) {
        list.deletePersonUSINGID(id);
    }
}
