package start.mongo.reactivestream.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import start.mongo.reactivestream.documents.PDRAddSubscription;

import java.util.List;

public interface PDRAddSubscriptionRepository extends MongoRepository<PDRAddSubscription, String> {

  List<PDRAddSubscription> findByPdrActionType(final String pdrActionType);

  List<PDRAddSubscription> findByPdrActionTypeLike(final String pdrActionType);

  PDRAddSubscription findOneByXCorrelationID(final String xCorrelationId);
}
