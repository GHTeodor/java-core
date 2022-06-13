package lesson1;

public class Start {
    public static void main(String[] args) {

        Post post = new Post();
        post.setUserId(1);
        post.setId(1);
        post.setTitle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
        post.setBody("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        System.out.println(post);

        System.out.println("----------------------------------------------------------------------------------------");

        Comment comment = new Comment(1,
                1,
                "id labore ex et quam laborum",
                "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");

        System.out.println(comment);

    }
}
