public class ProjectBook {
    private String title;
    private String description;

    public ProjectBook() {
        title = "unnamed";
        description = "No description";
    }
    
    public ProjectBook(String name, String desc) {
       title = name;
       desc = description;
    }

    // GETTERS
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    // SETTERS
    public void setTitle(String name) {
        title = name;
    }
    
    public void SetDescription(String desc) {
        description = desc;
    }
}

