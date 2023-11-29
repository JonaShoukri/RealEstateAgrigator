public class RealtorBuilder implements IListingBuilder {

    private Listing listing;
    private String rawListing;

    public RealtorBuilder(String rawListing) {
        this.listing = new Listing();
        this.setRawListing(rawListing);
    }

    @Override
    public void setId() {
        this.listing.setId(IdGenerator.generateID());
    }

    @Override
    public void setType() {
        this.listing.setType("Realtor");
    }

    @Override
    public void setSite() {
        this.listing.setSite(Site.Realtor);
    }

    @Override
    public void setSqft() {
        this.listing.setSqft(0.0);
    }

    @Override
    public void setAddress() {
        this.listing.setAddress("Realtor Address");
    }
    @Override
    public void setUrl() {
        this.listing.setUrl(null);
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
        this.rawListing = rawListing;
    }

    @Override
    public Listing getListing() {
        return this.listing;
    }
}