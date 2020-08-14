package design.patterns.factory.websites;

import design.patterns.factory.pages.Cart;
import design.patterns.factory.pages.Contact;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new Cart());
        pages.add(new Contact());
    }
}
