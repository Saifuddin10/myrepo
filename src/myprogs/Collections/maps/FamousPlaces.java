package myprogs.Collections.maps;

public class FamousPlaces {
    private String placeName;
    private String placeAddress;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress;
    }

    public FamousPlaces(String placeName, String placeAddress) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
    }

    public FamousPlaces() {
    }

    @Override
    public String toString() {
        return "FamousPlaces : " +
                " : placeName='" + placeName + '\'' +
                " : placeAddress='" + placeAddress + '\'';
    }
}
