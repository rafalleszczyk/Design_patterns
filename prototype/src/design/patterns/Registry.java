package design.patterns;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Movie");
        movie.setPrice(21.22);
        movie.setRuntime("1 hour");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(100);
        book.setPrice(20.99);
        book.setTitle("Book");
        items.put("Book", book);
    }
}
