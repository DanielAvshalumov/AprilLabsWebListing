package ai.aprillabs.listingapp.service;

import ai.aprillabs.listingapp.domain.Listing;
import ai.aprillabs.listingapp.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListingService {

    private final ListingRepository listingRepository;

    @Autowired
    public ListingService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

    public Listing createListing(Listing listing) {
        return listingRepository.save(listing);
    }
    
    public Listing deleteListing(Integer id) {
    	return listingRepositary.deleteById(id);
    }

    public Optional<Listing> getListing(Integer id) {
        return listingRepository.findById(id);
    }
}
