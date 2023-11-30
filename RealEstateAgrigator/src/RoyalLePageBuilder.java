import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class RoyalLePageBuilder implements IListingBuilder {

    private Listing listing;

    public RoyalLePageBuilder(String rawListing) {
        this.listing = new Listing();
        this.listing.setRawListing(rawListing);
    }

    @Override
    public void setId() {
        this.listing.setId(IdGenerator.generateID());
    }

    @Override
    public void setType() {
        Document doc = Jsoup.parse(this.listing.getRawListing());
        Element listingMeta = doc.selectFirst("div.listing-meta span");

        this.listing.setType((listingMeta != null) ? listingMeta.text() : "Type not found");
    }

    @Override
    public void setSite() {
        this.listing.setSite(Site.RoyalLePage);
    }


    @Override
    public void setAddress() {
        this.listing.setAddress("RoyalLePage Address");
        Document document = Jsoup.parse(this.listing.getRawListing());
        Element addressElement = document.selectFirst("address[class=address-1] a");
        this.listing.setAddress(addressElement != null ? addressElement.text() : "Address not found");
    }

    @Override
    public void setUrl() {
        Document doc = Jsoup.parse(this.listing.getRawListing());
        Element linkElement = doc.select("div.card__body address.address-1 a").first();
        this.listing.setUrl(linkElement.attr("href"));
    }

    @Override
    public void setNumBedrooms() { this.listing.setNumBedrooms(0);}

    @Override
    public void setNumBathrooms() { this.listing.setNumBathrooms(0);}

    @Override
    public void setSqft() {
        this.listing.setSqft(0.0);
    }

    @Override
    public void setPrice() {
        Document doc = Jsoup.parse(this.listing.getRawListing());
        Element priceElement = doc.selectFirst("span.title--h3.price");

        if (priceElement != null) {
            String priceText = priceElement.text().replaceAll("[^\\d,]", "").replace(",", "");
            this.listing.setPrice(Double.parseDouble(priceText));
        } else {
            this.listing.setPrice(0.0);
        }
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
