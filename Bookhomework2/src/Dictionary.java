public class Dictionary extends Book{

    private String Edition;

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }

    public Dictionary(int pages, String name, String Edition) {
        super(pages,name);
        this.Edition = Edition;
    }


}
