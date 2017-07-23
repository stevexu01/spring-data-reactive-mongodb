//to run: > mongo test find-pdr.js
//db.getCollection('pdr1').find({pdrFeatureSeq:{$gt: 0}}).count()

var start = new Date().getTime();
//db.getCollection('pdr1').find({pdrActionType:/Add/}).count()                    //3425 ms
//db.getCollection('pdr1').find({}).count()                                       //1 ms
//db.getCollection('pdr1').find({pdrActionType:'AddSubscription'}).count()        //3219 ms
db.getCollection('pdr1').find({$or:[{pdrActionType:'AddSubscription'},{pdrActionType:'ModifySubscription'}]}).count()   //4649 ms
print ((new Date().getTime()) - start )

