import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // get RoyalLePage Listings
        ArrayList<Listing> RoyalLePageListings = ListingFactory.get(Site.RoyalLePage);
        System.out.println(RoyalLePageListings.get(0));
        System.out.println(RoyalLePageListings.size());

        // get DuProprio Listings
//        ArrayList<Listing> duproprioListings = ListingFactory.get(Site.DuProprio);
//        System.out.println(duproprioListings.get(0));
//        System.out.println(duproprioListings.size());

        //get Centris Listings
//        ArrayList<Listing> centrisListings = ListingFactory.get(Site.Centris);
//        System.out.println(centrisListings.get(0));
//        System.out.println(centrisListings.size());
    }
}