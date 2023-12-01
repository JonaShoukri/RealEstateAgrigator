import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class CentrisBuilder implements IListingBuilder {

    private Listing listing;

    public CentrisBuilder(String rawListing) {
        this.listing = new Listing();
        this.setRawListing(rawListing);
    }

    @Override
    public void setId() {
        this.listing.setId(IdGenerator.generateID());
    }

    @Override
    public void setType() {
        this.listing.setType("Centris");
    }

    @Override
    public void setSite() {
        this.listing.setSite(Site.Centris);
    }

    @Override
    public void setSqft() {
        this.listing.setSqft(0.0);
    }

    @Override
    public void setAddress() {
        this.listing.setAddress("Centris Address");
    }
    @Override
    public void setUrl() {
        this.listing.setUrl("");
    }

    @Override
    public void setNumBedrooms() {
        this.listing.setNumBedrooms(0);
    }

    @Override
    public void setNumBathrooms() {
        this.listing.setNumBathrooms(0);
    }

    @Override
    public void setPrice() {
        this.listing.setPrice(0.0);
    }

    @Override
    public void setRawListing(String rawListing) {
        this.listing.setRawListing(rawListing);
    }

    @Override
    public Listing getListing() {
        return this.listing;
    }
}
