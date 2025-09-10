package org.tasks.movieapi.Repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.tasks.movieapi.Models.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {


}
