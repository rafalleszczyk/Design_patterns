package design.patterns;

import design.patterns.factory.WebsiteFactory;
import design.patterns.factory.enums.WebsiteType;
import design.patterns.factory.websites.Website;

/**
 * Concept
    - Doesnt expose instantiation logic.
    - Defer to subclasses.
    - Common interface.
    - Specified by architecture, implemented by user.
 * Design
    - Factory reponsible for lifecycle
    _ Concrete classes
    - Parameterized create method
    -
 * **/
public class Main {

    public static void main(String[] args) {


        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(website.getPages());
    }
}
