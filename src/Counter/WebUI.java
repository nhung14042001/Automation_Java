package Counter;

public class WebUI {
    public static void openURL(String url) {
        System.out.println(url);
    }

    public static void clickElement(String elementName) {
        System.out.println("Click element: " + elementName);
    }
    public static void setText (String text){
        System.out.println("Set text:"+ text);
    }
    public static String getElementText (String elementName){
        return "text";
    }

    public static void main(String[] args) {

    }
}

