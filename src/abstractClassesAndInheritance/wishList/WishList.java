package abstractClassesAndInheritance.wishList;
public class WishList extends List implements Sharable, Deletable {
    protected String name;
    protected String[] items;

    public WishList(String name, String[] items) {
        this.name = name;
        this.items = items;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String[] getItems() {
        return items;
    }
    @Override
    public void setItems(String[] items) {
        this.items = items;
    }
    public String shareLink() {
        return "http://localhost/3000/weddingRegistry";
    }
    public String delete() {
        return name + " was deleted";
    }
}
