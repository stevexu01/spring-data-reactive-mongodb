package start.mongo.reactivestream;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import start.mongo.reactivestream.documents.PDRAddSubscription;
import start.mongo.reactivestream.documents.Person;
import start.mongo.reactivestream.repositories.PDRAddSubscriptionRepository;
import start.mongo.reactivestream.repositories.PersonRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final int MAX_RECORDS = 1000000;//0;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private ReactiveMongoTemplate reactiveMongoTemplate;

    @Autowired
    private PDRAddSubscriptionRepository pdrAddSubscriptionRepository;

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String args[]) {
//    insertData();
        printData();

//    withPerson();
    }

    private void printData() {
        long started = System.currentTimeMillis();

        /* ReactiveMongoTemplate - requires  */
//        Query query = new Query();
//        query.addCriteria(Criteria.where("pdrActionType").regex("Add.*"));
//        List<PDRAddSubscription> subscriptions = reactiveMongoTemplate.find(query, PDRAddSubscription.class, "pdr1");
//        System.out.println("Records: " + subscriptions.size()); //1000000

        /* MongoTemplate */
//        Query query = new Query();
//        query.addCriteria(Criteria.where("pdrActionType").regex("Add.*"));
//        List<PDRAddSubscription> subscriptions = mongoTemplate.find(query, PDRAddSubscription.class, "pdr1");
//        System.out.println("Records: " + subscriptions.size()); //1000000
//        System.out.println("Seconds: " + (System.currentTimeMillis() - started));   //36201

        /* MongoRepository */
        List<PDRAddSubscription> pdrs = pdrAddSubscriptionRepository
                .findByPdrActionTypeLike("AddSubs");
        //pdrs.map(PDRAddSubscription::getPdrFeatureSeq).toIterable().forEach(System.out::println); //39144 ms
        System.out.println("Records: " + pdrs.stream().map(PDRAddSubscription::getPdrFeatureSeq).count());   //1000000
        System.out.println("Seconds: " + (System.currentTimeMillis() - started));   //33487
    }

    public static PDRAddSubscription getPdrAddSubscription() {
        try {
            return new ObjectMapper().readValue(Files.lines(Paths.get("./pdrAddSubscription.json")).collect(Collectors.joining("\n")), PDRAddSubscription.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void withPerson() {
        /* insert and retrieve */
//        final Person johnAoe = new Person("john", "aoe", LocalDateTime.now(), "loser", 0);
//        final Person johnBoe = new Person("john", "boe", LocalDateTime.now(), "a bit of a loser", 10);
//        final Person johnCoe = new Person("john", "coe", LocalDateTime.now(), "average", 100);
//        final Person johnDoe = new Person("john", "doe", LocalDateTime.now(), "winner", 1000);
//
//        personRepository.saveAll(Flux.just(johnAoe, johnBoe, johnCoe, johnDoe)).subscribe();

//        personRepository
//                .findOneByFirstName("john")
//                .log()
//                .map(Person::getId)
//                .subscribe(System.out::println);



        /* retrieve only */
        Flux<Person> persons = (Flux<Person>) personRepository
                .findByFirstName("john")
                ;

        persons.toIterable().forEach(System.out::println);

//        persons.flatMap(p -> Mono.just(p.getFirstName()))
//                .toStream().forEach(System.out::println);

        //Async way
//        persons.flatMap(s -> Mono.defer(() -> Mono.just(s.getFirstName())))
//                .toStream().forEach(System.out::println);
    }
}
