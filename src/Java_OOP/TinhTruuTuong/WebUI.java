package Java_OOP.TinhTruuTuong;

public abstract class WebUI extends Actions implements ActionInterface{
    @Override
    public void openURL(String url) {
        System.out.println("Open url:" + url);
    }

    @Override
    public void setText(String text) {
        System.out.println("Settext");
    }

    @Override
    public void setText(String text, String keys) {
        System.out.println("Set text:" +text);
        System.out.println("Input key:" + keys);
    }
}
