package entity;

public class SafeDepositHours {
    private String openingtime;
    private String dayoftheweek;
    private String closingtime;

    public String getOpeningtime() {
        return openingtime;
    }

    public void setOpeningtime(String openingtime) {
        this.openingtime = openingtime;
    }

    public String getDayoftheweek() {
        return dayoftheweek;
    }

    public void setDayoftheweek(String dayoftheweek) {
        this.dayoftheweek = dayoftheweek;
    }

    public String getClosingtime() {
        return closingtime;
    }

    public void setClosingtime(String closingtime) {
        this.closingtime = closingtime;
    }

}
