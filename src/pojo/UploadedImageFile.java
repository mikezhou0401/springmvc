package pojo;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
