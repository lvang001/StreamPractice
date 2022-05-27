public class Person {
    private String fName;
    private String lName;
    private int bYear;

    Person(String fName, String lName, int bYear) {
        this.fName = fName;
        this.lName = lName;
        this.bYear = bYear;
    }
    

    /**
     * @return String return the fName
     */
    public String getFName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setFName(String fName) {
        this.fName = fName;
    }

    /**
     * @return String return the lName
     */
    public String getLName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setLName(String lName) {
        this.lName = lName;
    }

    /**
     * @return int return the bYear
     */
    public int getBYear() {
        return bYear;
    }

    /**
     * @param bYear the bYear to set
     */
    public void setBYear(int bYear) {
        this.bYear = bYear;
    }

}
