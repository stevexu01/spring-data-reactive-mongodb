package start.mongo.reactivestream;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
    private PDRAddSubscriptionRepository pdrAddSubscriptionRepository;

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String args[]) {
//    insertData();

    printData();

//        withPerson();
    }

    private void printData() {
        long started = System.currentTimeMillis();
        System.out.println(" -------------- add ------------- ");
//    System.out.println(pdrAddSubscriptionRepository
////            .findByPdrActionTypeLike("AddSubs") //31293 ms
//            .findByPdrActionType("AddSubscription") //29506 ms
//            .count().block());

        Flux<PDRAddSubscription> pdrs = pdrAddSubscriptionRepository
                .findByPdrActionTypeLike("AddSubs");

        //pdrs.map(PDRAddSubscription::getPdrFeatureSeq).toIterable().forEach(System.out::println); //39144 ms

        System.out.println("Records: " + pdrs.count().block()); //1000000, in 25882 ms


//    System.out.println(" -------------- modify ------------- ");
//    pdrAddSubscriptionRepository.findByPdrActionTypeLike("ModifySubscription")
//            .log()
//            .map(PDRAddSubscription::getPdrFeatureSeq)
//            .subscribe(System.out::println);
//
//    System.out.println(" -------------- delete ------------- ");
//    pdrAddSubscriptionRepository.findByPdrActionTypeLike("DeleteSubscription")
//            .log()
//            .map(PDRAddSubscription::getPdrFeatureSeq)
//            .subscribe(System.out::println);

        System.out.println("Seconds: " + (System.currentTimeMillis() - started));
    }

    private void insertData() {
        Iterable iterable = new Iterable() {
            List<Person> persons = new ArrayList<>();
            List<PDRAddSubscription> pdrAddSubscriptions = new ArrayList<>();

            //      @Override
            public Iterator iterator() {
                for (int i = 0; i < MAX_RECORDS; i++) {
                    PDRAddSubscription pdrRecord = getPdrAddSubscription();
                    pdrRecord.setPdrBAN(pdrRecord.getPdrBAN() + i);
                    pdrRecord.setPdrSocID(pdrRecord.getPdrSocID() + i);
                    pdrAddSubscriptions.add(pdrRecord);

                }
                return pdrAddSubscriptions.iterator();
            }
        };

        pdrAddSubscriptionRepository.saveAll(Flux.fromIterable(iterable)).subscribe();
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
