package abstractClassesAndInheritance.wishList;
public class Main {
    public static void main(String[] args) {
        WishList newWishList = new WishList("Wedding Registry", new String[]{"Baby Carriage", "Toaster", "Fondu Kit"});
        String newShareLink = newWishList.shareLink();
        System.out.printf("""
                          %s has a new shareable link of %s
                          """, newWishList.getName(), newWishList.shareLink());
    }
}
