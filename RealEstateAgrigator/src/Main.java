import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // get Realtor Listings
        ArrayList<Listing> realtorListings = ListingFactory.get(Site.Realtor);

        // get Centris Listings
//        ArrayList<Listing> centrisListings = ListingFactory.get(Site.Centris);
//        System.out.println(centrisListings.get(0));
//        System.out.println(centrisListings.size());
    }
}