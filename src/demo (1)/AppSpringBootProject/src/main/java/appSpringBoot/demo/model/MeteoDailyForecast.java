package appSpringBoot.demo.model;

public class MeteoDailyForecast {
    private String insee;
    private int cp;
    private double latitude;
    private double longitude;
    private int day;
    private String datetime;
    private int wind10m;
    private int gust10m;
    private int dirwind10m;
    private double rr10;
    private double rr1;
    private int probarain;
    private int weather;
    private int tmin;
    private int tmax;
    private int sunHours;
    private int etp;
    private int probafrost;
    private int probafog;
    private int probawind70;
    private int probawind100;
    private int gustx;

    public String getInsee() {
        return insee;
    }

    public int getCp() {
        return cp;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getDay() {
        return day;
    }

    public String getDatetime() {
        return datetime;
    }

    public int getWind10m() {
        return wind10m;
    }

    public int getGust10m() {
        return gust10m;
    }

    public int getDirwind10m() {
        return dirwind10m;
    }

    public double getRr10() {
        return rr10;
    }

    public double getRr1() {
        return rr1;
    }

    public int getProbarain() {
        return probarain;
    }

    public int getWeather() {
        return weather;
    }

    public int getTmin() {
        return tmin;
    }

    public int getTmax() {
        return tmax;
    }

    public int getSunHours() {
        return sunHours;
    }

    public int getEtp() {
        return etp;
    }

    public int getProbafrost() {
        return probafrost;
    }

    public int getProbafog() {
        return probafog;
    }

    public int getProbawind70() {
        return probawind70;
    }

    public int getProbawind100() {
        return probawind100;
    }

    public int getGustx() {
        return gustx;
    }

    public void setInsee(String insee) {
        this.insee = insee;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setWind10m(int wind10m) {
        this.wind10m = wind10m;
    }

    public void setGust10m(int gust10m) {
        this.gust10m = gust10m;
    }

    public void setDirwind10m(int dirwind10m) {
        this.dirwind10m = dirwind10m;
    }

    public void setRr10(double rr10) {
        this.rr10 = rr10;
    }

    public void setRr1(double rr1) {
        this.rr1 = rr1;
    }

    public void setProbarain(int probarain) {
        this.probarain = probarain;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public void setTmin(int tmin) {
        this.tmin = tmin;
    }

    public void setTmax(int tmax) {
        this.tmax = tmax;
    }

    public void setSunHours(int sunHours) {
        this.sunHours = sunHours;
    }

    public void setEtp(int etp) {
        this.etp = etp;
    }

    public void setProbafrost(int probafrost) {
        this.probafrost = probafrost;
    }

    public void setProbafog(int probafog) {
        this.probafog = probafog;
    }

    public void setProbawind70(int probawind70) {
        this.probawind70 = probawind70;
    }

    public void setProbawind100(int probawind100) {
        this.probawind100 = probawind100;
    }

    public void setGustx(int gustx) {
        this.gustx = gustx;
    }
}
