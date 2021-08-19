package ai.aprillabs.listingapp.repository;

import ai.aprillabs.listingapp.domain.Listing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends CrudRepository<Listing, Integer> {
	JSONObject Listing = new JSONObject();
	for (id<Listing.length) {
		Listing.put("id",id);
		Listing.put("address",address);
		Listing.put("beds",beds);
		Listing.put("baths",baths);
		Listing.put("price",price);
	}
}
