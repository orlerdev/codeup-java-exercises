package abstractClassesAndInheritance.wishList;
public class PrivateList extends List implements Deletable{
    public PrivateList() {}
    public PrivateList(String name, String[] items, int id) {
        super(name, items, id);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public String[] getItems() {
        return super.getItems();
    }
    @Override
    public void setItems(String[] items) {
        super.setItems(items);
    }
    @Override
    public int getId() {
        return super.getId();
    }
    @Override
    public void setId(int id) {
        super.setId(id);
    }
    @Override
    public int getID() {
        return super.getID();
    }
    public String delete(){
        return name + " was deleted";
    }
}
