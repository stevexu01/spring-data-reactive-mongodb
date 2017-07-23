package start.mongo.reactivestream.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import start.mongo.reactivestream.documents.PDRAddSubscription;

public interface PDRAddSubscriptionRepository extends ReactiveMongoRepository<PDRAddSubscription, String> {

  Flux<PDRAddSubscription> findByPdrActionType(final String pdrActionType);

  Flux<PDRAddSubscription> findByPdrActionTypeLike(final String pdrActionType);

  Mono<PDRAddSubscription> findOneByXCorrelationID(final String xCorrelationId);
}
