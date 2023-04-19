package abstractClassesAndInheritance.wishList;
public class List {
    protected String name;
    protected String[] items;
    protected int id;

    public List() {}
    public List(String name, String[] items, int id) {
        this.name = name;
        this.items = items;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getItems() {
        return items;
    }
    public void setItems(String[] items) {
        this.items = items;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getID() {
        return id;
    }
}
