import entity.Customer;
import entity.Item;
import entity.Passport;
import entity.Person;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Runner extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Customer customer = new Customer();
        customer.setId("C-0020");
        customer.setName("Thilina");
        customer.setAddress("Colombo");


        Item item = new Item();
        item.setItemCode("I-0023");
        item.setDescription("jjdj");
        item.setPackSize("12");

        item.setUnitPrice(123.0);

        Person person = new Person();
        person.setId("12342");
        person.setName("Txjejjc");

        Passport passport
                = new Passport();
        passport.setPsId("23322");
        passport.setFee(33.00);
        passport.setPerson(person);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(item);
        session.save(customer);
        session.save(passport);
        session.save(person);

        transaction.commit();
        session.close();










/*save
   delete
   update*/







    }
}
