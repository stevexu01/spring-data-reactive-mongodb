package start.mongo.reactivestream.repositories;

import start.mongo.reactivestream.documents.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

  Flux<Person> findByFirstName(final String firstName);

  //@Query({})
  Flux<Person> findByFirstNameLike(final String firstNameLike);

  Mono<Person> findOneByFirstName(final String firstName);
}
