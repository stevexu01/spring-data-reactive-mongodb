package start.mongo.reactivestream.repositories;

<<<<<<< HEAD
import org.springframework.data.mongodb.repository.MongoRepository;
=======
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
>>>>>>> 4f0f002d5fa460a1416569860c7e618e03dd67e4
import start.mongo.reactivestream.documents.PDRAddSubscription;

public interface PDRAddSubscriptionRepository extends ReactiveMongoRepository<PDRAddSubscription, String> {

<<<<<<< HEAD
public interface PDRAddSubscriptionRepository extends MongoRepository<PDRAddSubscription, String> {

  List<PDRAddSubscription> findByPdrActionType(final String pdrActionType);

  List<PDRAddSubscription> findByPdrActionTypeLike(final String pdrActionType);

  PDRAddSubscription findOneByXCorrelationID(final String xCorrelationId);
=======
  Flux<PDRAddSubscription> findByPdrActionType(final String pdrActionType);

  Flux<PDRAddSubscription> findByPdrActionTypeLike(final String pdrActionType);

  Mono<PDRAddSubscription> findOneByXCorrelationID(final String xCorrelationId);
>>>>>>> 4f0f002d5fa460a1416569860c7e618e03dd67e4
}
