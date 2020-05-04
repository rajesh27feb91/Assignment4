package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.model.Tag;
import ImageHoster.repository.CommentRepository;
import ImageHoster.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    // Fetch all the comments posted for an particular Image
    public List<Comment> findComment(Image image) {
        return commentRepository.findComment(image);
    }

    // Persist the comment entered by the user in database

    public void createComment(Comment comment) {
        commentRepository.createComment(comment);
    }
}
