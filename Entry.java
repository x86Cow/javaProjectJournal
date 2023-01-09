public class Entry {
    private String entryName;
    private String entryMain;


    public Entry() {
        entryName = "unnamed";
        entryMain = "no information";
        // date
    }

    public Entry(String name, string main) {
        entryName = name;
        entryMain = main;
    }

    public String getEntryName() {
        return entryName;
    }
    
    public String getEntryMain() {
        return entryMain;
    }

    public void setEntryName(String name) {
        entryName = name;
    }

    public void setEntryMain(String main) {
        entryMain = main;
    }
