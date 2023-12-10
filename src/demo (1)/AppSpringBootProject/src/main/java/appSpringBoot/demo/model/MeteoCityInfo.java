package appSpringBoot.demo.model;

public class MeteoCityInfo {
    private String insee;
    private int cp;
    private String name;
    private double latitude;
    private double longitude;
    private int altitude;

    public String getInsee() {
        return insee;
    }

    public int getCp() {
        return cp;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setInsee(String insee) {
        this.insee = insee;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
