package padroes_de_projeto.padroes_GOF.observer;

import java.util.ArrayList;
import java.util.List;

public class Journalist implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String title,summary, image,text;

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public void publish(String title, String summary, String image, String text){
        this.title = title;
        this.summary = summary;
        this.image = image;
        this.text = text;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(this));
    }

    @Override
    public String toString() {
        return "Journalist{" +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", image='" + image + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
