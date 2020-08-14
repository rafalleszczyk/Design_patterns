package design.patterns.factory;

import design.patterns.factory.enums.WebsiteType;
import design.patterns.factory.websites.Blog;
import design.patterns.factory.websites.Shop;
import design.patterns.factory.websites.Website;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
