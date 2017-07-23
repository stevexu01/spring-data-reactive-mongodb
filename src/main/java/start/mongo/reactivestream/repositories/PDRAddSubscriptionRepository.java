package start.mongo.reactivestream.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import start.mongo.reactivestream.documents.PDRAddSubscription;

import java.util.List;

public interface PDRAddSubscriptionRepository extends /*Reactive*/MongoRepository<PDRAddSubscription, String> {

  /*Flux<PDRAddSubscription> findByPdrActionType(final String pdrActionType);

  Flux<PDRAddSubscription> findByPdrActionTypeLike(final String pdrActionType);

  Mono<PDRAddSubscription> findOneByXCorrelationID(final String xCorrelationId);*/

  List<PDRAddSubscription> findByPdrActionType(final String pdrActionType);

  List<PDRAddSubscription> findByPdrActionTypeLike(final String pdrActionType);

  PDRAddSubscription findOneByXCorrelationID(final String xCorrelationId);
}
