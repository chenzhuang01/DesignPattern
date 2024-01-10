package ProxyPattern.component.impl;

import ProxyPattern.component.Image;

/**
 * @author cz
 * @Date 2024/1/5 10:52
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
