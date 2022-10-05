package yandex.sprint8.CreateAPI.task3;

import com.google.gson.Gson;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Practicum {
    public static void main(String[] args) {
        UserPost post = new UserPost();
        post.setPhotoUrl("https://new-social-network.site/images/928476864.jpg");
        post.setUserId(97_748);
        post.setDescription("Классное фото!");
        post.setLikesQuantity(753);

        // сконвертируйте publicationDateString в экземпляр LocalDate
        String publicationDateString = "25--12--2020";

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd--MM--yyyy");
        LocalDate publicationDate = LocalDate.parse(publicationDateString, inputFormatter);
        post.setPublicationDate(publicationDate);

        // создайте экземпляр Gson
        Gson gson = new Gson();
        // сериализуйте объект
        String postSerialized = gson.toJson(post);
        System.out.println("Serialized post: " + postSerialized);

        // десериализуйте объект
        UserPost postDeserialized = gson.fromJson(postSerialized, UserPost.class);
        System.out.println("Deserialized post: " + postDeserialized);
    }
}


class UserPost {
    // URL-адрес, по которому можно скачать фото
    private String photoUrl;

    // дата публикации
    private LocalDate publicationDate;

    // уникальный идентификатор автора поста
    private int userId;

    // текстовой комментарий к фото
    private String description;

    // сколько пользователей поставило лайк этому посту
    private int likesQuantity;


    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLikesQuantity() {
        return likesQuantity;
    }

    public void setLikesQuantity(int likesQuantity) {
        this.likesQuantity = likesQuantity;
    }


    @Override
    public String toString() {
        return "UserPost{" +
                "photoUrl='" + photoUrl + '\'' +
                ", publicationDate=" + publicationDate +
                ", userId=" + userId +
                ", description='" + description + '\'' +
                ", likesQuantity=" + likesQuantity +
                '}';
    }
}