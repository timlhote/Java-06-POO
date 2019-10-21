public class Wilder {
    private String firstName;
    private boolean aware;


    public Wilder(String firstName) {
        this.firstName = firstName;
        this.aware = false;
    } 
    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public String whoAmI()
    {
        if(this.aware) {
        return "Je m'appelle " + this.firstName + " et je suis aware";
        }
        else
        return"Je m'appelle " + this.firstName + " et je ne suis pas aware";
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return boolean return the aware
     */
    public boolean isAware() {
        return aware;
    }

    /**
     * @param aware the aware to set
     */
    public void setAware(boolean aware) {
        this.aware = aware;
    }
}